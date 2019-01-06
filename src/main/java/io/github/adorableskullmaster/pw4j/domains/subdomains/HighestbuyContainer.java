package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HighestbuyContainer {
  @SerializedName("date")
  @Expose
  private String date;
  @SerializedName("nationid")
  @Expose
  private String nationid;
  @SerializedName("amount")
  @Expose
  private String amount;
  @SerializedName("price")
  @Expose
  private String price;
  @SerializedName("totalvalue")
  @Expose
  private int totalvalue;

  public String getDate() {
    return date;
  }

  public String getNationid() {
    return nationid;
  }

  public String getAmount() {
    return amount;
  }

  public String getPrice() {
    return price;
  }

  public int getTotalvalue() {
    return totalvalue;
  }
}
