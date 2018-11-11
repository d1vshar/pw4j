package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.domains.City;
import io.github.adorableskullmaster.enums.QueryURL;

public class CityQuery implements IEntityQuery {
  private int cid;

  public CityQuery(int cid) {
    this.cid = cid;
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.CITY_URL.getUrl().concat("id=").concat(Integer.toString(cid));
    return new ApiQuery<>(url, new City());
  }
}
