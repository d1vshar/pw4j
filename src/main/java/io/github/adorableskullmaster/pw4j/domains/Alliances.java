package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.SAllianceContainer;

import java.util.List;

public class Alliances extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("alliances")
  @Expose
  private List<SAllianceContainer> alliances = null;

  public boolean isSuccess() {
    return success;
  }

  public List<SAllianceContainer> getAlliances() {
    return alliances;
  }
}
