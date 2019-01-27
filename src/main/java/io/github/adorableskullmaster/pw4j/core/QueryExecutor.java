package io.github.adorableskullmaster.pw4j.core;

import io.github.adorableskullmaster.pw4j.domains.Entity;
import io.github.adorableskullmaster.pw4j.queries.ApiQuery;

public class QueryExecutor {

  private CacheClient cacheClient = null;
  private boolean testServerMode;
  private boolean enableCache;

  public QueryExecutor(boolean enableCache, boolean testServerMode, int cacheMaxSize, long cacheRetainTime) {
    this.enableCache = enableCache;
    this.testServerMode = testServerMode;
    if (this.enableCache)
      cacheClient = new CacheClient(cacheMaxSize, cacheRetainTime);
  }

  public Entity execute(ApiQuery apiQuery) {
    apiQuery.buildUrlStr(testServerMode);
    String url = apiQuery.getUrlStr();
    if (this.enableCache && cacheClient.contains(url))
      return getFromCache(url);
    else
      return getFromSource(apiQuery);
  }

  private Entity getFromCache(String url) {
    return cacheClient.getIfExists(url);
  }

  private Entity getFromSource(ApiQuery apiQuery) {
    Entity entity = apiQuery.fetchAPI().getEntity();
    if (this.enableCache)
      cacheClient.add(apiQuery.getUrlStr(), entity);
    return entity;
  }

  public CacheClient getCacheClient() {
    return cacheClient;
  }

  public void clearCacheClient() {
    if (cacheClient != null)
      cacheClient.clear();
  }
}
