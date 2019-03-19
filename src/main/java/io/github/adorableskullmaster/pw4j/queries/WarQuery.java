package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.War;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class WarQuery extends Query {

  public WarQuery(int wid, String apiKey) {
    super(Integer.toString(wid), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.WAR_URL, args), new War());
  }
}
