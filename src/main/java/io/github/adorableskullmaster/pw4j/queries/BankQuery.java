package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Bank;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class BankQuery extends Query {

  public BankQuery(int aid, String apiKey) {
    super(Integer.toString(aid), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.BANK_URL, args), new Bank());
  }
}
