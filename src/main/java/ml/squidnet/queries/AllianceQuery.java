package ml.squidnet.queries;

import ml.squidnet.domains.Alliance;
import ml.squidnet.enums.URL;

public class AllianceQuery implements IEntityQuery {

  private int aid;

  public AllianceQuery(int aid) {
    this.aid = aid;
  }

  @Override
  public ApiQuery build() {
    String url = URL.ALLIANCE_URL.getUrl().concat("id=").concat(Integer.toString(aid));
    return new ApiQuery<>(url, new Alliance());
  }
}
