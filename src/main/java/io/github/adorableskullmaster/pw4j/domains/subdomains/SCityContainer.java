package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SCityContainer {
  @SerializedName("nation_id")
  @Expose
  private String nationId;
  @SerializedName("city_id")
  @Expose
  private String cityId;
  @SerializedName("city_name")
  @Expose
  private String cityName;
  @SerializedName("capital")
  @Expose
  private String capital;
  @SerializedName("infrastructure")
  @Expose
  private String infrastructure;
  @SerializedName("maxinfra")
  @Expose
  private String maxinfra;
  @SerializedName("land")
  @Expose
  private String land;

  public String getNationId() {
    return nationId;
  }

  public String getCityId() {
    return cityId;
  }

  public String getCityName() {
    return cityName;
  }

  public String getCapital() {
    return capital;
  }

  public String getInfrastructure() {
    return infrastructure;
  }

  public String getMaxinfra() {
    return maxinfra;
  }

  public String getLand() {
    return land;
  }
}