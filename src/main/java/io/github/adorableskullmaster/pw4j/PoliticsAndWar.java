package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.core.ApiKeyPool;
import io.github.adorableskullmaster.pw4j.core.CacheClient;
import io.github.adorableskullmaster.pw4j.core.QueryExecutor;
import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import io.github.adorableskullmaster.pw4j.queries.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PoliticsAndWar implements IPoliticsAndWar {

  private QueryExecutor executor;
  private ApiKeyPool apiKeyPool;

  PoliticsAndWar(String[] apiKeys, Boolean enableCache, Boolean testServerMode, int cacheSize, long cacheRetainTime) {
    this.apiKeyPool = new ApiKeyPool(apiKeys);
    executor = new QueryExecutor(enableCache, testServerMode, cacheSize, cacheRetainTime);
  }

    public static PoliticsAndWar getBasicInstance(String[] apiKeys) {
      return new PoliticsAndWar(apiKeys, true, false, 50, 60000);
    }

  @Override
  public Nation getNation(int nationId) throws IOException {
    return (Nation) execute(new NationQuery(nationId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Nations getNations() throws IOException {
    return (Nations) execute(new NationsQuery(null, null, null, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Nations getNations(boolean vm) throws IOException {
    return (Nations) execute(new NationsQuery(vm, null, null, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Nations getNationsByAlliance(boolean vm, int allianceId) throws IOException {
    return (Nations) execute(new NationsQuery(vm, null, null, allianceId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Nations getNationsByScore(boolean vm, int maxScore, int minScore) throws IOException {
    return (Nations) execute(new NationsQuery(vm, maxScore, minScore, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Nations getNations(boolean vm, int allianceId, int maxScore, int minScore) throws IOException {
    return (Nations) execute(new NationsQuery(vm, maxScore, minScore, allianceId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Alliance getAlliance(int allianceId) throws IOException {
    return (Alliance) execute(new AllianceQuery(allianceId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Alliances getAlliances() throws IOException {
    return (Alliances) execute(new AlliancesQuery(apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public NationMilitary getAllMilitaries() throws IOException {
    return (NationMilitary) execute(new NationMilitaryQuery(apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public AllCities getAllCities() throws IOException {
    return (AllCities) execute(new AllCitiesQuery(apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Applicants getApplicants(int allianceId) throws IOException {
    return (Applicants) execute(new ApplicantsQuery(allianceId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Bank getBank(int allianceId) throws IOException {
    return (Bank) execute(new BankQuery(allianceId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Members getMembers(int allianceId) throws IOException {
    return (Members) execute(new MembersQuery(allianceId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public City getCity(int cityId) throws IOException {
    return (City) execute(new CityQuery(cityId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public War getWar(int warId) throws IOException {
    return (War) execute(new WarQuery(warId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Wars getWars() throws IOException {
    return (Wars) execute(new WarsQuery(-1, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Wars getWarsByAmount(int amount) throws IOException {
    return (Wars) execute(new WarsQuery(amount, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Wars getWarsByAlliance(Integer... alliance_ids) throws IOException {
    return (Wars) execute(new WarsQuery(-1, alliance_ids, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public Wars getWars(int amount, Integer... alliance_ids) throws IOException {
    return (Wars) execute(new WarsQuery(amount, alliance_ids, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public TradePrice getTradeprice(ResourceType resource) throws IOException {
    return (TradePrice) execute(new TradepriceQuery(resource, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public TradeHistory getAllTradehistory() throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(null, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public TradeHistory getTradehistoryByType(ResourceType... resources) throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(null, resources, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public TradeHistory getTradehistoryByAmount(Integer amount) throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(amount, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public TradeHistory getTradehistory(Integer amount, ResourceType... resources) throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(amount, resources, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public WarAttacks getWarAttacks() throws IOException {
    return (WarAttacks) execute(new WarAttacksQuery(null, null, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public WarAttacks getWarAttacksByWarId(int warId) throws IOException {
    return (WarAttacks) execute(new WarAttacksQuery(warId, null, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public WarAttacks getWarAttacksByMinWarAttackId(int minWarAttackId) throws IOException {
    return (WarAttacks) execute(new WarAttacksQuery(null, minWarAttackId, null, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public WarAttacks getWarAttacksByMaxWarAttackId(int maxWarAttackId) throws IOException {
    return (WarAttacks) execute(new WarAttacksQuery(null, null, maxWarAttackId, apiKeyPool.getNextApiKey()).build());
  }

  @Override
  public WarAttacks getWarAttacks(int warId, int minWarAttackId, int maxWarAttackId) throws IOException {
    return (WarAttacks) execute(new WarAttacksQuery(warId, minWarAttackId, maxWarAttackId, apiKeyPool.getNextApiKey()).build());
  }

  public HashMap<String,Integer> getApiKeyUsageStats() { return apiKeyPool.getStats(); }

  public CacheClient getCacheClient() {
    return executor.getCacheClient();
  }

  public void clearCache() {
    executor.clearCacheClient();
  }

  private Entity execute(ApiQuery apiQuery) throws IOException {
    return executor.execute(apiQuery);
  }
}
