package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.domains.Tradeprice;
import io.github.adorableskullmaster.enums.QueryURL;
import io.github.adorableskullmaster.enums.ResourceType;

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
