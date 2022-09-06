package com.flipkart.api.seller.client;

public class UrlConfiguration {

  static String env;
  static String authCode;

  public UrlConfiguration(String env) {
    this.env = env;
  }

  public UrlConfiguration(String env,String authCode) { this.env = env; this.authCode = authCode;}



  public static String getAccessToken() {

    String accessTokenURL = "";

    if(Environment.PROD.toString().equalsIgnoreCase(env) && authCode != null)
      accessTokenURL = Constants.THIRD_PARTY_PROD_GET_ACCESSTOKEN + authCode;

    else if(Environment.SANDBOX.toString().equalsIgnoreCase(env) && authCode != null)
      accessTokenURL = Constants.THIRD_PARTY_SANDBOX_GET_ACCESSTOKEN + authCode;

    else if(Environment.PROD.toString().equalsIgnoreCase(env))
      accessTokenURL =  Constants.PROD_GET_ACCESSTOKEN;

    else if(Environment.SANDBOX.toString().equalsIgnoreCase(env))
      accessTokenURL = Constants.SANDBOX_GET_ACCESSTOKEN;


    return accessTokenURL;
  }

  public static String getAPIClient() {

    String apiClientURL = "";

    if(Environment.PROD.toString().equalsIgnoreCase(env))
      apiClientURL =  Constants.PROD_GET_API_CLIENT;

    else if(Environment.SANDBOX.toString().equalsIgnoreCase(env))
      apiClientURL = Constants.SANDBOX_API_CLIENT;

    return apiClientURL;
  }

}
