package ml.squidnet;

import ml.squidnet.domains.*;
import ml.squidnet.enums.ResourceType;
import ml.squidnet.queries.*;

public class PoliticsAndWar implements IPoliticsAndWar {

  private String apiKey;

  public PoliticsAndWar() {
    this.apiKey = null;
  }

  public PoliticsAndWar(String apiKey) {
    this.apiKey = apiKey;
  }

  @Override
  public boolean checkApi() {
    return true;
  }

  @Override
  public Nation getNation(int nationId) {
    return (Nation) new NationQuery(nationId).build().execute().getEntity();
  }

  @Override
  public Nations getNations() {
    return (Nations) new NationsQuery().build().execute().getEntity();
  }

  @Override
  public Alliance getAlliance(int allianceId) {
    return (Alliance) new AllianceQuery(allianceId).build().execute().getEntity();
  }

  @Override
  public Alliances getAlliances() {
    return (Alliances) new AlliancesQuery().build().execute().getEntity();
  }

  @Override
  public Applicants getApplicants(int allianceId) {
    return (Applicants) new ApplicantsQuery(allianceId).build().execute().getEntity();
  }

  @Override
  public Bank getBank(int allianceId) {
    return (Bank) new BankQuery(apiKey,allianceId).build().execute().getEntity();
  }

  @Override
  public Members getMembers(int allianceId) {
    return (Members) new MembersQuery(apiKey,allianceId).build().execute().getEntity();
  }

  @Override
  public City getCity(int cityId) {
    return (City) new CityQuery(cityId).build().execute().getEntity();
  }

  @Override
  public War getWar(int warId) {
    return (War) new WarQuery(warId).build().execute().getEntity();
  }

  @Override
  public Wars getWars(int wars) {
    return (Wars) new WarsQuery(wars).build().execute().getEntity();
  }

  @Override
  public Tradeprice getTradeprice(ResourceType resource) {
    return (Tradeprice) new TradepriceQuery(resource).build().execute().getEntity();
  }
}
