package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.Applicants;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class ApplicantsQuery extends Query {

  public ApplicantsQuery(int aid, String apiKey) {
    super(Integer.toString(aid), apiKey);
   }

  @Override
  public ApiQuery build() {
    return new ApiQuery<>(UrlBuilder.build(QueryURL.APPLICANTS_URL, args), new Applicants());
  }
}
