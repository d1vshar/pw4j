package ml.squidnet;

import ml.squidnet.domains.*;
import ml.squidnet.enums.ResourceType;
import ml.squidnet.queries.ApiQuery;

public interface IPoliticsAndWar {

  boolean checkApi();

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

  Entity execute(ApiQuery apiQuery);

}
