package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TradeContainer {
  @SerializedName("trade_id")
  @Expose
  private String tradeId;
  @SerializedName("date")
  @Expose
  private String date;
  @SerializedName("offerer_nation_id")
  @Expose
  private String offererNationId;
  @SerializedName("accepter_nation_id")
  @Expose
  private String accepterNationId;
  @SerializedName("resource")
  @Expose
  private String resource;
  @SerializedName("offer_type")
  @Expose
  private String offerType;
  @SerializedName("quantity")
  @Expose
  private String quantity;
  @SerializedName("price")
  @Expose
  private String price;

  public String getTradeId() {
    return tradeId;
  }

  public String getDate() {
    return date;
  }

  public String getOffererNationId() {
    return offererNationId;
  }

  public String getAccepterNationId() {
    return accepterNationId;
  }

  public String getResource() {
    return resource;
  }

  public String getOfferType() {
    return offerType;
  }

  public String getQuantity() {
    return quantity;
  }

  public String getPrice() {
    return price;
  }
}
