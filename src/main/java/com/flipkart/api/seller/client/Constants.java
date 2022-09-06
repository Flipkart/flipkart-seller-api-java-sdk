package com.flipkart.api.seller.client;

public class Constants {

  public final static String  PROD_GET_ACCESSTOKEN = "https://api.flipkart.net/oauth-service/oauth/token?grant_type=client_credentials&scope=Seller_Api";
  public final static String SANDBOX_GET_ACCESSTOKEN = "https://sandbox-api.flipkart.net/oauth-service/oauth/token?grant_type=client_credentials&scope=Seller_Api";
  public final static String PROD_GET_API_CLIENT = "https://api.flipkart.net/sellers";
  public final static String SANDBOX_API_CLIENT = "https://sandbox-api.flipkart.net/sellers";
  public final static String THIRD_PARTY_SANDBOX_GET_ACCESSTOKEN = "https://sandbox-api.flipkart.net/oauth-service/oauth/token?redirect_uri=https://sandbox-api.flipkart.net/oauth-register/register&grant_type=authorization_code&state=xcoivjuywkdkhvusuye3kch&code=";
  public final static String THIRD_PARTY_PROD_GET_ACCESSTOKEN = "https://api.flipkart.net/oauth-service/oauth/token?redirect_uri=https://api.flipkart.net/oauth-register/register&grant_type=authorization_code&state=xcoivjuywkdkhvusuye3kch&code=";

}
