package ml.squidnet;

public class PoliticsAndWarBuilder {

  private boolean testServerMode;
  private String apiKey;
  private boolean enableCache;

  public PoliticsAndWarBuilder() {
    this.enableCache = false;
    this.apiKey = null;
    this.testServerMode = false;
  }

  public PoliticsAndWarBuilder setApiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public PoliticsAndWarBuilder setTestServerMode(boolean testServerMode) {
    this.testServerMode = testServerMode;
    return this;
  }

  public PoliticsAndWar build() {
    return new PoliticsAndWar(apiKey, enableCache, testServerMode);
  }
}
