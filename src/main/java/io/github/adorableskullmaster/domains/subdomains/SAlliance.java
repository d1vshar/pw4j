package io.github.adorableskullmaster.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SAlliance {
  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("founddate")
  @Expose
  private String founddate;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("acronym")
  @Expose
  private String acronym;
  @SerializedName("color")
  @Expose
  private String color;
  @SerializedName("rank")
  @Expose
  private int rank;
  @SerializedName("members")
  @Expose
  private int members;
  @SerializedName("score")
  @Expose
  private double score;
  @SerializedName("officerids")
  @Expose
  private List<String> officerids = null;
  @SerializedName("leaderids")
  @Expose
  private List<String> leaderids = null;
  @SerializedName("heirids")
  @Expose
  private List<String> heirids = null;
  @SerializedName("avgscore")
  @Expose
  private double avgscore;
  @SerializedName("flagurl")
  @Expose
  private String flagurl;
  @SerializedName("forumurl")
  @Expose
  private String forumurl;
  @SerializedName("ircchan")
  @Expose
  private String ircchan;

  public String getId() {
    return id;
  }

  public String getFounddate() {
    return founddate;
  }

  public String getName() {
    return name;
  }

  public String getAcronym() {
    return acronym;
  }

  public String getColor() {
    return color;
  }

  public int getRank() {
    return rank;
  }

  public int getMembers() {
    return members;
  }

  public double getScore() {
    return score;
  }

  public List<String> getOfficerids() {
    return officerids;
  }

  public List<String> getLeaderids() {
    return leaderids;
  }

  public List<String> getHeirids() {
    return heirids;
  }

  public double getAvgscore() {
    return avgscore;
  }

  public String getFlagurl() {
    return flagurl;
  }

  public String getForumurl() {
    return forumurl;
  }

  public String getIrcchan() {
    return ircchan;
  }
}
