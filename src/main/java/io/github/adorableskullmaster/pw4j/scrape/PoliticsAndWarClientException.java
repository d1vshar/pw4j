package io.github.adorableskullmaster.pw4j.scrape;

public class PoliticsAndWarClientException extends RuntimeException {
  public PoliticsAndWarClientException() {
    super();
  }

  public PoliticsAndWarClientException(String message) {
    super(message);
  }

  public PoliticsAndWarClientException(Throwable cause) {
    super(cause);
  }

  public PoliticsAndWarClientException(String message, String url) {
    super(message + ". URL OF REQUEST: " + url);
  }
}
