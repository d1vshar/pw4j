package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.SCityContainer;

import java.util.List;

public class AllCities extends Entity {
  @SerializedName("success")
  @Expose
  private Boolean success;
  @SerializedName("all_cities")
  @Expose
  private List<SCityContainer> allCities = null;

  public Boolean isSuccess() {
    return success;
  }

  public List<SCityContainer> getAllCities() {
    return allCities;
  }

}
