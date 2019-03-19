package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Nation;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class NationQuery extends Query {

  public NationQuery(int nid, String apiKey) {
    super(Integer.toString(nid), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.NATION_URL, args), new Nation());
  }
}
