package io.github.adorableskullmaster.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.domains.subdomains.SNation;

import java.util.List;

public class Nations extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nations")
  @Expose
  private List<SNation> nations = null;

  public boolean isSuccess() {
    return success;
  }

  public List<SNation> getNations() {
    return nations;
  }
}
