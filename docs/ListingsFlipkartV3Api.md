# ListingsFlipkartV3Api

All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*


| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createListings**](ListingsFlipkartV3Api.md#createListings) | **POST** /listings/v3 | Create listing request |
| [**updateListings**](ListingsFlipkartV3Api.md#updateListings) | **POST** /listings/v3/update | Update listing request |



## createListings

> Map&lt;String, ListingChangeResponse&gt; createListings(body)

Create listing request

### Example

```java
// Import classes:
package com.flipkart.api.seller.client.client_application;

import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ListingsCommonV3Api;
import com.flipkart.api.seller.client.api.ListingsFlipkartV3Api;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.CreateListingRequest;
import com.flipkart.api.seller.client.model.GetMarketplaceListingDetailsResponse;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
import com.flipkart.api.seller.client.model.UpdateInventoryRequest;
import com.flipkart.api.seller.client.model.UpdatePriceRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.PROD);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);


    ListingsFlipkartV3Api apiInstance = new ListingsFlipkartV3Api(apiClient);
    Map<String, CreateListingRequest> body = new HashMap(); // Map<String, CreateListingRequest> | request
    try {
      Map<String, ListingChangeResponse> result = apiInstance.createListings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsFlipkartV3Api#createListings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**Map&lt;String,CreateListingRequest&gt;**](CreateListingRequest.md)| request | |

### Return type

[**Map&lt;String, ListingChangeResponse&gt;**](ListingChangeResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created listings |  -  |
| **400** | Bad request |  -  |
| **401** | Client unauthorized |  -  |
| **500** | Internal Server Error |  -  |


## updateListings

> Map&lt;String, ListingChangeResponse&gt; updateListings(body)

Update listing request

### Example

```java
// Import classes:
package com.flipkart.api.seller.client.client_application;

import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ListingsCommonV3Api;
import com.flipkart.api.seller.client.api.ListingsFlipkartV3Api;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.CreateListingRequest;
import com.flipkart.api.seller.client.model.GetMarketplaceListingDetailsResponse;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
import com.flipkart.api.seller.client.model.UpdateInventoryRequest;
import com.flipkart.api.seller.client.model.UpdateListingRequest;
import com.flipkart.api.seller.client.model.UpdatePriceRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.PROD);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);


    ListingsFlipkartV3Api apiInstance = new ListingsFlipkartV3Api(apiClient);
    Map<String, UpdateListingRequest> body = new HashMap(); // Map<String, UpdateListingRequest> | request
    try {
      Map<String, ListingChangeResponse> result = apiInstance.updateListings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsFlipkartV3Api#updateListings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**Map&lt;String,UpdateListingRequest&gt;**](UpdateListingRequest.md)| request | |

### Return type

[**Map&lt;String, ListingChangeResponse&gt;**](ListingChangeResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated listings |  -  |
| **400** | Bad request |  -  |
| **401** | Client unauthorized |  -  |
| **500** | Internal Server Error |  -  |

