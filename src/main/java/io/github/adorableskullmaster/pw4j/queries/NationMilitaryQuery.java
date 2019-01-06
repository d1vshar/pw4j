package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.NationMilitary;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class NationMilitaryQuery extends AuthenticatedQuery implements IEntityQuery {

  public NationMilitaryQuery(String apiKey) {
    super.apiKey = apiKey;
  }

  @Override
  public ApiQuery build() {
    checkApiKey();
    String url = QueryURL.NATION_MILITARY_URL.getUrl().concat("key=").concat(apiKey);
    return new ApiQuery<>(url, new NationMilitary());
  }
}
