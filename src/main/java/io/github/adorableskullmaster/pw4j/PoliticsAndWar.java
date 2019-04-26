package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.core.CacheClient;
import io.github.adorableskullmaster.pw4j.core.QueryExecutor;
import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;
import io.github.adorableskullmaster.pw4j.queries.*;
import io.github.adorableskullmaster.pw4j.scrape.clients.AllianceTransactionBankClient;
import io.github.adorableskullmaster.pw4j.scrape.clients.AllianceWithdrawBankClient;

import java.io.IOException;

public class PoliticsAndWar implements IPoliticsAndWar {

  private QueryExecutor executor;
  private String apiKey;

  PoliticsAndWar(String apiKey, Boolean enableCache, Boolean testServerMode, int cacheSize, long cacheRetainTime) {
    this.apiKey = apiKey;
    executor = new QueryExecutor(this.apiKey, enableCache, testServerMode, cacheSize, cacheRetainTime);
  }

  public static PoliticsAndWar getDefaultInstance(String apiKey) {
    return new PoliticsAndWar(apiKey, true, false, 50, 60000);
  }

  @Override
  public Nation getNation(int nationId) throws IOException {
    return (Nation) execute(new NationQuery(nationId, apiKey).build());
  }

  @Override
  public Nations getNations() throws IOException {
    return (Nations) execute(new NationsQuery(null, null, null, null, apiKey).build());
  }

  @Override
  public Nations getNations(boolean vm) throws IOException {
    return (Nations) execute(new NationsQuery(vm, null, null, null, apiKey).build());
  }

  @Override
  public Nations getNationsByAlliance(boolean vm, int allianceId) throws IOException {
    return (Nations) execute(new NationsQuery(vm, null, null, allianceId, apiKey).build());
  }

  @Override
  public Nations getNationsByScore(boolean vm, int maxScore, int minScore) throws IOException {
    return (Nations) execute(new NationsQuery(vm, maxScore, minScore, null, apiKey).build());
  }

  @Override
  public Nations getNations(boolean vm, int allianceId, int maxScore, int minScore) throws IOException {
    return (Nations) execute(new NationsQuery(vm, maxScore, minScore, allianceId, apiKey).build());
  }

  @Override
  public Alliance getAlliance(int allianceId) throws IOException {
    return (Alliance) execute(new AllianceQuery(allianceId, apiKey).build());
  }

  @Override
  public Alliances getAlliances() throws IOException {
    return (Alliances) execute(new AlliancesQuery(apiKey).build());
  }

  @Override
  public NationMilitary getAllMilitaries() throws IOException {
    return (NationMilitary) execute(new NationMilitaryQuery(apiKey).build());
  }

  @Override
  public AllCities getAllCities() throws IOException {
    return (AllCities) execute(new AllCitiesQuery(apiKey).build());
  }

  @Override
  public Applicants getApplicants(int allianceId) throws IOException {
    return (Applicants) execute(new ApplicantsQuery(allianceId, apiKey).build());
  }

  @Override
  public Bank getBank(int allianceId) throws IOException {
    return (Bank) execute(new BankQuery(allianceId, apiKey).build());
  }

  @Override
  public Members getMembers(int allianceId) throws IOException {
    return (Members) execute(new MembersQuery(allianceId, apiKey).build());
  }

  @Override
  public City getCity(int cityId) throws IOException {
    return (City) execute(new CityQuery(cityId, apiKey).build());
  }

  @Override
  public War getWar(int warId) throws IOException {
    return (War) execute(new WarQuery(warId, apiKey).build());
  }

  @Override
  public Wars getWars() throws IOException {
    return (Wars) execute(new WarsQuery(-1, null, apiKey).build());
  }

  @Override
  public Wars getWarsByAmount(int amount) throws IOException {
    return (Wars) execute(new WarsQuery(amount, null, apiKey).build());
  }

  @Override
  public Wars getWarsByAlliance(Integer... alliance_ids) throws IOException {
    return (Wars) execute(new WarsQuery(-1, alliance_ids, apiKey).build());
  }

  @Override
  public Wars getWars(int amount, Integer... alliance_ids) throws IOException {
    return (Wars) execute(new WarsQuery(amount, alliance_ids, apiKey).build());
  }

  @Override
  public TradePrice getTradeprice(ResourceType resource) throws IOException {
    return (TradePrice) execute(new TradepriceQuery(resource, apiKey).build());
  }

  @Override
  public TradeHistory getAllTradehistory() throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(null, null, apiKey).build());
  }

  @Override
  public TradeHistory getTradehistoryByType(ResourceType... resources) throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(null, resources, apiKey).build());
  }

  @Override
  public TradeHistory getTradehistoryByAmount(Integer amount) throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(amount, null, apiKey).build());
  }

  @Override
  public TradeHistory getTradehistory(Integer amount, ResourceType... resources) throws IOException {
    return (TradeHistory) execute(new TradehistoryQuery(amount, resources, apiKey).build());
  }

  @Override
  public AllianceWithdrawBankClient getAllianceWithdrawBankClient(int aid, String email, String password, boolean rememberMe, String recipient) throws IOException {
    return new AllianceWithdrawBankClient(aid, email, password, rememberMe, recipient);
  }

  @Override
  public AllianceTransactionBankClient getAllianceTransactionBankClient(int aid, String email, String password, boolean rememberMe) throws IOException {
    return new AllianceTransactionBankClient(aid, email, password, rememberMe);
  }

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
