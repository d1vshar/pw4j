package ml.squidnet.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ml.squidnet.domains.subdomains.SWar;

import java.util.List;

public class Wars extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("wars")
  @Expose
  private List<SWar> wars = null;

  public boolean isSuccess() {
    return success;
  }

  public List<SWar> getWars() {
    return wars;
  }
}
