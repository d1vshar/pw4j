package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.TradeHistory;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TradehistoryQuery extends Query {

  private final Integer records;
  private final ResourceType[] resources;

  public TradehistoryQuery(Integer records, ResourceType[] resources, String apiKey) {
    super(apiKey);
    this.records = records;
    if (resources != null)
      this.resources = Arrays.copyOf(resources, resources.length);
    else
      this.resources = null;
  }

  @Override
  public ApiQuery build() {
    String url = UrlBuilder.build(QueryURL.TRADEHISTORY_URL, args);
    if (records != null)
      url = url.concat("&records=").concat(Integer.toString(records));
    if (resources != null)
      url = url.concat("&resources=")
          .concat(Arrays.stream(resources).map(ResourceType::getName).collect(Collectors.joining(",")));
    return new ApiQuery<>(url, new TradeHistory());
  }
}
