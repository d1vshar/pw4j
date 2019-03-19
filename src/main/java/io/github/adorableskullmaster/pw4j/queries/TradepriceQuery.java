package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.TradePrice;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

public class TradepriceQuery extends Query {

  public TradepriceQuery(ResourceType resource, String apiKey) {
    super(resource.getName(), apiKey);
  }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.TRADEPRICE_URL, args), new TradePrice());
  }
}
