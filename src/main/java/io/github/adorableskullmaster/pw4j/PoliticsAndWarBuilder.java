package io.github.adorableskullmaster.pw4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoliticsAndWarBuilder {

  private boolean testServerMode;
  private List<String> apiKeysList;
  private boolean enableCache;
  private int cacheSize = 50;
  private long cacheRetainTime = 60000;

  public PoliticsAndWarBuilder() {
    this.enableCache = false;
    this.apiKeysList = new ArrayList<>();
    this.testServerMode = false;
  }

  public PoliticsAndWarBuilder addApiKey(String apiKey) {
    this.apiKeysList.add(apiKey);
    return this;
  }

  public PoliticsAndWarBuilder addApiKeys(String... apiKey) {
    this.apiKeysList.addAll(Arrays.asList(apiKey));
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
    return new PoliticsAndWar(apiKeysList.toArray(new String[0]), enableCache, testServerMode, cacheSize, cacheRetainTime);
  }
}