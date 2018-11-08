package ml.squidnet.queries;

import ml.squidnet.domains.Bank;
import ml.squidnet.enums.QueryURL;

public class BankQuery extends AuthenticatedQuery implements IEntityQuery {

  private int aid;

  public BankQuery(String apiKey, int aid) {
    super.apiKey = apiKey;
    this.aid = aid;
  }

  @Override
  public ApiQuery build() {
    checkApiKey();
    String url = QueryURL.BANK_URL.getUrl().concat("?allianceid=").concat(Integer.toString(aid)).concat("&key=").concat(apiKey);
    return new ApiQuery<>(url,new Bank());
  }
}
