package ml.squidnet.queries;

import ml.squidnet.domains.Tradeprice;
import ml.squidnet.enums.QueryURL;
import ml.squidnet.enums.ResourceType;

public class TradepriceQuery implements IEntityQuery {

  private String resource;

  public TradepriceQuery(ResourceType resource) {
    this.resource = resource.getName();
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.TRADEPRICE_URL.getUrl().concat("resource=").concat(resource);
    return new ApiQuery<>(url,new Tradeprice());
  }
}
