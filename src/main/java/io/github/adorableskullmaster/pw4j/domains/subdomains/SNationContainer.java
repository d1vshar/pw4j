package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

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
  private double score;
  @SerializedName("rank")
  @Expose
  private int rank;
  @SerializedName("vacmode")
  @Expose
  private String vacmode;
  @SerializedName("minutessinceactive")
  @Expose
  private int minutessinceactive;

  public int getNationId() {
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

  public double getScore() {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SNationContainer container = (SNationContainer) o;
    return nationid == container.nationid &&
        allianceid == container.allianceid &&
        allianceposition == container.allianceposition &&
        cities == container.cities &&
        offensivewars == container.offensivewars &&
        defensivewars == container.defensivewars &&
        Double.compare(container.score, score) == 0 &&
        rank == container.rank &&
        minutessinceactive == container.minutessinceactive &&
        Objects.equals(nation, container.nation) &&
        Objects.equals(leader, container.leader) &&
        Objects.equals(continent, container.continent) &&
        Objects.equals(warPolicy, container.warPolicy) &&
        Objects.equals(color, container.color) &&
        Objects.equals(alliance, container.alliance) &&
        Objects.equals(vacmode, container.vacmode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nationid, nation, leader, continent, warPolicy, color, alliance, allianceid, allianceposition, cities, offensivewars, defensivewars, score, rank, vacmode, minutessinceactive);
  }

  @Override
  public String toString() {
    return "SNationContainer{" +
        "nationid=" + nationid +
        ", nation='" + nation + '\'' +
        ", leader='" + leader + '\'' +
        ", continent='" + continent + '\'' +
        ", warPolicy='" + warPolicy + '\'' +
        ", color='" + color + '\'' +
        ", alliance='" + alliance + '\'' +
        ", allianceid=" + allianceid +
        ", allianceposition=" + allianceposition +
        ", cities=" + cities +
        ", offensivewars=" + offensivewars +
        ", defensivewars=" + defensivewars +
        ", score=" + score +
        ", rank=" + rank +
        ", vacmode='" + vacmode + '\'' +
        ", minutessinceactive=" + minutessinceactive +
        '}';
  }
}
