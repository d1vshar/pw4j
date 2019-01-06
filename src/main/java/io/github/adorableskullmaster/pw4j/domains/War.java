package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.WarContainer;

import java.util.List;

public class War extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("war")
  @Expose
  private List<WarContainer> war = null;

  public boolean isSuccess() {
    return success;
  }

  public List<WarContainer> getWar() {
    return war;
  }
}
