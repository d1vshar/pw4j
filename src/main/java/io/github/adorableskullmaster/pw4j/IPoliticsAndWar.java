package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

import java.io.IOException;

public interface IPoliticsAndWar {

  Nation getNation(int nationId) throws IOException;

  Nations getNations() throws IOException;

  Nations getNations(boolean vm) throws IOException;

  Nations getNationsByAlliance(boolean vm, int allianceId) throws IOException;

  Nations getNationsByScore(boolean vm, int maxScore, int minScore) throws IOException;

  Nations getNations(boolean vm, int allianceId, int maxScore, int minScore) throws IOException;

  Alliance getAlliance(int allianceId) throws IOException;

  Alliances getAlliances() throws IOException;

  NationMilitary getAllMilitaries() throws IOException;

  AllCities getAllCities() throws IOException;

  Applicants getApplicants(int allianceId) throws IOException;

  Bank getBank(int allianceId) throws IOException;

  Members getMembers(int allianceId) throws IOException;

  City getCity(int cityId) throws IOException;

  War getWar(int warId) throws IOException;

  Wars getWars() throws IOException;

  Wars getWarsByAmount(int amount) throws IOException;

  Wars getWarsByAlliance(Integer[] alliance_ids) throws IOException;

  Wars getWars(int amount, Integer[] alliance_ids) throws IOException;

  TradePrice getTradeprice(ResourceType resource) throws IOException;

  TradeHistory getAllTradehistory() throws IOException;

  TradeHistory getTradehistoryByType(ResourceType[] resources) throws IOException;

  TradeHistory getTradehistoryByAmount(Integer amount) throws IOException;

  TradeHistory getTradehistory(Integer amount, ResourceType[] resources) throws IOException;

}
