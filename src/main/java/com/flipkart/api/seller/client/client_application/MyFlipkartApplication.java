package com.flipkart.api.seller.client.client_application;

import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ListingsCommonV3Api;
import com.flipkart.api.seller.client.model.GetMarketplaceListingDetailsResponse;


public class MyFlipkartApplication {

  public static void main(String[] args) {

    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.PROD);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__Client_ID__",
        "__Client_Secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    //get listings
    ListingsCommonV3Api apiInstance = new ListingsCommonV3Api(apiClient);
    String skuIds = "__sku_id__"; // String | sku-ids
    try {
      GetMarketplaceListingDetailsResponse result = apiInstance.getListings(skuIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsCommonV3Api#getListings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
