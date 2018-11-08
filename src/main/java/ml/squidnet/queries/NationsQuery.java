package ml.squidnet.queries;

import ml.squidnet.domains.Nations;
import ml.squidnet.enums.QueryURL;

public class NationsQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = QueryURL.NATIONS_URL.getUrl();
    return new ApiQuery<>(url,new Nations());
  }
}
