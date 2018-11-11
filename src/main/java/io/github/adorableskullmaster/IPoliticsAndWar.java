package io.github.adorableskullmaster;

import io.github.adorableskullmaster.domains.*;
import io.github.adorableskullmaster.enums.ResourceType;

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
