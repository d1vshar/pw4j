package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.NationMilitaryContainer;

import java.util.List;

public class NationMilitary extends Entity {
  @SerializedName("success")
  @Expose
  private Boolean success;
  @SerializedName("nation_militaries")
  @Expose
  private List<NationMilitaryContainer> nationMilitaries = null;

  public Boolean isSuccess() {
    return success;
  }

  public List<NationMilitaryContainer> getNationMilitaries() {
    return nationMilitaries;
  }
}
