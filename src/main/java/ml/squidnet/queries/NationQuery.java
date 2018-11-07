package ml.squidnet.queries;

import ml.squidnet.domains.Nation;
import ml.squidnet.enums.URL;

public class NationQuery implements IEntityQuery {

  private int nid;

  public NationQuery(int nid) {
    this.nid = nid;
  }

  @Override
  public ApiQuery build() {
    String url = URL.NATION_URL.getUrl().concat("id=").concat(Integer.toString(nid));
    return new ApiQuery<>(url, new Nation());
  }
}
