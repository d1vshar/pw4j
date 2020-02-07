package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.TradeHistory;
import io.github.adorableskullmaster.pw4j.domains.Wars;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import org.junit.Test;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WrapperTests {

  private PoliticsAndWar politicsAndWar;

  public WrapperTests() {
    try {
      Properties properties = new Properties();
      properties.load(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("testData.properties")));
      politicsAndWar = new PoliticsAndWarBuilder()
          .addApiKey(properties.getProperty("apiKey"))
          .setEnableCache(false)
          .build();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void nationQueryTest() throws IOException {
    assertEquals("Mountania", politicsAndWar.getNation(6).getName());
  }

  @Test
  public void allianceQueryTest() throws IOException {
    assertEquals("Arrgh", politicsAndWar.getAlliance(913).getName());
  }

  @Test
  public void warQueryTest() throws IOException {
    assertTrue(politicsAndWar.getWar(603294).isSuccess());
  }

  @Test
  public void cityQueryTest() throws IOException {
    assertEquals("10618", politicsAndWar.getCity(10618).getCityid());
  }

  @Test
  public void tradepriceQueryTest() throws IOException {
    assertEquals("food", politicsAndWar.getTradeprice(ResourceType.FOOD).getResource());
  }

  @Test
  public void applicantsQueryTest() throws IOException {
    assertTrue(politicsAndWar.getApplicants(1584).isSuccess());
  }

  @Test
  public void bankQueryTest() throws IOException {
    assertTrue(politicsAndWar.getBank(913).isSuccess());
  }

  @Test
  public void membersQueryTest() throws IOException {
    assertTrue(politicsAndWar.getMembers(913).isSuccess());
  }

  @Test
  public void nationsQueryTest() throws IOException {
    // Check normal success
    assertTrue(politicsAndWar.getNations().isSuccess());

    // Check for any VM nation present
    assertTrue(politicsAndWar.getNations(true)
        .getNationsContainer()
        .stream()
        .anyMatch(nationContainer -> nationContainer.getVacmode() > 0));

    // Check for all non-VM + alliance
    assertTrue(politicsAndWar.getNationsByAlliance(false, 1742)
        .getNationsContainer()
        .stream()
        .allMatch(nationContainer -> nationContainer.getAllianceid() == 1742 && nationContainer.getVacmode() == 0));

    // Check for all non-VM + score
    assertTrue(politicsAndWar.getNationsByScore(false, 4000, 3500)
        .getNationsContainer()
        .stream()
        .allMatch(nationContainer -> nationContainer.getScore() <= 4000 && nationContainer.getScore() >= 3500 && nationContainer.getVacmode() == 0));

    // Check for all non-VM + alliance + score
    assertTrue(politicsAndWar.getNations(false, 1742, 1000, 500)
        .getNationsContainer()
        .stream()
        .allMatch(nationContainer -> (nationContainer.getScore() <= 1000 && nationContainer.getScore() >= 500) && nationContainer.getAllianceid() == 1742 &&
            nationContainer.getVacmode() == 0));
  }

  @Test
  public void alliancesQueryTest() throws IOException {
    assertTrue(politicsAndWar.getAlliances().isSuccess());
  }

  @Test
  public void warsQueryTest() throws IOException {
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
  public void tradeHistoryQueryTest() throws IOException {
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
  public void allCitiesQueryTest() throws IOException {
    assertTrue(politicsAndWar.getAllCities().isSuccess());
  }

  @Test
  public void allMilitariesQueryTest() throws IOException {
    assertTrue(politicsAndWar.getAllMilitaries().isSuccess());
  }

  @Test
  public void warAttacksQueryTest() throws IOException {
    assertTrue(politicsAndWar.getWarAttacksByWarId(602689).isSuccess());
  }
}