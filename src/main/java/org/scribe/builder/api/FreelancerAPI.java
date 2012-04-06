package org.scribe.builder.api;

import org.scribe.model.*;

public class FreelancerAPI extends DefaultApi10a
{
  private static final String AUTHORIZATION_URL = "http://www.sandbox.freelancer.com/users/api-token/auth.php?oauth_token=%s";

  @Override
  public String getAccessTokenEndpoint()
  {
    return "http://api.sandbox.freelancer.com/RequestAccessToken/requestAccessToken.xml?";
  }

  @Override
  public String getRequestTokenEndpoint()
  {
    return "http://api.sandbox.freelancer.com/RequestRequestToken/requestRequestToken.xml";
  }

  @Override
  public Verb getAccessTokenVerb()
  {
    return Verb.GET;
  }

  @Override
  public Verb getRequestTokenVerb()
  {
    return Verb.GET;
  }

  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZATION_URL, requestToken.getToken());
  }
}
