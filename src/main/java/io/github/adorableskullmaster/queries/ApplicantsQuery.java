package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.domains.Applicants;
import io.github.adorableskullmaster.enums.QueryURL;

public class ApplicantsQuery implements IEntityQuery {

   private int aid;

   public ApplicantsQuery(int aid) {
     this.aid=aid;
   }

  @Override
  public ApiQuery build() {
    String url = QueryURL.APPLICANTS_URL.getUrl().concat(Integer.toString(aid));
     return new ApiQuery<>(url, new Applicants());
  }
}
