package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class SNationContainer {
  @SerializedName("nationid")
  @Expose
  private Integer nationid;
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
  private Integer allianceid;
  @SerializedName("allianceposition")
  @Expose
  private Integer allianceposition;
  @SerializedName("cities")
  @Expose
  private Integer cities;
  @SerializedName("infrastructure")
  @Expose
  private Integer infrastructure;
  @SerializedName("offensivewars")
  @Expose
  private Integer offensivewars;
  @SerializedName("defensivewars")
  @Expose
  private Integer defensivewars;
  @SerializedName("score")
  @Expose
  private Double score;
  @SerializedName("rank")
  @Expose
  private Integer rank;
  @SerializedName("vacmode")
  @Expose
  private Integer vacmode;
  @SerializedName("minutessinceactive")
  @Expose
  private Integer minutessinceactive;

  public Integer getNationid() {
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

  public Integer getAllianceid() {
    return allianceid;
  }

  public Integer getAllianceposition() {
    return allianceposition;
  }

  public Integer getCities() {
    return cities;
  }

  public Integer getOffensivewars() {
    return offensivewars;
  }

  public Integer getDefensivewars() {
    return defensivewars;
  }

  public Double getScore() {
    return score;
  }

  public Integer getRank() {
    return rank;
  }

  public Integer getVacmode() {
    return vacmode;
  }

  public Integer getMinutessinceactive() {
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

  public Integer getInfrastructure() {
    return infrastructure;
  }

  public void setInfrastructure(Integer infrastructure) {
    this.infrastructure = infrastructure;
  }
}
