package com.flipkart.api.seller.client;

public class Constants {

  public final static String HTTPS_PROTOCOL = "https://";
  public final static String PROD_BASE_URL = "api.flipkart.net";
  public final static String SANDBOX_BASE_URL = "sandbox-api.flipkart.net";
  public final static String OAUTH_SERVICE = "/oauth-service";

  public final static String PROD_GET_ACCESS_TOKEN = HTTPS_PROTOCOL+PROD_BASE_URL+OAUTH_SERVICE+"/oauth/token?grant_type=client_credentials&scope=Seller_Api";
  public final static String THIRD_PARTY_PROD_GET_ACCESS_TOKEN_REDIRECT_URL= HTTPS_PROTOCOL+PROD_BASE_URL+OAUTH_SERVICE+"/oauth/token?redirect_uri=";
  public final static String THIRD_PARTY_PROD_GET_ACCESS_TOKEN_STATE = "&grant_type=authorization_code&state=";
  public final static String THIRD_PARTY_PROD_GET_ACCESS_TOKEN_CODE = "&code=";


  public final static String SANDBOX_GET_ACCESS_TOKEN = HTTPS_PROTOCOL + SANDBOX_BASE_URL + OAUTH_SERVICE + "/oauth/token?grant_type=client_credentials&scope=Seller_Api";
  public final static String THIRD_PARTY_SANDBOX_GET_ACCESS_TOKEN_REDIRECT_URL= HTTPS_PROTOCOL + SANDBOX_BASE_URL + OAUTH_SERVICE + "/oauth/token?redirect_uri=";
  public final static String THIRD_PARTY_SANDBOX_GET_ACCESS_TOKEN_STATE = "&grant_type=authorization_code&state=";
  public final static String THIRD_PARTY_SANDBOX_GET_ACCESS_TOKEN_CODE = "&code=";


  public final static String PROD_GET_API_CLIENT = HTTPS_PROTOCOL + PROD_BASE_URL + "/sellers";
  public final static String SANDBOX_API_CLIENT = HTTPS_PROTOCOL + SANDBOX_BASE_URL + "/sellers";



}
