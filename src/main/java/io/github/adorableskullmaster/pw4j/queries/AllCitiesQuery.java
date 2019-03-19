package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.AllCities;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AllCitiesQuery extends Query {

  public AllCitiesQuery(String apiKey) {
    super(apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.ALL_CITIES_URL, args), new AllCities());
  }
}
