package ml.squidnet.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ml.squidnet.domains.subdomains.AllianceBankContent;

import java.util.List;

public class Bank extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("alliance_bank_contents")
  @Expose
  private List<AllianceBankContent> allianceBankContents = null;

  public boolean isSuccess() {
    return success;
  }

  public List<AllianceBankContent> getAllianceBankContents() {
    return allianceBankContents;
  }
}
