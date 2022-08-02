# ListingsCommonV3Api

All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListings**](ListingsCommonV3Api.md#getListings) | **GET** /listings/v3/{skuIds} | Get listings for SKUs |
| [**updateInventory**](ListingsCommonV3Api.md#updateInventory) | **POST** /listings/v3/update/inventory | Update listing inventory request |
| [**updatePrice**](ListingsCommonV3Api.md#updatePrice) | **POST** /listings/v3/update/price | Update listing price request |



## getListings

> GetMarketplaceListingDetailsResponse getListings(skuIds)

Get listings for SKUs

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
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.GetMarketplaceListingDetailsResponse;
import java.io.File;

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


    ListingsCommonV3Api apiInstance = new ListingsCommonV3Api(apiClient);
    String skuIds = "sku_id"; // String | sku-ids
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

```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **skuIds** | **String**| sku-ids | |

### Return type

[**GetMarketplaceListingDetailsResponse**](GetMarketplaceListingDetailsResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got the response |  -  |
| **400** | Bad request |  -  |
| **500** | Internal Server Error |  -  |


## updateInventory

> Map&lt;String, ListingChangeResponse&gt; updateInventory(body)

Update listing inventory request

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
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.GetMarketplaceListingDetailsResponse;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
import com.flipkart.api.seller.client.model.UpdateInventoryRequest;
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


    ListingsCommonV3Api apiInstance = new ListingsCommonV3Api(apiClient);
    Map<String, UpdateInventoryRequest> body = new HashMap(); // Map<String, UpdateInventoryRequest> | request
    try {
      Map<String, ListingChangeResponse> result = apiInstance.updateInventory(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsCommonV3Api#updateInventory");
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
| **body** | [**Map&lt;String,UpdateInventoryRequest&gt;**](UpdateInventoryRequest.md)| request | |

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
| **200** | Successfully updated inventories |  -  |
| **400** | Bad request |  -  |
| **401** | Client unauthorized |  -  |
| **500** | Internal Server Error |  -  |


## updatePrice

> Map&lt;String, ListingChangeResponse&gt; updatePrice(body)

Update listing price request

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
import com.flipkart.api.seller.client.api.OrdersV2Api;
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


    ListingsCommonV3Api apiInstance = new ListingsCommonV3Api(apiClient);
    Map<String, UpdatePriceRequest> body = new HashMap(); // Map<String, UpdatePriceRequest> | request
    try {
      Map<String, ListingChangeResponse> result = apiInstance.updatePrice(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsCommonV3Api#updatePrice");
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
| **body** | [**Map&lt;String,UpdatePriceRequest&gt;**](UpdatePriceRequest.md)| request | |

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
| **200** | Successfully updated prices |  -  |
| **400** | Bad request |  -  |
| **401** | Client unauthorized |  -  |
| **500** | Internal Server Error |  -  |

