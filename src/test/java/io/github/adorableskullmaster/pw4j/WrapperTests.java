package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.subdomains.SNationContainer;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
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
    assertTrue(politicsAndWar.getNations().isSuccess());

    List<SNationContainer> nationsContainer = politicsAndWar.getNations(false, 913, 1000, 500).getNationsContainer();
    boolean b = nationsContainer.stream()
        .noneMatch(nationContainer -> Integer.parseInt(nationContainer.getVacmode()) > 0);
    assertTrue(b);

    boolean b1 = nationsContainer.stream()
        .allMatch(nationContainer -> nationContainer.getAllianceid() == 913);
    assertTrue(b1);

    boolean b2 = nationsContainer.stream()
        .allMatch(nationContainer -> nationContainer.getScore() <= 1000 && nationContainer.getScore() >= 500);
    assertTrue(b2);
  }

  @Test
  public void alliancesQueryTest() {
    assertTrue(politicsAndWar.getAlliances().isSuccess());
  }

  @Test
  public void warsQueryTest() {
    assertTrue(politicsAndWar.getAllWars().isSuccess());
    assertEquals(50, politicsAndWar.getWarsByAmount(50).getWars().size());
    assertTrue(politicsAndWar.getWarsByAlliance(913).isSuccess());
    assertEquals(50, politicsAndWar.getWars(50, 913).getWars().size());
  }

  @Test
  public void tradeHistoryQueryTest() {
    assertTrue(politicsAndWar.getAllTradehistory().isSuccess());
    assertEquals(10, politicsAndWar.getTradehistoryByAmount(10).getTrades().size());
    assertEquals(50, politicsAndWar.getTradehistory(50, ResourceType.FOOD, ResourceType.ALUMINUM).getTrades().size());
    assertTrue(politicsAndWar.getTradehistoryByType(ResourceType.FOOD, ResourceType.ALUMINUM).isSuccess());
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