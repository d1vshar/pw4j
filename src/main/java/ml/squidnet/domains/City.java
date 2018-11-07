package ml.squidnet.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("cityid")
  @Expose
  private String cityid;
  @SerializedName("url")
  @Expose
  public String url;
  @SerializedName("nationid")
  @Expose
  private String nationid;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("nation")
  @Expose
  private String nation;
  @SerializedName("leader")
  @Expose
  private String leader;
  @SerializedName("continent")
  @Expose
  private String continent;
  @SerializedName("founded")
  @Expose
  private String founded;
  @SerializedName("age")
  @Expose
  private int age;
  @SerializedName("powered")
  @Expose
  private String powered;
  @SerializedName("infrastructure")
  @Expose
  private String infrastructure;
  @SerializedName("land")
  @Expose
  private String land;
  @SerializedName("population")
  @Expose
  private double population;
  @SerializedName("popdensity")
  @Expose
  private double popdensity;
  @SerializedName("crime")
  @Expose
  private double crime;
  @SerializedName("disease")
  @Expose
  private double disease;
  @SerializedName("commerce")
  @Expose
  private double commerce;
  @SerializedName("avgincome")
  @Expose
  private double avgincome;
  @SerializedName("pollution")
  @Expose
  private double pollution;
  @SerializedName("nuclearpollution")
  @Expose
  private double nuclearpollution;
  @SerializedName("basepop")
  @Expose
  private double basepop;
  @SerializedName("basepopdensity")
  @Expose
  private double basepopdensity;
  @SerializedName("minimumwage")
  @Expose
  private double minimumwage;
  @SerializedName("poplostdisease")
  @Expose
  private double poplostdisease;
  @SerializedName("poplostcrime")
  @Expose
  private double poplostcrime;
  @SerializedName("imp_coalpower")
  @Expose
  private String impCoalpower;
  @SerializedName("imp_oilpower")
  @Expose
  private String impOilpower;
  @SerializedName("imp_nuclearpower")
  @Expose
  private String impNuclearpower;
  @SerializedName("imp_windpower")
  @Expose
  private String impWindpower;
  @SerializedName("imp_coalmine")
  @Expose
  private String impCoalmine;
  @SerializedName("imp_oilwell")
  @Expose
  private String impOilwell;
  @SerializedName("imp_ironmine")
  @Expose
  private String impIronmine;
  @SerializedName("imp_bauxitemine")
  @Expose
  private String impBauxitemine;
  @SerializedName("imp_leadmine")
  @Expose
  private String impLeadmine;
  @SerializedName("imp_uramine")
  @Expose
  private String impUramine;
  @SerializedName("imp_farm")
  @Expose
  private String impFarm;
  @SerializedName("imp_gasrefinery")
  @Expose
  private String impGasrefinery;
  @SerializedName("imp_steelmill")
  @Expose
  private String impSteelmill;
  @SerializedName("imp_aluminumrefinery")
  @Expose
  private String impAluminumrefinery;
  @SerializedName("imp_munitionsfactory")
  @Expose
  private String impMunitionsfactory;
  @SerializedName("imp_policestation")
  @Expose
  private String impPolicestation;
  @SerializedName("imp_hospital")
  @Expose
  private String impHospital;
  @SerializedName("imp_recyclingcenter")
  @Expose
  private String impRecyclingcenter;
  @SerializedName("imp_subway")
  @Expose
  private String impSubway;
  @SerializedName("imp_supermarket")
  @Expose
  private String impSupermarket;
  @SerializedName("imp_bank")
  @Expose
  private String impBank;
  @SerializedName("imp_mall")
  @Expose
  private String impMall;
  @SerializedName("imp_stadium")
  @Expose
  private String impStadium;
  @SerializedName("imp_barracks")
  @Expose
  private String impBarracks;
  @SerializedName("imp_factory")
  @Expose
  private String impFactory;
  @SerializedName("imp_hangar")
  @Expose
  private String impHangar;
  @SerializedName("imp_drydock")
  @Expose
  private String impDrydock;

  public boolean isSuccess() {
    return success;
  }

  public String getCityid() {
    return cityid;
  }

  public String getUrl() {
    return url;
  }

  public String getNationid() {
    return nationid;
  }

  public String getName() {
    return name;
  }

  public String getNation() {
    return nation;
  }

  public String getLeader() {
    return leader;
  }

  public String getContinent() {
    return continent;
  }

  public String getFounded() {
    return founded;
  }

  public int getAge() {
    return age;
  }

  public String getPowered() {
    return powered;
  }

  public String getInfrastructure() {
    return infrastructure;
  }

  public String getLand() {
    return land;
  }

  public double getPopulation() {
    return population;
  }

  public double getPopdensity() {
    return popdensity;
  }

  public double getCrime() {
    return crime;
  }

  public double getDisease() {
    return disease;
  }

  public double getCommerce() {
    return commerce;
  }

  public double getAvgincome() {
    return avgincome;
  }

  public double getPollution() {
    return pollution;
  }

  public double getNuclearpollution() {
    return nuclearpollution;
  }

  public double getBasepop() {
    return basepop;
  }

  public double getBasepopdensity() {
    return basepopdensity;
  }

  public double getMinimumwage() {
    return minimumwage;
  }

  public double getPoplostdisease() {
    return poplostdisease;
  }

  public double getPoplostcrime() {
    return poplostcrime;
  }

  public String getImpCoalpower() {
    return impCoalpower;
  }

  public String getImpOilpower() {
    return impOilpower;
  }

  public String getImpNuclearpower() {
    return impNuclearpower;
  }

  public String getImpWindpower() {
    return impWindpower;
  }

  public String getImpCoalmine() {
    return impCoalmine;
  }

  public String getImpOilwell() {
    return impOilwell;
  }

  public String getImpIronmine() {
    return impIronmine;
  }

  public String getImpBauxitemine() {
    return impBauxitemine;
  }

  public String getImpLeadmine() {
    return impLeadmine;
  }

  public String getImpUramine() {
    return impUramine;
  }

  public String getImpFarm() {
    return impFarm;
  }

  public String getImpGasrefinery() {
    return impGasrefinery;
  }

  public String getImpSteelmill() {
    return impSteelmill;
  }

  public String getImpAluminumrefinery() {
    return impAluminumrefinery;
  }

  public String getImpMunitionsfactory() {
    return impMunitionsfactory;
  }

  public String getImpPolicestation() {
    return impPolicestation;
  }

  public String getImpHospital() {
    return impHospital;
  }

  public String getImpRecyclingcenter() {
    return impRecyclingcenter;
  }

  public String getImpSubway() {
    return impSubway;
  }

  public String getImpSupermarket() {
    return impSupermarket;
  }

  public String getImpBank() {
    return impBank;
  }

  public String getImpMall() {
    return impMall;
  }

  public String getImpStadium() {
    return impStadium;
  }

  public String getImpBarracks() {
    return impBarracks;
  }

  public String getImpFactory() {
    return impFactory;
  }

  public String getImpHangar() {
    return impHangar;
  }

  public String getImpDrydock() {
    return impDrydock;
  }
}
