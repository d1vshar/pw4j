package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.MemberNation;

import java.util.List;

public class Members extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nations")
  @Expose
  private List<MemberNation> nations = null;

  public boolean isSuccess() {
    return success;
  }

  public List<MemberNation> getNations() {
    return nations;
  }
}
