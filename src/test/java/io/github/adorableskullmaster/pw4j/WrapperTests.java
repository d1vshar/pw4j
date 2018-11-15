package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.core.CacheClient;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WrapperTests {

  private PoliticsAndWar politicsAndWar;
  private PoliticsAndWar testPoliticsAndWar;

  public WrapperTests() {
    try {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("testData.properties"));
      politicsAndWar = new PoliticsAndWarBuilder()
          .setApiKey(properties.getProperty("apiKey"))
          .build();
      testPoliticsAndWar = new PoliticsAndWarBuilder()
          .setApiKey(properties.getProperty("apiKey"))
          .setTestServerMode(true)
          .build();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void nationQueryTest() {
    assertEquals("Mountania", politicsAndWar.getNation(6).getName());
  }

  @Test
  public void allianceQueryTest() {
    assertEquals("Arrgh", politicsAndWar.getAlliance(913).getName());
  }

  @Test
  public void warQueryTest() {
    assertTrue(politicsAndWar.getWar(357727).isSuccess());
  }

  @Test
  public void cityQueryTest() {
    assertEquals("10618", politicsAndWar.getCity(10618).getCityid());
  }

  @Test
  public void tradepriceQueryTest() {
    assertEquals("food", politicsAndWar.getTradeprice(ResourceType.FOOD).getResource());
  }

  @Test
  public void applicantsQueryTest() {
    assertTrue(politicsAndWar.getApplicants(1584).isSuccess());
  }

  @Test
  public void bankQueryTest() {
    assertTrue(politicsAndWar.getBank(913).isSuccess());
  }

  @Test
  public void membersQueryTest() {
    assertTrue(politicsAndWar.getMembers(913).isSuccess());
  }

  @Test
  public void nationsQueryTest() {
    assertTrue(politicsAndWar.getNations().isSuccess());
  }

  @Test
  public void alliancesQueryTest() {
    assertTrue(politicsAndWar.getAlliances().isSuccess());
  }

  @Test
  public void warsQueryTest() {
    assertEquals(50, politicsAndWar.getWars(50).getWars().size());
    assertEquals(50, politicsAndWar.getWars(50, 913).getWars().size());
  }

  @Test
  public void tradeHistoryQueryTest() {
    assertTrue(politicsAndWar.getTradehistory().isSuccess());
    assertEquals(10, politicsAndWar.getTradehistory(10).getTrades().size());
    assertEquals(50, politicsAndWar.getTradehistory(50, ResourceType.FOOD, ResourceType.ALUMINUM).getTrades().size());
    assertTrue(politicsAndWar.getTradehistory(ResourceType.FOOD, ResourceType.ALUMINUM).isSuccess());
  }

  @Test
  public void testServerQueryTest() {
    assertEquals("Creaotaria", testPoliticsAndWar.getNation(2703).getName());
  }

  @Test
  public void testCache() {
    CacheClient cacheClient = new CacheClient(5, 10000);
  }
}