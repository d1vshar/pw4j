package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.MemberNationContainer;

import java.util.List;

public class Members extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nations")
  @Expose
  private List<MemberNationContainer> nations = null;

  public boolean isSuccess() {
    return success;
  }

  public List<MemberNationContainer> getNations() {
    return nations;
  }
}
