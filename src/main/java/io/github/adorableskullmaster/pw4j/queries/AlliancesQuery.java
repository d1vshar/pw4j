package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Alliances;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AlliancesQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = QueryURL.ALLIANCES_URL.getUrl();
    return new ApiQuery<>(url,new Alliances());
  }
}
