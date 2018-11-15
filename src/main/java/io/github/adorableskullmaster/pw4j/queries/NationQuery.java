package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Nation;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class NationQuery implements IEntityQuery {

  private int nid;

  public NationQuery(int nid) {
    this.nid = nid;
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.NATION_URL.getUrl().concat("id=").concat(Integer.toString(nid));
    return new ApiQuery<>(url, new Nation());
  }
}
