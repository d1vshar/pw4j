package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.War;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

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
