package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.core.CacheClient;
import io.github.adorableskullmaster.pw4j.core.QueryExecutor;
import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import io.github.adorableskullmaster.pw4j.queries.*;

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
    return (Nations) execute(new NationsQuery(null, null, null, null).build());
  }

  @Override
  public Nations getNations(boolean vm) {
    return (Nations) execute(new NationsQuery(vm, null, null, null).build());
  }

  @Override
  public Nations getNationsByAlliance(boolean vm, int allianceId) {
    return (Nations) execute(new NationsQuery(vm, null, null, allianceId).build());
  }

  @Override
  public Nations getNationsByScore(boolean vm, int maxScore, int minScore) {
    return (Nations) execute(new NationsQuery(vm, maxScore, minScore, null).build());
  }

  @Override
  public Nations getNations(boolean vm, int allianceId, int maxScore, int minScore) {
    return (Nations) execute(new NationsQuery(vm, maxScore, minScore, allianceId).build());
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
  public NationMilitary getAllMilitaries() {
    return (NationMilitary) execute(new NationMilitaryQuery(apiKey).build());
  }

  @Override
  public AllCities getAllCities() {
    return (AllCities) execute(new AllCitiesQuery(apiKey).build());
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
  public Wars getWars() {
    return (Wars) execute(new WarsQuery(-1, null).build());
  }

  @Override
  public Wars getWarsByAmount(int amount) {
    return (Wars) execute(new WarsQuery(amount, null).build());
  }

  @Override
  public Wars getWarsByAlliance(Integer... alliance_ids) {
    return (Wars) execute(new WarsQuery(-1, alliance_ids).build());
  }

  @Override
  public Wars getWars(int amount, Integer... alliance_ids) {
    return (Wars) execute(new WarsQuery(amount, alliance_ids).build());
  }

  @Override
  public TradePrice getTradeprice(ResourceType resource) {
    return (TradePrice) execute(new TradepriceQuery(resource).build());
  }

  @Override
  public TradeHistory getAllTradehistory() {
    return (TradeHistory) execute(new TradehistoryQuery(apiKey, null, null).build());
  }

  @Override
  public TradeHistory getTradehistoryByType(ResourceType... resources) {
    return (TradeHistory) execute(new TradehistoryQuery(apiKey, null, resources).build());
  }

  @Override
  public TradeHistory getTradehistoryByAmount(Integer amount) {
    return (TradeHistory) execute(new TradehistoryQuery(apiKey, amount, null).build());
  }

  @Override
  public TradeHistory getTradehistory(Integer amount, ResourceType... resources) {
    return (TradeHistory) execute(new TradehistoryQuery(apiKey, amount, resources).build());
  }

  public CacheClient getCacheClient() {
    return executor.getCacheClient();
  }

  public void clearCache() {
    executor.clearCacheClient();
  }

  private Entity execute(ApiQuery apiQuery) {
    return executor.execute(apiQuery);
  }
}
