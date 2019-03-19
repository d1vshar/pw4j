package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Wars;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WarsQuery extends Query {

  private final Integer warCount;
  private final Integer[] aids;

  public WarsQuery(int warCount, Integer[] aids, String apiKey) {
    super(apiKey);
    this.warCount = warCount;
    if (aids != null)
      this.aids = Arrays.copyOf(aids, aids.length);
    else
      this.aids = null;
  }

  @Override
  public ApiQuery build() {
    String url = UrlBuilder.build(QueryURL.WARS_URL, args);
    if (aids != null) {
      url = url.concat("&alliance_id=")
          .concat(Arrays.stream(aids).map(Object::toString).collect(Collectors.joining(",")));
    }
    if (warCount != null && !(warCount <= 1)) {
      url = url.concat("&limit=").concat(Integer.toString(warCount));
    }
    return new ApiQuery<>(url, new Wars());
  }
}
