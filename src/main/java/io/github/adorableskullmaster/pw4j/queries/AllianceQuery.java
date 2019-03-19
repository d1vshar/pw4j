package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Alliance;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AllianceQuery extends Query {

  public AllianceQuery(int aid, String apiKey) {
    super(Integer.toString(aid), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.ALLIANCE_URL, args), new Alliance());
  }
}
