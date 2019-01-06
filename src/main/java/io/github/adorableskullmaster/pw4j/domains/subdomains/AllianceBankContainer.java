package io.github.adorableskullmaster.pw4j.domains.subdomains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllianceBankContainer {
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
  private double money;
  @SerializedName("food")
  @Expose
  private double food;
  @SerializedName("coal")
  @Expose
  private double coal;
  @SerializedName("oil")
  @Expose
  private double oil;
  @SerializedName("uranium")
  @Expose
  private double uranium;
  @SerializedName("iron")
  @Expose
  private double iron;
  @SerializedName("bauxite")
  @Expose
  private double bauxite;
  @SerializedName("lead")
  @Expose
  private double lead;
  @SerializedName("gasoline")
  @Expose
  private double gasoline;
  @SerializedName("munitions")
  @Expose
  private double munitions;
  @SerializedName("steel")
  @Expose
  private double steel;
  @SerializedName("aluminum")
  @Expose
  private double aluminum;

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

  public double getMoney() {
    return money;
  }

  public double getFood() {
    return food;
  }

  public double getCoal() {
    return coal;
  }

  public double getOil() {
    return oil;
  }

  public double getUranium() {
    return uranium;
  }

  public double getIron() {
    return iron;
  }

  public double getBauxite() {
    return bauxite;
  }

  public double getLead() {
    return lead;
  }

  public double getGasoline() {
    return gasoline;
  }

  public double getMunitions() {
    return munitions;
  }

  public double getSteel() {
    return steel;
  }

  public double getAluminum() {
    return aluminum;
  }
}
