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

  Wars getWars(int wars);

  Tradeprice getTradeprice(ResourceType resource);

  Entity execute(ApiQuery apiQuery);

}
