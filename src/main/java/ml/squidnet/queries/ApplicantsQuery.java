package ml.squidnet.queries;

import ml.squidnet.domains.Applicants;
import ml.squidnet.enums.URL;

public class ApplicantsQuery implements IEntityQuery {

   private int aid;

   public ApplicantsQuery(int aid) {
     this.aid=aid;
   }

  @Override
  public ApiQuery build() {
     String url = URL.APPLICANTS_URL.getUrl().concat(Integer.toString(aid));
     return new ApiQuery<>(url, new Applicants());
  }
}
