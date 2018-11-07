package ml.squidnet;

public class PoliticsAndWarAPIException extends RuntimeException {
  public PoliticsAndWarAPIException() {
    super();
  }

  public PoliticsAndWarAPIException(String message) {
    super(message);
  }

  public PoliticsAndWarAPIException(Throwable cause) {
    super(cause);
  }

  public PoliticsAndWarAPIException(String message, Throwable cause) {
    super(message, cause);
  }
}
