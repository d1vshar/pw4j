package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApplicantNations {
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
  @SerializedName("cities")
  @Expose
  private int cities;
  @SerializedName("score")
  @Expose
  private int score;

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

  public int getCities() {
    return cities;
  }

  public int getScore() {
    return score;
  }
}
