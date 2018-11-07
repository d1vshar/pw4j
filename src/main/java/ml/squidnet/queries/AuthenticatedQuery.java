package ml.squidnet.queries;

import ml.squidnet.PoliticsAndWarAPIException;

abstract class AuthenticatedQuery {
  String apiKey = null;
  void checkApiKey() {
    if(apiKey == null)
      throw new PoliticsAndWarAPIException("This Query requires API KEY");
  }
}
