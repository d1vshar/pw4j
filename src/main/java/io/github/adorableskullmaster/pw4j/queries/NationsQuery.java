package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Nations;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class NationsQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = QueryURL.NATIONS_URL.getUrl();
    return new ApiQuery<>(url,new Nations());
  }
}
