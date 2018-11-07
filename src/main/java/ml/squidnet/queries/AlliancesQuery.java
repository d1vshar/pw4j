package ml.squidnet.queries;

import ml.squidnet.domains.Alliances;
import ml.squidnet.enums.URL;

public class AlliancesQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = URL.ALLIANCES_URL.getUrl();
    return new ApiQuery<>(url,new Alliances());
  }
}
