package ml.squidnet.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Members extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nations")
  @Expose
  private List<Nation> nations = null;

  public boolean isSuccess() {
    return success;
  }

  public List<Nation> getNations() {
    return nations;
  }
}
