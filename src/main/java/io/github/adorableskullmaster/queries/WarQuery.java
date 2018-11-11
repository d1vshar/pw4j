package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.domains.War;
import io.github.adorableskullmaster.enums.QueryURL;

public class WarQuery implements IEntityQuery {

  private int wid;

  public WarQuery(int wid) {
    this.wid = wid;
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.WAR_URL.getUrl().concat(Integer.toString(wid));
    return new ApiQuery<>(url,new War());
  }
}
