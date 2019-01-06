package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.HighestbuyContainer;
import io.github.adorableskullmaster.pw4j.domains.subdomains.LowestbuyContainer;

public class TradePrice extends Entity {
  @SerializedName("resource")
  @Expose
  private String resource;
  @SerializedName("avgprice")
  @Expose
  private String avgprice;
  @SerializedName("marketindex")
  @Expose
  private String marketindex;
  @SerializedName("highestbuy")
  @Expose
  private HighestbuyContainer highestbuyContainer;
  @SerializedName("lowestbuy")
  @Expose
  private LowestbuyContainer lowestbuyContainer;

  public String getResource() {
    return resource;
  }

  public String getAvgprice() {
    return avgprice;
  }

  public String getMarketindex() {
    return marketindex;
  }

  public HighestbuyContainer getHighestbuy() {
    return highestbuyContainer;
  }

  public LowestbuyContainer getLowestbuy() {
    return lowestbuyContainer;
  }
}
