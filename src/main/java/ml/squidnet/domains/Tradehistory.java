package ml.squidnet.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ml.squidnet.domains.subdomains.Trade;

import java.util.List;

public class Tradehistory extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("trades")
  @Expose
  private List<Trade> trades = null;

  public boolean isSuccess() {
    return success;
  }

  public List<Trade> getTrades() {
    return trades;
  }
}
