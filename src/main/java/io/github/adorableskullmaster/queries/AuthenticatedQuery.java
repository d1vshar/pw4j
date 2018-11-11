package io.github.adorableskullmaster.queries;

import io.github.adorableskullmaster.PoliticsAndWarAPIException;

abstract class AuthenticatedQuery {
  String apiKey = null;
  void checkApiKey() {
    if(apiKey == null)
      throw new PoliticsAndWarAPIException("This Query requires API KEY. Current apiKey =");
  }
}
