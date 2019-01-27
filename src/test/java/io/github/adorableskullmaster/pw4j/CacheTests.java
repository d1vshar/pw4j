package io.github.adorableskullmaster.pw4j;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CacheTests {

  private PoliticsAndWar politicsAndWar;

  public CacheTests() {
    politicsAndWar = new PoliticsAndWarBuilder().setEnableCache(true, 10, 60000).build();
  }

  @Test
  public void cacheResponseTimeTest() {
    politicsAndWar.getNations();
    Instant start = Instant.now();
    politicsAndWar.getNations();
    Instant end = Instant.now();

    assertTrue("timestamp", Duration.between(start, end).getSeconds() < 1);
  }

  @Test
  public void cacheSizeTest() {
    politicsAndWar.clearCache();
    assertEquals(0, politicsAndWar.getCacheClient().getCacheSize());
    for (int i = 1; i <= 11; i++) {
      politicsAndWar.getWarsByAmount(i);
    }
    assertEquals(10, politicsAndWar.getCacheClient().getCacheSize());
  }
}
