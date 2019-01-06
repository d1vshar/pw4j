package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.TradePrice;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

public class TradepriceQuery implements IEntityQuery {

  private String resource;

  public TradepriceQuery(ResourceType resource) {
    this.resource = resource.getName();
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.TRADEPRICE_URL.getUrl().concat("resource=").concat(resource);
    return new ApiQuery<>(url, new TradePrice());
  }
}
