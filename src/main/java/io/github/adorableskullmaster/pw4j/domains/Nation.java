package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Nation extends Entity {
  @SerializedName("cityids")
  @Expose
  private List<String> cityids = null;
  @SerializedName("cityprojecttimerturns")
  @Expose
  private int cityprojecttimerturns;
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nationid")
  @Expose
  private String nationid;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("prename")
  @Expose
  private String prename;
  @SerializedName("continent")
  @Expose
  private String continent;
  @SerializedName("socialpolicy")
  @Expose
  private String socialpolicy;
  @SerializedName("color")
  @Expose
  private String color;
  @SerializedName("minutessinceactive")
  @Expose
  private int minutessinceactive;
  @SerializedName("uniqueid")
  @Expose
  private String uniqueid;
  @SerializedName("government")
  @Expose
  private String government;
  @SerializedName("domestic_policy")
  @Expose
  private String domesticPolicy;
  @SerializedName("war_policy")
  @Expose
  private String warPolicy;
  @SerializedName("founded")
  @Expose
  private String founded;
  @SerializedName("daysold")
  @Expose
  private int daysold;
  @SerializedName("alliance")
  @Expose
  private String alliance;
  @SerializedName("allianceposition")
  @Expose
  private String allianceposition;
  @SerializedName("allianceid")
  @Expose
  private String allianceid;
  @SerializedName("flagurl")
  @Expose
  private String flagurl;
  @SerializedName("leadername")
  @Expose
  private String leadername;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("ecopolicy")
  @Expose
  private String ecopolicy;
  @SerializedName("approvalrating")
  @Expose
  private String approvalrating;
  @SerializedName("nationrank")
  @Expose
  private String nationrank;
  @SerializedName("nationrankstrings")
  @Expose
  private String nationrankstrings;
  @SerializedName("nrtotal")
  @Expose
  private int nrtotal;
  @SerializedName("cities")
  @Expose
  private int cities;
  @SerializedName("latitude")
  @Expose
  private String latitude;
  @SerializedName("longitude")
  @Expose
  private String longitude;
  @SerializedName("score")
  @Expose
  private String score;
  @SerializedName("population")
  @Expose
  private String population;
  @SerializedName("gdp")
  @Expose
  private String gdp;
  @SerializedName("totalinfrastructure")
  @Expose
  private double totalinfrastructure;
  @SerializedName("landarea")
  @Expose
  private int landarea;
  @SerializedName("soldiers")
  @Expose
  private String soldiers;
  @SerializedName("soldiercasualties")
  @Expose
  private String soldiercasualties;
  @SerializedName("soldierskilled")
  @Expose
  private String soldierskilled;
  @SerializedName("tanks")
  @Expose
  private String tanks;
  @SerializedName("tankcasualties")
  @Expose
  private String tankcasualties;
  @SerializedName("tankskilled")
  @Expose
  private String tankskilled;
  @SerializedName("aircraft")
  @Expose
  private String aircraft;
  @SerializedName("aircraftcasualties")
  @Expose
  private String aircraftcasualties;
  @SerializedName("aircraftkilled")
  @Expose
  private String aircraftkilled;
  @SerializedName("ships")
  @Expose
  private String ships;
  @SerializedName("shipcasualties")
  @Expose
  private String shipcasualties;
  @SerializedName("shipskilled")
  @Expose
  private String shipskilled;
  @SerializedName("missiles")
  @Expose
  private String missiles;
  @SerializedName("missilelaunched")
  @Expose
  private String missilelaunched;
  @SerializedName("missileseaten")
  @Expose
  private String missileseaten;
  @SerializedName("nukes")
  @Expose
  private String nukes;
  @SerializedName("nukeslaunched")
  @Expose
  private String nukeslaunched;
  @SerializedName("nukeseaten")
  @Expose
  private String nukeseaten;
  @SerializedName("infdesttot")
  @Expose
  private String infdesttot;
  @SerializedName("infraLost")
  @Expose
  private String infraLost;
  @SerializedName("moneyLooted")
  @Expose
  private String moneyLooted;
  @SerializedName("ironworks")
  @Expose
  private String ironworks;
  @SerializedName("bauxiteworks")
  @Expose
  private String bauxiteworks;
  @SerializedName("armsstockpile")
  @Expose
  private String armsstockpile;
  @SerializedName("emgasreserve")
  @Expose
  private String emgasreserve;
  @SerializedName("massirrigation")
  @Expose
  private String massirrigation;
  @SerializedName("inttradecenter")
  @Expose
  private String inttradecenter;
  @SerializedName("missilelpad")
  @Expose
  private String missilelpad;
  @SerializedName("nuclearresfac")
  @Expose
  private String nuclearresfac;
  @SerializedName("irondome")
  @Expose
  private String irondome;
  @SerializedName("vitaldefsys")
  @Expose
  private String vitaldefsys;
  @SerializedName("intagncy")
  @Expose
  private String intagncy;
  @SerializedName("uraniumenrich")
  @Expose
  private String uraniumenrich;
  @SerializedName("propbureau")
  @Expose
  private String propbureau;
  @SerializedName("cenciveng")
  @Expose
  private String cenciveng;
  @SerializedName("vmode")
  @Expose
  private String vmode;
  @SerializedName("offensivewars")
  @Expose
  private int offensivewars;
  @SerializedName("defensivewars")
  @Expose
  private int defensivewars;
  @SerializedName("offensivewar_ids")
  @Expose
  private List<Object> offensivewarIds = null;
  @SerializedName("defensivewar_ids")
  @Expose
  private List<String> defensivewarIds = null;
  @SerializedName("beige_turns_left")
  @Expose
  private int beigeTurnsLeft;
  @SerializedName("radiation_index")
  @Expose
  private double radiationIndex;
  @SerializedName("season")
  @Expose
  private String season;

  public List<String> getCityids() {
    return cityids;
  }

  public int getCityprojecttimerturns() {
    return cityprojecttimerturns;
  }

  public boolean isSuccess() {
    return success;
  }

  public String getNationid() {
    return nationid;
  }

  public String getName() {
    return name;
  }

  public String getPrename() {
    return prename;
  }

  public String getContinent() {
    return continent;
  }

  public String getSocialpolicy() {
    return socialpolicy;
  }

  public String getColor() {
    return color;
  }

  public int getMinutessinceactive() {
    return minutessinceactive;
  }

  public String getUniqueid() {
    return uniqueid;
  }

  public String getGovernment() {
    return government;
  }

  public String getDomesticPolicy() {
    return domesticPolicy;
  }

  public String getWarPolicy() {
    return warPolicy;
  }

  public String getFounded() {
    return founded;
  }

  public int getDaysold() {
    return daysold;
  }

  public String getAlliance() {
    return alliance;
  }

  public String getAllianceposition() {
    return allianceposition;
  }

  public String getAllianceid() {
    return allianceid;
  }

  public String getFlagurl() {
    return flagurl;
  }

  public String getLeadername() {
    return leadername;
  }

  public String getTitle() {
    return title;
  }

  public String getEcopolicy() {
    return ecopolicy;
  }

  public String getApprovalrating() {
    return approvalrating;
  }

  public String getNationrank() {
    return nationrank;
  }

  public String getNationrankstrings() {
    return nationrankstrings;
  }

  public int getNrtotal() {
    return nrtotal;
  }

  public int getCities() {
    return cities;
  }

  public String getLatitude() {
    return latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public String getScore() {
    return score;
  }

  public String getPopulation() {
    return population;
  }

  public String getGdp() {
    return gdp;
  }

  public double getTotalinfrastructure() {
    return totalinfrastructure;
  }

  public int getLandarea() {
    return landarea;
  }

  public String getSoldiers() {
    return soldiers;
  }

  public String getSoldiercasualties() {
    return soldiercasualties;
  }

  public String getSoldierskilled() {
    return soldierskilled;
  }

  public String getTanks() {
    return tanks;
  }

  public String getTankcasualties() {
    return tankcasualties;
  }

  public String getTankskilled() {
    return tankskilled;
  }

  public String getAircraft() {
    return aircraft;
  }

  public String getAircraftcasualties() {
    return aircraftcasualties;
  }

  public String getAircraftkilled() {
    return aircraftkilled;
  }

  public String getShips() {
    return ships;
  }

  public String getShipcasualties() {
    return shipcasualties;
  }

  public String getShipskilled() {
    return shipskilled;
  }

  public String getMissiles() {
    return missiles;
  }

  public String getMissilelaunched() {
    return missilelaunched;
  }

  public String getMissileseaten() {
    return missileseaten;
  }

  public String getNukes() {
    return nukes;
  }

  public String getNukeslaunched() {
    return nukeslaunched;
  }

  public String getNukeseaten() {
    return nukeseaten;
  }

  public String getInfdesttot() {
    return infdesttot;
  }

  public String getInfraLost() {
    return infraLost;
  }

  public String getMoneyLooted() {
    return moneyLooted;
  }

  public String getIronworks() {
    return ironworks;
  }

  public String getBauxiteworks() {
    return bauxiteworks;
  }

  public String getArmsstockpile() {
    return armsstockpile;
  }

  public String getEmgasreserve() {
    return emgasreserve;
  }

  public String getMassirrigation() {
    return massirrigation;
  }

  public String getInttradecenter() {
    return inttradecenter;
  }

  public String getMissilelpad() {
    return missilelpad;
  }

  public String getNuclearresfac() {
    return nuclearresfac;
  }

  public String getIrondome() {
    return irondome;
  }

  public String getVitaldefsys() {
    return vitaldefsys;
  }

  public String getIntagncy() {
    return intagncy;
  }

  public String getUraniumenrich() {
    return uraniumenrich;
  }

  public String getPropbureau() {
    return propbureau;
  }

  public String getCenciveng() {
    return cenciveng;
  }

  public String getVmode() {
    return vmode;
  }

  public int getOffensivewars() {
    return offensivewars;
  }

  public int getDefensivewars() {
    return defensivewars;
  }

  public List<Object> getOffensivewarIds() {
    return offensivewarIds;
  }

  public List<String> getDefensivewarIds() {
    return defensivewarIds;
  }

  public int getBeigeTurnsLeft() {
    return beigeTurnsLeft;
  }

  public double getRadiationIndex() {
    return radiationIndex;
  }

  public String getSeason() {
    return season;
  }
}
