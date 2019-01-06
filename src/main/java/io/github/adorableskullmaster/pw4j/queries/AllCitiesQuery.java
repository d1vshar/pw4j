package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.AllCities;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AllCitiesQuery extends AuthenticatedQuery implements IEntityQuery {

  public AllCitiesQuery(String apiKey) {
    super.apiKey = apiKey;
  }

  @Override
  public ApiQuery build() {
    checkApiKey();
    String url = QueryURL.ALL_CITIES_URL.getUrl().concat("key=").concat(apiKey);
    return new ApiQuery<>(url, new AllCities());
  }
}
