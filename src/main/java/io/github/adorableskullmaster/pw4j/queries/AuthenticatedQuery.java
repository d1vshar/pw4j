package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.PoliticsAndWarAPIException;

abstract class AuthenticatedQuery {
  String apiKey = null;
  void checkApiKey() {
    if(apiKey == null)
      throw new PoliticsAndWarAPIException("This Query requires API KEY. Current apiKey =");
  }
}
