package ml.squidnet.queries;

import ml.squidnet.domains.Alliances;
import ml.squidnet.enums.QueryURL;

public class AlliancesQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = QueryURL.ALLIANCES_URL.getUrl();
    return new ApiQuery<>(url,new Alliances());
  }
}
