package ml.squidnet.queries;

import ml.squidnet.domains.Tradehistory;
import ml.squidnet.enums.QueryURL;
import ml.squidnet.enums.ResourceType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TradehistoryQuery extends AuthenticatedQuery implements IEntityQuery {

  private Integer records;
  private ResourceType[] resources;

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
    return new ApiQuery<>(url, new Tradehistory());
  }
}
