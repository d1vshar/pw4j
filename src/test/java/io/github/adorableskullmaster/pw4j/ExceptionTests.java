package io.github.adorableskullmaster.pw4j;

import org.junit.Test;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class ExceptionTests {

  private PoliticsAndWar politicsAndWar;
  private PoliticsAndWar politicsAndWar2;

  public ExceptionTests() {
    try {
      Properties properties = new Properties();
      properties.load(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("testData.properties")));
      politicsAndWar = new PoliticsAndWarBuilder()
          .addApiKey(properties.getProperty("apiKey"))
          .build();
      politicsAndWar2 = new PoliticsAndWarBuilder()
          .build();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void nationExceptionTest() throws IOException {
    politicsAndWar.getNation(1024);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void allianceExceptionTest() throws IOException {
    politicsAndWar.getAlliance(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void warExceptionTest() throws IOException {
    politicsAndWar.getWar(356);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void cityExceptionTest() throws IOException {
    politicsAndWar.getCity(1);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void bankExceptionTest() throws IOException {
    politicsAndWar.getBank(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void applicantExceptionTest() throws IOException {
    politicsAndWar.getApplicants(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void membersExceptionTest() throws IOException {
    politicsAndWar.getMembers(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void tradeHistoryExceptionTest() throws IOException {
    politicsAndWar.getTradehistoryByAmount(0);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void allCitiesExceptionTest() throws IOException {
    politicsAndWar2.getAllCities();
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void allMilitariesTest() throws IOException {
    politicsAndWar2.getAllMilitaries();
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void apiKeyExceptionTest() throws IOException {
    politicsAndWar2.getMembers(913);
  }
}
