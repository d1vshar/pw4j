package io.github.adorableskullmaster;

public class PoliticsAndWarBuilder {

  private boolean testServerMode;
  private String apiKey;
  private boolean enableCache;
  private int cacheSize = 50;
  private long cacheRetainTime = 60000;

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

  public PoliticsAndWarBuilder setEnableCache(boolean enableCache) {
    this.enableCache = enableCache;
    return this;
  }

  public PoliticsAndWarBuilder setEnableCache(boolean enableCache, int cacheSize, long cacheRetainTime) {
    this.enableCache = enableCache;
    this.cacheSize = cacheSize;
    this.cacheRetainTime = cacheRetainTime;
    return this;
  }

  public PoliticsAndWar build() {
    return new PoliticsAndWar(apiKey, enableCache, testServerMode, cacheSize, cacheRetainTime);
  }
}