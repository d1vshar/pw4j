package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.domains.Alliances;
import io.github.adorableskullmaster.enums.QueryURL;

public class AlliancesQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = QueryURL.ALLIANCES_URL.getUrl();
    return new ApiQuery<>(url,new Alliances());
  }
}
