package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.AllianceBankContainer;

import java.util.List;

public class Bank extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("alliance_bank_contents")
  @Expose
  private List<AllianceBankContainer> allianceBankContainers = null;

  public boolean isSuccess() {
    return success;
  }

  public List<AllianceBankContainer> getAllianceBanks() {
    return allianceBankContainers;
  }
}
