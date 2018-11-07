package ml.squidnet.queries;

import ml.squidnet.domains.Nations;
import ml.squidnet.enums.URL;

public class NationsQuery implements IEntityQuery {
  @Override
  public ApiQuery build() {
    String url = URL.NATIONS_URL.getUrl();
    return new ApiQuery<>(url,new Nations());
  }
}
