package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.SWarContainer;

import java.util.List;

public class Wars extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("wars")
  @Expose
  private List<SWarContainer> wars = null;

  public boolean isSuccess() {
    return success;
  }

  public List<SWarContainer> getWars() {
    return wars;
  }
}
