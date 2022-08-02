package com.flipkart.api.seller.client;

public class UrlConfiguration {

  static String env;
  static String authCode;

  public UrlConfiguration(String env) {
    this.env = env;
  }

  public UrlConfiguration(String env,String authCode) { this.env = env; this.authCode = authCode;}


  private final static String  PROD_GET_ACCESSTOKEN = "https://api.flipkart.net/oauth-service/oauth/token?grant_type=client_credentials&scope=Seller_Api";
  private final static String SANDBOX_GET_ACCESSTOKEN = "https://sandbox-api.flipkart.net/oauth-service/oauth/token?grant_type=client_credentials&scope=Seller_Api";
  private final static String PROD_GET_API_CLIENT = "https://api.flipkart.net/sellers";
  private final static String SANDBOX_API_CLIENT = "https://sandbox-api.flipkart.net/sellers";
  private final static String THIRD_PARTY_SANDBOX_GET_ACCESSTOKEN = "https://sandbox-api.flipkart.net/oauth-service/oauth/token?redirect_uri=https://sandbox-api.flipkart.net/oauth-register/register&grant_type=authorization_code&state=xcoivjuywkdkhvusuye3kch&code=";
  private final static String THIRD_PARTY_PROD_GET_ACCESSTOKEN = "https://api.flipkart.net/oauth-service/oauth/token?redirect_uri=https://api.flipkart.net/oauth-register/register&grant_type=authorization_code&state=xcoivjuywkdkhvusuye3kch&code=";

  public static String getAccessToken() {

    String accessTokenURL = "";
    if(Environment.PROD.toString() == env && authCode != null)
      accessTokenURL = THIRD_PARTY_PROD_GET_ACCESSTOKEN + authCode;
    else if(Environment.SANDBOX.toString() == env && authCode != null)
      accessTokenURL = THIRD_PARTY_SANDBOX_GET_ACCESSTOKEN + authCode;
    else if(Environment.PROD.toString() == env)
      accessTokenURL =  PROD_GET_ACCESSTOKEN;
    else if(Environment.SANDBOX.toString() == env)
      accessTokenURL = SANDBOX_GET_ACCESSTOKEN;


    return accessTokenURL;
  }

  public static String getAPIClient() {

    String apiClientURL = "";
    if(Environment.PROD.toString() == env)
      apiClientURL =  PROD_GET_API_CLIENT;
    else if(Environment.SANDBOX.toString() == env)
      apiClientURL = SANDBOX_API_CLIENT;
    return apiClientURL;
  }

}
