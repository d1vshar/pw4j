package io.github.adorableskullmaster.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.domains.subdomains.SAlliance;

import java.util.List;

public class Alliances extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("alliances")
  @Expose
  private List<SAlliance> alliances = null;

  public boolean isSuccess() {
    return success;
  }

  public List<SAlliance> getAlliances() {
    return alliances;
  }
}
