package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Alliances;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AlliancesQuery extends Query {

  public AlliancesQuery(String apiKey) {
    super(apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.ALLIANCES_URL, args), new Alliances());
  }
}