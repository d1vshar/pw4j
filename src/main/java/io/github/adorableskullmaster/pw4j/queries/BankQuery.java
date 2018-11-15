package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Bank;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

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
