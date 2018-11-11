package ml.squidnet;

import ml.squidnet.core.QueryExecutor;
import ml.squidnet.domains.*;
import ml.squidnet.enums.ResourceType;
import ml.squidnet.queries.*;

public class PoliticsAndWar implements IPoliticsAndWar {

  private QueryExecutor executor;
  private String apiKey;

  PoliticsAndWar(String apiKey, Boolean enableCache, Boolean testServerMode, int cacheSize, long cacheRetainTime) {
    this.apiKey = apiKey;
    if (enableCache)
      executor = new QueryExecutor(true, testServerMode, cacheSize, cacheRetainTime);
    else
      executor = new QueryExecutor(false, testServerMode, cacheSize, cacheRetainTime);
  }

  @Override
  public Nation getNation(int nationId) {
    return (Nation) execute(new NationQuery(nationId).build());
  }

  @Override
  public Nations getNations() {
    return (Nations) execute(new NationsQuery().build());
  }

  @Override
  public Alliance getAlliance(int allianceId) {
    return (Alliance) execute(new AllianceQuery(allianceId).build());
  }

  @Override
  public Alliances getAlliances() {
    return (Alliances) execute(new AlliancesQuery().build());
  }

  @Override
  public Applicants getApplicants(int allianceId) {
    return (Applicants) execute(new ApplicantsQuery(allianceId).build());
  }

  @Override
  public Bank getBank(int allianceId) {
    return (Bank) execute(new BankQuery(apiKey, allianceId).build());
  }

  @Override
  public Members getMembers(int allianceId) {
    return (Members) execute(new MembersQuery(apiKey, allianceId).build());
  }

  @Override
  public City getCity(int cityId) {
    return (City) execute(new CityQuery(cityId).build());
  }

  @Override
  public War getWar(int warId) {
    return (War) execute(new WarQuery(warId).build());
  }

  @Override
  public Wars getWars(int amount) {
    return (Wars) execute(new WarsQuery(amount, null).build());
  }

  @Override
  public Wars getWars(int amount, Integer... alliance_ids) {
    return (Wars) execute(new WarsQuery(amount, alliance_ids).build());
  }

  @Override
  public Tradeprice getTradeprice(ResourceType resource) {
    return (Tradeprice) execute(new TradepriceQuery(resource).build());
  }

  @Override
  public Tradehistory getTradehistory() {
    return (Tradehistory) execute(new TradehistoryQuery(apiKey, null, null).build());
  }

  @Override
  public Tradehistory getTradehistory(ResourceType... resources) {
    return (Tradehistory) execute(new TradehistoryQuery(apiKey, null, resources).build());
  }

  @Override
  public Tradehistory getTradehistory(Integer amount) {
    return (Tradehistory) execute(new TradehistoryQuery(apiKey, amount, null).build());
  }

  @Override
  public Tradehistory getTradehistory(Integer amount, ResourceType... resources) {
    return (Tradehistory) execute(new TradehistoryQuery(apiKey, amount, resources).build());
  }

  private Entity execute(ApiQuery apiQuery) {
    return executor.execute(apiQuery);
  }
}
