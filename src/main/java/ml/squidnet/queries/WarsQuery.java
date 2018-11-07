package ml.squidnet.queries;

import ml.squidnet.domains.Wars;
import ml.squidnet.enums.URL;

public class WarsQuery implements IEntityQuery {

  private int amount;

  public WarsQuery() {
    amount = -1;
  }

  public WarsQuery(int amount) {
    this.amount = amount;
  }

  @Override
  public ApiQuery build() {
    String url = URL.WARS_URL.getUrl();
    if(amount!= -1)
      url = url.concat(Integer.toString(amount));
    return new ApiQuery<>(url,new Wars());
  }
}
