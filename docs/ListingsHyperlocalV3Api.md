# ListingsHyperlocalV3Api

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createListings**](ListingsHyperlocalV3Api.md#createListings) | **POST** /listings/v3/hyperlocal | Create listing request |
| [**updateListings**](ListingsHyperlocalV3Api.md#updateListings) | **POST** /listings/v3/hyperlocal/update | Update listing request |



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
import com.flipkart.api.seller.client.api.ListingsHyperlocalV3Api;
import com.flipkart.api.seller.client.model.CreateHyperlocalListingRequest;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
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


    ListingsHyperlocalV3Api apiInstance = new ListingsHyperlocalV3Api(apiClient);
    Map<String, CreateHyperlocalListingRequest> body = new HashMap(); // Map<String, CreateHyperlocalListingRequest> | request
    try {
      Map<String, ListingChangeResponse> result = apiInstance.createListings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsHyperlocalV3Api#createListings");
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
| **body** | [**Map&lt;String,CreateHyperlocalListingRequest&gt;**](CreateHyperlocalListingRequest.md)| request | |

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
import com.flipkart.api.seller.client.api.ListingsHyperlocalV3Api;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
import com.flipkart.api.seller.client.model.UpdateHyperlocalListingRequest;
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


    ListingsHyperlocalV3Api apiInstance = new ListingsHyperlocalV3Api(apiClient);
    Map<String, UpdateHyperlocalListingRequest> body = new HashMap(); // Map<String, UpdateHyperlocalListingRequest> | request
    try {
      Map<String, ListingChangeResponse> result = apiInstance.updateListings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsHyperlocalV3Api#updateListings");
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
| **body** | [**Map&lt;String,UpdateHyperlocalListingRequest&gt;**](UpdateHyperlocalListingRequest.md)| request | |

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

