package io.github.adorableskullmaster.pw4j;

import io.github.adorableskullmaster.pw4j.domains.*;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

public interface IPoliticsAndWar {

  Nation getNation(int nationId);

  Nations getNations();

  Alliance getAlliance(int allianceId);

  Alliances getAlliances();

  Applicants getApplicants(int allianceId);

  Bank getBank(int allianceId);

  Members getMembers(int allianceId);

  City getCity(int cityId);

  War getWar(int warId);

  Wars getWars(int amount);

  Wars getWars(int amount, Integer[] alliance_ids);

  Tradeprice getTradeprice(ResourceType resource);

  Tradehistory getTradehistory();

  Tradehistory getTradehistory(ResourceType[] resources);

  Tradehistory getTradehistory(Integer amount);

  Tradehistory getTradehistory(Integer amount, ResourceType[] resources);

}
