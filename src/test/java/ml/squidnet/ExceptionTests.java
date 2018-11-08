package ml.squidnet;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class ExceptionTests {

  private PoliticsAndWar politicsAndWar;
  private PoliticsAndWar politicsAndWar2;

  public ExceptionTests() {
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

  @Test(expected = PoliticsAndWarAPIException.class)
  public void nationExceptionTest() {
    politicsAndWar.getNation(1024);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void allianceExceptionTest() {
    politicsAndWar.getAlliance(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void warExceptionTest() {
    politicsAndWar.getWar(356);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void cityExceptionTest() {
    politicsAndWar.getCity(1);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void bankExceptionTest() {
    politicsAndWar.getBank(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void applicantExceptionTest() {
    politicsAndWar.getApplicants(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void membersExceptionTest() {
    politicsAndWar.getMembers(2);
  }

  @Test(expected = PoliticsAndWarAPIException.class)
  public void apiKeyExceptionTest() {
    politicsAndWar2.getMembers(913);
  }
}
