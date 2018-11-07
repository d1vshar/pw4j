package ml.squidnet.queries;

import ml.squidnet.PoliticsAndWarAPIException;
import ml.squidnet.domains.Entity;
import ml.squidnet.domains.Response;

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

  public Response execute() {
    HttpURLConnection conn = null;
    try {
      URL url = new URL(urlStr);
      conn = (HttpURLConnection) url.openConnection();
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
