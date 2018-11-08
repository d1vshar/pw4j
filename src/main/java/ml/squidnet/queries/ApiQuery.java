package ml.squidnet.queries;

import ml.squidnet.PoliticsAndWarAPIException;
import ml.squidnet.domains.Entity;
import ml.squidnet.domains.Response;
import ml.squidnet.enums.QueryURL;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiQuery<T extends Entity> {

  private String urlStr;
  private T t;

  ApiQuery(String urlStr, T t) {
    this.urlStr = urlStr;
    this.t = t;
  }

  private static String convertStreamToString(java.io.InputStream is) {
    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
    return s.hasNext() ? s.next() : "";
  }

  public Response execute(boolean testServerMode) {
    String baseUrl = testServerMode ? QueryURL.TEST_URL.getUrl() : QueryURL.LIVE_URL.getUrl();
    urlStr = baseUrl.concat(urlStr);

    HttpURLConnection conn = null;
    try {
      URL url = new URL(urlStr);
      conn = (HttpURLConnection) url.openConnection();
      conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36");
      conn.setRequestMethod("GET");
      int respCode = conn.getResponseCode();
      String respMessage = String.format("Politics and War API returned '%s' from url: %s",respCode + " " + conn.getResponseMessage(),urlStr);

      InputStream stream = conn.getErrorStream();

      if (stream == null) {
        stream = conn.getInputStream();
        return new Response<>(convertStreamToString(stream), t);
      } else {
        throw new PoliticsAndWarAPIException(respMessage);
      }
    } catch (IOException e) {
      throw new PoliticsAndWarAPIException(e);
    } finally {
      if(conn != null) {
        conn.disconnect();
      }
    }
  }
}
