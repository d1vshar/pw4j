package io.github.adorableskullmaster.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MWar {
  @SerializedName("war_ended")
  @Expose
  private boolean warEnded;
  @SerializedName("date")
  @Expose
  private String date;
  @SerializedName("aggressor_id")
  @Expose
  private String aggressorId;
  @SerializedName("defender_id")
  @Expose
  private String defenderId;
  @SerializedName("aggressor_alliance_name")
  @Expose
  private String aggressorAllianceName;
  @SerializedName("aggressor_is_applicant")
  @Expose
  private boolean aggressorIsApplicant;
  @SerializedName("defender_alliance_name")
  @Expose
  private String defenderAllianceName;
  @SerializedName("defender_is_applicant")
  @Expose
  private boolean defenderIsApplicant;
  @SerializedName("aggressor_offering_peace")
  @Expose
  private boolean aggressorOfferingPeace;
  @SerializedName("war_reason")
  @Expose
  private String warReason;
  @SerializedName("ground_control")
  @Expose
  private String groundControl;
  @SerializedName("air_superiority")
  @Expose
  private String airSuperiority;
  @SerializedName("blockade")
  @Expose
  private String blockade;
  @SerializedName("aggressor_military_action_points")
  @Expose
  private String aggressorMilitaryActionPoints;
  @SerializedName("defender_military_action_points")
  @Expose
  private String defenderMilitaryActionPoints;
  @SerializedName("aggressor_resistance")
  @Expose
  private String aggressorResistance;
  @SerializedName("defender_resistance")
  @Expose
  private String defenderResistance;
  @SerializedName("aggressor_is_fortified")
  @Expose
  private boolean aggressorIsFortified;
  @SerializedName("defender_is_fortified")
  @Expose
  private boolean defenderIsFortified;
  @SerializedName("turns_left")
  @Expose
  private int turnsLeft;
  @SerializedName("war_type")
  @Expose
  private String warType;
  @SerializedName("aggressor_infra_lost")
  @Expose
  private int aggressorInfraLost;
  @SerializedName("defender_infra_lost")
  @Expose
  private int defenderInfraLost;
  @SerializedName("aggressor_money_lost")
  @Expose
  private int aggressorMoneyLost;
  @SerializedName("defender_money_lost")
  @Expose
  private int defenderMoneyLost;
  @SerializedName("aggressor_soldiers_lost")
  @Expose
  private int aggressorSoldiersLost;
  @SerializedName("defender_soldiers_lost")
  @Expose
  private int defenderSoldiersLost;
  @SerializedName("aggressor_tanks_lost")
  @Expose
  private int aggressorTanksLost;
  @SerializedName("defender_tanks_lost")
  @Expose
  private int defenderTanksLost;
  @SerializedName("aggressor_aircraft_lost")
  @Expose
  private int aggressorAircraftLost;
  @SerializedName("defender_aircraft_lost")
  @Expose
  private int defenderAircraftLost;
  @SerializedName("aggressor_ships_lost")
  @Expose
  private int aggressorShipsLost;
  @SerializedName("defender_ships_lost")
  @Expose
  private int defenderShipsLost;

  public boolean isWarEnded() {
    return warEnded;
  }

  public String getDate() {
    return date;
  }

  public String getAggressorId() {
    return aggressorId;
  }

  public String getDefenderId() {
    return defenderId;
  }

  public String getAggressorAllianceName() {
    return aggressorAllianceName;
  }

  public boolean isAggressorIsApplicant() {
    return aggressorIsApplicant;
  }

  public String getDefenderAllianceName() {
    return defenderAllianceName;
  }

  public boolean isDefenderIsApplicant() {
    return defenderIsApplicant;
  }

  public boolean isAggressorOfferingPeace() {
    return aggressorOfferingPeace;
  }

  public String getWarReason() {
    return warReason;
  }

  public String getGroundControl() {
    return groundControl;
  }

  public String getAirSuperiority() {
    return airSuperiority;
  }

  public String getBlockade() {
    return blockade;
  }

  public String getAggressorMilitaryActionPoints() {
    return aggressorMilitaryActionPoints;
  }

  public String getDefenderMilitaryActionPoints() {
    return defenderMilitaryActionPoints;
  }

  public String getAggressorResistance() {
    return aggressorResistance;
  }

  public String getDefenderResistance() {
    return defenderResistance;
  }

  public boolean isAggressorIsFortified() {
    return aggressorIsFortified;
  }

  public boolean isDefenderIsFortified() {
    return defenderIsFortified;
  }

  public int getTurnsLeft() {
    return turnsLeft;
  }

  public String getWarType() {
    return warType;
  }

  public int getAggressorInfraLost() {
    return aggressorInfraLost;
  }

  public int getDefenderInfraLost() {
    return defenderInfraLost;
  }

  public int getAggressorMoneyLost() {
    return aggressorMoneyLost;
  }

  public int getDefenderMoneyLost() {
    return defenderMoneyLost;
  }

  public int getAggressorSoldiersLost() {
    return aggressorSoldiersLost;
  }

  public int getDefenderSoldiersLost() {
    return defenderSoldiersLost;
  }

  public int getAggressorTanksLost() {
    return aggressorTanksLost;
  }

  public int getDefenderTanksLost() {
    return defenderTanksLost;
  }

  public int getAggressorAircraftLost() {
    return aggressorAircraftLost;
  }

  public int getDefenderAircraftLost() {
    return defenderAircraftLost;
  }

  public int getAggressorShipsLost() {
    return aggressorShipsLost;
  }

  public int getDefenderShipsLost() {
    return defenderShipsLost;
  }
}
