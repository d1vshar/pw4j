package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.core.Utility;
import org.junit.Test;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CacheTests {

  private PoliticsAndWar politicsAndWar;

  public CacheTests() {
    try {
      Properties properties = new Properties();
      properties.load(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("testData.properties")));
      politicsAndWar = new PoliticsAndWarBuilder()
              .addApiKey(properties.getProperty("apiKey"))
              .setEnableCache(true,10,60000)
              .build();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void cacheResponseTimeTest() throws IOException {
    politicsAndWar.getNations();
    Instant start = Instant.now();
    politicsAndWar.getNations();
    Instant end = Instant.now();

    assertTrue("timestamp", Duration.between(start, end).getSeconds() < 1);
  }

  @Test
  public void cacheSizeTest() throws IOException {
    politicsAndWar.clearCache();
    assertEquals(0, politicsAndWar.getCacheClient().getCacheSize());
    for (int i = 1; i <= 11; i++) {
      politicsAndWar.getWarsByAmount(i);
    }
    assertEquals(10, politicsAndWar.getCacheClient().getCacheSize());
  }
}
