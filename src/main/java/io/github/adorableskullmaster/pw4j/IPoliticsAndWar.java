package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

public interface IPoliticsAndWar {

  Nation getNation(int nationId);

  Nations getNations();

  Nations getNations(boolean vm);

  Nations getNationsByAlliance(boolean vm, int allianceId);

  Nations getNationsByScore(boolean vm, int maxScore, int minScore);

  Nations getNations(boolean vm, int allianceId, int maxScore, int minScore);

  Alliance getAlliance(int allianceId);

  Alliances getAlliances();

  NationMilitary getAllMilitaries();

  AllCities getAllCities();

  Applicants getApplicants(int allianceId);

  Bank getBank(int allianceId);

  Members getMembers(int allianceId);

  City getCity(int cityId);

  War getWar(int warId);

  Wars getWars();

  Wars getWarsByAmount(int amount);

  Wars getWarsByAlliance(Integer[] alliance_ids);

  Wars getWars(int amount, Integer[] alliance_ids);

  TradePrice getTradeprice(ResourceType resource);

  TradeHistory getAllTradehistory();

  TradeHistory getTradehistoryByType(ResourceType[] resources);

  TradeHistory getTradehistoryByAmount(Integer amount);

  TradeHistory getTradehistory(Integer amount, ResourceType[] resources);

}
