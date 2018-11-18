package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Wars;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

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
    String url = QueryURL.WARS_URL.getUrl();
    if (wid > 0 && aids == null) {
      url = url.concat(Integer.toString(wid));
    } else if (wid < 0 && aids != null) {
      url = url.concat("?alliance_ids=")
          .concat(Arrays.stream(aids).map(integer -> Integer.toString(integer)).collect(Collectors.joining(",")));
    } else if (wid > 0 && aids != null) {
      url = url.concat(Integer.toString(wid))
          .concat("&alliance_id=")
          .concat(Arrays.stream(aids).map(integer -> Integer.toString(integer)).collect(Collectors.joining(",")));
    }
    return new ApiQuery<>(url, new Wars());
  }
}
