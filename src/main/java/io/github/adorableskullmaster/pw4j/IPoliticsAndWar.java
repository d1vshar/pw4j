package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

public interface IPoliticsAndWar {

  Nation getNation(int nationId);

  Nations getNations();

  Alliance getAlliance(int allianceId);

  Alliances getAlliances();

  NationMilitary getAllMilitaries();

  AllCities getAllCities();

  Applicants getApplicants(int allianceId);

  Bank getBank(int allianceId);

  Members getMembers(int allianceId);

  City getCity(int cityId);

  War getWar(int warId);

  Wars getAllWars();

  Wars getWarsByAmount(int amount);

  Wars getWarsByAlliance(Integer[] alliance_ids);

  Wars getWars(int amount, Integer[] alliance_ids);

  TradePrice getTradeprice(ResourceType resource);

  TradeHistory getAllTradehistory();

  TradeHistory getTradehistoryByType(ResourceType[] resources);

  TradeHistory getTradehistoryByAmount(Integer amount);

  TradeHistory getTradehistory(Integer amount, ResourceType[] resources);

}
