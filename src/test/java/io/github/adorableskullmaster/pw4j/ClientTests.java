package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.subdomains.AllianceBankContainer;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import io.github.adorableskullmaster.pw4j.scrape.clients.AllianceWithdrawBankClient;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class ClientTests {

  private PoliticsAndWar politicsAndWar;

  public ClientTests() {
    try {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("testData.properties"));
      System.out.println(properties.getProperty("apiKey"));
      politicsAndWar = PoliticsAndWar.getDefaultInstance(properties.getProperty("apiKey"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void withdrawToNation() throws IOException {
    AllianceBankContainer bank = politicsAndWar.getBank(1742).getAllianceBanks().get(0);

    AllianceWithdrawBankClient allianceWithdrawBankClient = politicsAndWar.getAllianceWithdrawBankClient
        (
            1742,
            "nastyworldgamer@gmail.com",
            "mBFlN095s1q1",
            false,
            "Dynamite"
        );
    allianceWithdrawBankClient.setResource(ResourceType.MONEY, 100.0);
    allianceWithdrawBankClient.setResource(ResourceType.FOOD, 100.0);
    allianceWithdrawBankClient.setNote("Automated Test");
    allianceWithdrawBankClient.execute();

    AllianceBankContainer bank2 = politicsAndWar.getBank(1742).getAllianceBanks().get(0);
    Assert.assertEquals(100.00, bank2.getMoney() - bank.getMoney(), 0.5);
  }

  @Test
  public void withdrawToBank() throws IOException {
    AllianceBankContainer bank = politicsAndWar.getBank(1742).getAllianceBanks().get(0);

    AllianceWithdrawBankClient allianceWithdrawBankClient = politicsAndWar.getAllianceWithdrawBankClient
        (
            1742,
            "nastyworldgamer@gmail.com",
            "mBFlN095s1q1",
            false,
            "Arrgh"
        );
    allianceWithdrawBankClient.setResource(ResourceType.MONEY, 100.0);
    allianceWithdrawBankClient.setResource(ResourceType.FOOD, 100.0);
    allianceWithdrawBankClient.setNote("Automated Test");
    allianceWithdrawBankClient.setAlliance(true);
    allianceWithdrawBankClient.execute();

    AllianceBankContainer bank2 = politicsAndWar.getBank(1742).getAllianceBanks().get(0);
    Assert.assertEquals(100.00, bank2.getMoney() - bank.getMoney(), 0.5);
    allianceWithdrawBankClient.close();
  }

}
