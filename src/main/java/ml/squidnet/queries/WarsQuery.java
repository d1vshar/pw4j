package ml.squidnet.queries;

import ml.squidnet.domains.Wars;
import ml.squidnet.enums.QueryURL;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WarsQuery implements IEntityQuery {

  private int wid;
  private Integer[] aids;

  public WarsQuery(int wid, Integer[] aids) {
    this.wid = wid;
    this.aids = aids;
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.WARS_URL.getUrl().concat(Integer.toString(wid));
    if (aids != null)
      url = url.concat("&alliance_id=")
          .concat(Arrays.stream(aids).map(integer -> Integer.toString(integer)).collect(Collectors.joining(",")));
    return new ApiQuery<>(url,new Wars());
  }
}
