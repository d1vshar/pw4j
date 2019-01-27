package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Members;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class MembersQuery extends AuthenticatedQuery implements IEntityQuery {

  private final int aid;

  public MembersQuery(String apiKey, int aid) {
    super.apiKey = apiKey;
    this.aid = aid;
  }

  @Override
  public ApiQuery build() {
    checkApiKey();
    String url = QueryURL.MEMBERS_URL.getUrl().concat("?allianceid=").concat(Integer.toString(aid)).concat("&key=").concat(apiKey);
    return new ApiQuery<>(url,new Members());
  }
}
