package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SNationContainer {
  @SerializedName("nationid")
  @Expose
  private int nationid;
  @SerializedName("nation")
  @Expose
  private String nation;
  @SerializedName("leader")
  @Expose
  private String leader;
  @SerializedName("continent")
  @Expose
  private String continent;
  @SerializedName("war_policy")
  @Expose
  private String warPolicy;
  @SerializedName("color")
  @Expose
  private String color;
  @SerializedName("alliance")
  @Expose
  private String alliance;
  @SerializedName("allianceid")
  @Expose
  private int allianceid;
  @SerializedName("allianceposition")
  @Expose
  private int allianceposition;
  @SerializedName("cities")
  @Expose
  private int cities;
  @SerializedName("offensivewars")
  @Expose
  private int offensivewars;
  @SerializedName("defensivewars")
  @Expose
  private int defensivewars;
  @SerializedName("score")
  @Expose
  private int score;
  @SerializedName("rank")
  @Expose
  private int rank;
  @SerializedName("vacmode")
  @Expose
  private String vacmode;
  @SerializedName("minutessinceactive")
  @Expose
  private int minutessinceactive;

  public int getNationid() {
    return nationid;
  }

  public String getNation() {
    return nation;
  }

  public String getLeader() {
    return leader;
  }

  public String getContinent() {
    return continent;
  }

  public String getWarPolicy() {
    return warPolicy;
  }

  public String getColor() {
    return color;
  }

  public String getAlliance() {
    return alliance;
  }

  public int getAllianceid() {
    return allianceid;
  }

  public int getAllianceposition() {
    return allianceposition;
  }

  public int getCities() {
    return cities;
  }

  public int getOffensivewars() {
    return offensivewars;
  }

  public int getDefensivewars() {
    return defensivewars;
  }

  public int getScore() {
    return score;
  }

  public int getRank() {
    return rank;
  }

  public String getVacmode() {
    return vacmode;
  }

  public int getMinutessinceactive() {
    return minutessinceactive;
  }
}
