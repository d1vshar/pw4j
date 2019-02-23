package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.TradeHistory;
import io.github.adorableskullmaster.pw4j.domains.Wars;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WrapperTests {

  private PoliticsAndWar politicsAndWar;

  public WrapperTests() {
    try {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("testData.properties"));
      politicsAndWar = new PoliticsAndWarBuilder()
          .setApiKey(properties.getProperty("apiKey"))
          .setEnableCache(false)
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
    assertTrue(politicsAndWar.getWar(385279).isSuccess());
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
    // Check normal success
    assertTrue(politicsAndWar.getNations().isSuccess());

    // Check for any VM nation present
    assertTrue(politicsAndWar.getNations(true)
        .getNationsContainer()
        .stream()
        .anyMatch(nationContainer -> Integer.parseInt(nationContainer.getVacmode()) > 0));

    // Check for all non-VM + alliance
    assertTrue(politicsAndWar.getNationsByAlliance(false, 913)
        .getNationsContainer()
        .stream()
        .allMatch(nationContainer -> nationContainer.getAllianceid() == 913 && Integer.parseInt(nationContainer.getVacmode()) == 0));

    // Check for all non-VM + score
    assertTrue(politicsAndWar.getNationsByScore(false, 4000, 3500)
        .getNationsContainer()
        .stream()
        .allMatch(nationContainer -> nationContainer.getScore() <= 4000 && nationContainer.getScore() >= 3500 && Integer.parseInt(nationContainer.getVacmode()) == 0));

    // Check for all non-VM + alliance + score
    assertTrue(politicsAndWar.getNations(false, 913, 1000, 500)
        .getNationsContainer()
        .stream()
        .allMatch(nationContainer -> (nationContainer.getScore() <= 1000 && nationContainer.getScore() >= 500) && nationContainer.getAllianceid() == 913 &&
            Integer.parseInt(nationContainer.getVacmode()) == 0));
  }

  @Test
  public void alliancesQueryTest() {
    assertTrue(politicsAndWar.getAlliances().isSuccess());
  }

  @Test
  public void warsQueryTest() {
    // Check normal success
    assertTrue(politicsAndWar.getWars().isSuccess());

    // Check size
    assertEquals(50, politicsAndWar.getWarsByAmount(50).getWars().size());

    // Check alliance
    assertTrue(politicsAndWar.getWarsByAlliance(913)
        .getWars()
        .stream()
        .anyMatch(sWarContainer -> sWarContainer.getAttackerAA().equalsIgnoreCase("Arrgh") ||
            sWarContainer.getDefenderAA().equalsIgnoreCase("Arrgh")));

    // Check size + alliance
    Wars wars = politicsAndWar.getWars(50, 913);
    assertEquals(50, wars.getWars().size());
    assertTrue(wars.getWars()
        .stream()
        .anyMatch(sWarContainer -> sWarContainer.getAttackerAA().equalsIgnoreCase("Arrgh") ||
            sWarContainer.getDefenderAA().equalsIgnoreCase("Arrgh")));
  }

  @Test
  public void tradeHistoryQueryTest() {
    // Check normal success
    assertTrue(politicsAndWar.getAllTradehistory().isSuccess());

    // Check size
    assertEquals(10, politicsAndWar.getTradehistoryByAmount(10).getTrades().size());

    // Check type
    assertTrue(politicsAndWar.getTradehistoryByType(ResourceType.FOOD)
        .getTrades()
        .stream()
        .allMatch(tradeContainer -> tradeContainer.getResource().equalsIgnoreCase("food")));

    // Check size + type
    TradeHistory tradehistory = politicsAndWar.getTradehistory(10, ResourceType.FOOD);
    assertEquals(10, tradehistory.getTrades().size());
    assertTrue(tradehistory.getTrades()
        .stream()
        .allMatch(tradeContainer -> tradeContainer.getResource().equalsIgnoreCase("food")));
  }

  @Test
  public void allCitiesQueryTest() {
    assertTrue(politicsAndWar.getAllCities().isSuccess());
  }

  @Test
  public void allMilitariesQueryTest() {
    assertTrue(politicsAndWar.getAllMilitaries().isSuccess());
  }
}