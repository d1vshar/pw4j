package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.TradeContainer;

import java.util.List;

public class TradeHistory extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("trades")
  @Expose
  private List<TradeContainer> tradeContainers = null;

  public boolean isSuccess() {
    return success;
  }

  public List<TradeContainer> getTrades() {
    return tradeContainers;
  }
}
