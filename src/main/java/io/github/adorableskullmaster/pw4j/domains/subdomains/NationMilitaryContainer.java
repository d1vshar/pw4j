package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NationMilitaryContainer {
  @SerializedName("nation_id")
  @Expose
  private String nationId;
  @SerializedName("vm_indicator")
  @Expose
  private String vmIndicator;
  @SerializedName("score")
  @Expose
  private String score;
  @SerializedName("soldiers")
  @Expose
  private String soldiers;
  @SerializedName("tanks")
  @Expose
  private String tanks;
  @SerializedName("aircraft")
  @Expose
  private String aircraft;
  @SerializedName("ships")
  @Expose
  private String ships;
  @SerializedName("missiles")
  @Expose
  private String missiles;
  @SerializedName("nukes")
  @Expose
  private String nukes;

  public String getNationId() {
    return nationId;
  }

  public String getVmIndicator() {
    return vmIndicator;
  }

  public String getScore() {
    return score;
  }

  public String getSoldiers() {
    return soldiers;
  }

  public String getTanks() {
    return tanks;
  }

  public String getAircraft() {
    return aircraft;
  }

  public String getShips() {
    return ships;
  }

  public String getMissiles() {
    return missiles;
  }

  public String getNukes() {
    return nukes;
  }
}
