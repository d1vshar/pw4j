package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Applicants;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class ApplicantsQuery implements IEntityQuery {

  private final int aid;

   public ApplicantsQuery(int aid) {
     this.aid=aid;
   }

  @Override
  public ApiQuery build() {
    String url = QueryURL.APPLICANTS_URL.getUrl().concat(Integer.toString(aid));
     return new ApiQuery<>(url, new Applicants());
  }
}
