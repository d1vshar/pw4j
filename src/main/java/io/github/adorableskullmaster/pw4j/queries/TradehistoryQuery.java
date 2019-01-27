package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.TradeHistory;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;
import io.github.adorableskullmaster.pw4j.enums.ResourceType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TradehistoryQuery extends AuthenticatedQuery implements IEntityQuery {

  private final Integer records;
  private final ResourceType[] resources;

  public TradehistoryQuery(String apiKey, Integer records, ResourceType[] resources) {
    super.apiKey = apiKey;
    this.records = records;
    this.resources = resources;
  }

  @Override
  public ApiQuery build() {
    checkApiKey();
    String url = QueryURL.TRADEHISTORY_URL.getUrl().concat("key=").concat(apiKey);
    if (records != null)
      url = url.concat("&records=").concat(Integer.toString(records));
    if (resources != null)
      url = url.concat("&resources=")
          .concat(Arrays.stream(resources).map(ResourceType::getName).collect(Collectors.joining(",")));
    return new ApiQuery<>(url, new TradeHistory());
  }
}
