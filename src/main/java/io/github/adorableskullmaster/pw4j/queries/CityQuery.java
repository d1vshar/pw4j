package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.City;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class CityQuery extends Query {

  public CityQuery(int cid, String apiKey) {
    super(Integer.toString(cid), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.CITY_URL, args), new City());
  }
}
