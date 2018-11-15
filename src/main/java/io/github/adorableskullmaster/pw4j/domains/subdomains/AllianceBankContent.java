package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllianceBankContent {
  @SerializedName("alliance_id")
  @Expose
  private int allianceId;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("taxrate")
  @Expose
  private int taxrate;
  @SerializedName("resource_taxrate")
  @Expose
  private int resourceTaxrate;
  @SerializedName("money")
  @Expose
  private int money;
  @SerializedName("food")
  @Expose
  private int food;
  @SerializedName("coal")
  @Expose
  private int coal;
  @SerializedName("oil")
  @Expose
  private int oil;
  @SerializedName("uranium")
  @Expose
  private int uranium;
  @SerializedName("iron")
  @Expose
  private int iron;
  @SerializedName("bauxite")
  @Expose
  private int bauxite;
  @SerializedName("lead")
  @Expose
  private int lead;
  @SerializedName("gasoline")
  @Expose
  private int gasoline;
  @SerializedName("munitions")
  @Expose
  private int munitions;
  @SerializedName("steel")
  @Expose
  private int steel;
  @SerializedName("aluminum")
  @Expose
  private int aluminum;

  public int getAllianceId() {
    return allianceId;
  }

  public String getName() {
    return name;
  }

  public int getTaxrate() {
    return taxrate;
  }

  public int getResourceTaxrate() {
    return resourceTaxrate;
  }

  public int getMoney() {
    return money;
  }

  public int getFood() {
    return food;
  }

  public int getCoal() {
    return coal;
  }

  public int getOil() {
    return oil;
  }

  public int getUranium() {
    return uranium;
  }

  public int getIron() {
    return iron;
  }

  public int getBauxite() {
    return bauxite;
  }

  public int getLead() {
    return lead;
  }

  public int getGasoline() {
    return gasoline;
  }

  public int getMunitions() {
    return munitions;
  }

  public int getSteel() {
    return steel;
  }

  public int getAluminum() {
    return aluminum;
  }
}
