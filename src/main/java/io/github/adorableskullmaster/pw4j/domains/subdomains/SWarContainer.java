package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SWarContainer {
  @SerializedName("warID")
  @Expose
  private int warID;
  @SerializedName("attackerID")
  @Expose
  private int attackerID;
  @SerializedName("defenderID")
  @Expose
  private int defenderID;
  @SerializedName("attackerAA")
  @Expose
  private String attackerAA;
  @SerializedName("defenderAA")
  @Expose
  private String defenderAA;
  @SerializedName("war_type")
  @Expose
  private String warType;
  @SerializedName("status")
  @Expose
  private String status;
  @SerializedName("date")
  @Expose
  private String date;

  public int getWarID() {
    return warID;
  }

  public int getAttackerID() {
    return attackerID;
  }

  public int getDefenderID() {
    return defenderID;
  }

  public String getAttackerAA() {
    return attackerAA;
  }

  public String getDefenderAA() {
    return defenderAA;
  }

  public String getWarType() {
    return warType;
  }

  public String getStatus() {
    return status;
  }

  public String getDate() {
    return date;
  }
}
