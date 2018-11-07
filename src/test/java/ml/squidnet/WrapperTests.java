package ml.squidnet;

import ml.squidnet.enums.ResourceType;
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
      politicsAndWar = new PoliticsAndWar(properties.getProperty("apiKey"));
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
  }
}