package ml.squidnet.queries;

import ml.squidnet.domains.Members;
import ml.squidnet.enums.QueryURL;

public class MembersQuery extends AuthenticatedQuery implements IEntityQuery {

  private int aid;
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
