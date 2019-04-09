package io.github.adorableskullmaster.pw4j.scrape;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class PoliticsAndWarClient {
  private final String email;
  private final String password;
  private final boolean rememberMe;
  private final CloseableHttpClient client;
  private boolean loggedIn;

  protected PoliticsAndWarClient(String email, String password, boolean rememberMe) {
    this.email = email;
    this.password = password;
    this.rememberMe = rememberMe;
    this.client = HttpClients.createDefault();
  }

  public abstract void execute() throws IOException;

  private void login() throws IOException {
    if (email == null || password == null || email.isEmpty() || password.isEmpty())
      throw new PoliticsAndWarClientException("No Username or Password given.");

    List<NameValuePair> params = new ArrayList<>();
    params.add(new BasicNameValuePair("email", email));
    params.add(new BasicNameValuePair("password", password));
    params.add(new BasicNameValuePair("loginform", "Login"));
    if (rememberMe)
      params.add(new BasicNameValuePair("rememberme", "1"));

    post("https://politicsandwar.com/login", params, false);
    loggedIn = true;
    System.out.println("Logged In");
  }

  protected void post(String url, List<NameValuePair> params, boolean needsToBeLoggedIn) throws IOException {
    if (needsToBeLoggedIn && !loggedIn)
      login();

    HttpPost httpPost = new HttpPost(url);
    httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36");
    httpPost.setEntity(new UrlEncodedFormEntity(params));

    client.execute(httpPost);
  }

  private String get(String url, List<NameValuePair> params, boolean needsToBeLoggedIn) throws IOException {
    if (needsToBeLoggedIn && !loggedIn)
      login();

    String s;

    if (!params.isEmpty())
      s = params.stream().map(nameValuePair -> nameValuePair.getName() + "=" + encodeValue(nameValuePair.getValue()))
          .collect(Collectors.joining("&", url + "?", ""));
    else
      s = url;

    HttpGet httpGet = new HttpGet(s);
    httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36");

    CloseableHttpResponse httpResponse = client.execute(httpGet);
    return new BasicResponseHandler().handleResponse(httpResponse);
  }

  private String encodeValue(String value) {
    try {
      return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return "";
  }

  protected String getToken(int aid) throws IOException {
    String s = get("https://politicsandwar.com/alliance/id=" + aid + "&display=bank", new ArrayList<>(), true);
    System.out.println(s);
    Document document = Jsoup.parse(s);
    Element element = document.selectFirst("input[name='token']");
    return element.attr("value");
  }

  public void close() throws IOException {
    client.close();
  }
}
