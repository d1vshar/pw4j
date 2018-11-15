package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.Entity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CacheTest {

  private PoliticsAndWar politicsAndWar;

  public CacheTest() {
    politicsAndWar = new PoliticsAndWarBuilder().setEnableCache(true, 10, 60000).build();
  }

  @Test
  public void nationsCacheTest() {
    long start = System.nanoTime();
    Entity entity1 = politicsAndWar.getNations();
    long mid = System.nanoTime();
    System.out.println("Querying Nations API: Try 1 " + (mid - start) / 1000000L + "ms");
    Entity entity2 = politicsAndWar.getNations();
    System.out.println("Querying Nations API: Try 2 " + (System.nanoTime() - mid) / 1000000L + "ms");

    assertEquals(entity2.toJson(), entity1.toJson());
    System.out.println("Test Passed - Both entities are equal");
  }

  @Test
  public void cacheSizeTest() {
    for (int i = 1; i <= 31; i++)
      politicsAndWar.getWars(i);

    System.out.println("Testing removed Entity");
    politicsAndWar.getWars(1);
    System.out.println("Testing outdated Entity");
    politicsAndWar.getWars(5);
    System.out.println("Testing existing Entity");
    politicsAndWar.getWars(50);
  }

  @Test
  public void cacheTimeExpireTest() {
    politicsAndWar.getWars(1);
    System.out.println("Sleeping for 65000 ms.");
    try {
      Thread.sleep(6500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    politicsAndWar.getWars(2);
  }
}
