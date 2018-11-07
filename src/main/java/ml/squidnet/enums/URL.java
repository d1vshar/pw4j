package ml.squidnet.enums;

public enum URL {
  BASE_URL("https://politicsandwar.com/api/"),
  NATION_URL("https://politicsandwar.com/api/nation/"),
  NATIONS_URL("https://politicsandwar.com/api/nations/"),
  ALLIANCE_URL("https://politicsandwar.com/api/alliance/"),
  ALLIANCES_URL("https://politicsandwar.com/api/alliances/"),
  WAR_URL("https://politicsandwar.com/api/war/"),
  WARS_URL("https://politicsandwar.com/api/wars/"),
  BANK_URL("https://politicsandwar.com/api/alliance-bank/"),
  MEMBERS_URL("https://politicsandwar.com/api/alliance-members/"),
  APPLICANTS_URL("https://politicsandwar.com/api/applicants/"),
  CITY_URL("https://politicsandwar.com/api/city/"),
  TRADEPRICE_URL("https://politicsandwar.com/api/tradeprice/");

  private final String url;

  URL(final String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}