package io.github.adorableskullmaster.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Alliance extends Entity {
  @SerializedName("leaderids")
  @Expose
  private List<Integer> leaderids = null;
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("allianceid")
  @Expose
  private String allianceid;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("acronym")
  @Expose
  private String acronym;
  @SerializedName("score")
  @Expose
  private String score;
  @SerializedName("color")
  @Expose
  private String color;
  @SerializedName("members")
  @Expose
  private int members;
  @SerializedName("member_id_list")
  @Expose
  private List<Integer> memberIdList = null;
  @SerializedName("vmodemembers")
  @Expose
  private int vmodemembers;
  @SerializedName("accepting members")
  @Expose
  private String acceptingMembers;
  @SerializedName("applicants")
  @Expose
  private int applicants;
  @SerializedName("flagurl")
  @Expose
  private String flagurl;
  @SerializedName("forumurl")
  @Expose
  private String forumurl;
  @SerializedName("irc")
  @Expose
  private String irc;
  @SerializedName("gdp")
  @Expose
  private double gdp;
  @SerializedName("cities")
  @Expose
  private int cities;
  @SerializedName("soldiers")
  @Expose
  private int soldiers;
  @SerializedName("tanks")
  @Expose
  private int tanks;
  @SerializedName("aircraft")
  @Expose
  private int aircraft;
  @SerializedName("ships")
  @Expose
  private int ships;
  @SerializedName("missiles")
  @Expose
  private int missiles;
  @SerializedName("nukes")
  @Expose
  private int nukes;
  @SerializedName("treasures")
  @Expose
  private int treasures;

  public List<Integer> getLeaderids() {
    return leaderids;
  }

  public boolean isSuccess() {
    return success;
  }

  public String getAllianceid() {
    return allianceid;
  }

  public String getName() {
    return name;
  }

  public String getAcronym() {
    return acronym;
  }

  public String getScore() {
    return score;
  }

  public String getColor() {
    return color;
  }

  public int getMembers() {
    return members;
  }

  public List<Integer> getMemberIdList() {
    return memberIdList;
  }

  public int getVmodemembers() {
    return vmodemembers;
  }

  public String getAcceptingMembers() {
    return acceptingMembers;
  }

  public int getApplicants() {
    return applicants;
  }

  public String getFlagurl() {
    return flagurl;
  }

  public String getForumurl() {
    return forumurl;
  }

  public String getIrc() {
    return irc;
  }

  public double getGdp() {
    return gdp;
  }

  public int getCities() {
    return cities;
  }

  public int getSoldiers() {
    return soldiers;
  }

  public int getTanks() {
    return tanks;
  }

  public int getAircraft() {
    return aircraft;
  }

  public int getShips() {
    return ships;
  }

  public int getMissiles() {
    return missiles;
  }

  public int getNukes() {
    return nukes;
  }

  public int getTreasures() {
    return treasures;
  }
}
