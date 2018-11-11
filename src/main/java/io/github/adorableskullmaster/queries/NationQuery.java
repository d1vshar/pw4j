package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.domains.Nation;
import io.github.adorableskullmaster.enums.QueryURL;

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
