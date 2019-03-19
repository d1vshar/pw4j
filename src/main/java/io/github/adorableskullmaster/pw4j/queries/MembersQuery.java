package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Members;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class MembersQuery extends Query {

  public MembersQuery(int aid, String apiKey) {
    super(Integer.toString(aid), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.MEMBERS_URL, args), new Members());
  }
}
