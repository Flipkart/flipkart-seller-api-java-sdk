# ReturnsV2Api

All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveSelfShipReturns**](ReturnsV2Api.md#approveSelfShipReturns) | **POST** /v2/returns/approve | Approve self-ship returns
[**cancelSelfShipReturn**](ReturnsV2Api.md#cancelSelfShipReturn) | **POST** /v2/returns/cancel | Cancel self-ship return
[**getReturns**](ReturnsV2Api.md#getReturns) | **GET** /v2/returns | Fetch returns
[**pickup**](ReturnsV2Api.md#pickup) | **POST** /v2/returns/pickup | Update self-ship returns pickup details
[**pickupAttempt**](ReturnsV2Api.md#pickupAttempt) | **POST** /v2/returns/pickupAttempt | Update self-ship returns pickup attempt
[**rejectSelfShipReturns**](ReturnsV2Api.md#rejectSelfShipReturns) | **POST** /v2/returns/reject | Reject self-ship returns
[**returnComplete**](ReturnsV2Api.md#returnComplete) | **POST** /v2/returns/complete | Update self-ship returns as complete

<a name="approveSelfShipReturns"></a>
# **approveSelfShipReturns**
> ReturnsActionResponseV2 approveSelfShipReturns(body)

Approve self-ship returns

This operation is used to approve the self-ship returns.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.ReturnsApproveRequest;


public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    ReturnsApproveRequest body = new ReturnsApproveRequest(); // ReturnsApproveRequest
    try {
      ReturnsActionResponseV2 result = apiInstance.approveSelfShipReturns(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#approveSelfShipReturns");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnsApproveRequest**](ReturnsApproveRequest.md)|  | [optional]

### Return type

[**ReturnsActionResponseV2**](ReturnsActionResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelSelfShipReturn"></a>
# **cancelSelfShipReturn**
> ReturnsActionResponseV2 cancelSelfShipReturn(body)

Cancel self-ship return

This operation is used to cancel the self-ship return

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnCancellationRequest;


public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    SelfShipReturnCancellationRequest body = new SelfShipReturnCancellationRequest(); // SelfShipReturnCancellationRequest |
    try {
      ReturnsActionResponseV2 result = apiInstance.cancelSelfShipReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#cancelSelfShipReturn");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SelfShipReturnCancellationRequest**](SelfShipReturnCancellationRequest.md)|  | [optional]

### Return type

[**ReturnsActionResponseV2**](ReturnsActionResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="getReturns"></a>
# **getReturns**
> ReturnsSearchResponseV2 getReturns(source, modifiedAfter, modifiedBefore, createdAfter, createdBefore, returnIds, trackingIds, locationId)

Fetch returns

This operation is used to fetch returns based on given return created / modified date ranges or specific &#x60;returnIds&#x60; or &#x60;trackingIds&#x60;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.ReturnsSearchResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnCancellationRequest;


public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    String source = "source_example"; // String |
    String modifiedAfter = "modifiedAfter_example"; // String |
    String modifiedBefore = "modifiedBefore_example"; // String |
    String createdAfter = "createdAfter_example"; // String |
    String createdBefore = "createdBefore_example"; // String |
    String returnIds = "returnIds_example"; // String | Comma separated return ids. Max. 25 allowed.
    String trackingIds = "trackingIds_example"; // String | Comma separated tracking ids. Max. 25 allowed.
    String locationId = "locationId_example"; // String |
    try {
      ReturnsSearchResponseV2 result = apiInstance.getReturns(source, modifiedAfter, modifiedBefore, createdAfter, createdBefore, returnIds, trackingIds, locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#getReturns");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  | [optional]
 **modifiedAfter** | **String**|  | [optional]
 **modifiedBefore** | **String**|  | [optional]
 **createdAfter** | **String**|  | [optional]
 **createdBefore** | **String**|  | [optional]
 **returnIds** | **String**| Comma separated return ids. Max. 25 allowed. | [optional]
 **trackingIds** | **String**| Comma separated tracking ids. Max. 25 allowed. | [optional]
 **locationId** | **String**|  | [optional]

### Return type

[**ReturnsSearchResponseV2**](ReturnsSearchResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pickup"></a>
# **pickup**
> ReturnsActionResponseV2 pickup(body)

Update self-ship returns pickup details

This operation is used to update the pickup details of customer self-ship returns.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnPickupRequests;


public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    SelfShipReturnPickupRequests body = new SelfShipReturnPickupRequests(); // SelfShipReturnPickupRequests |
    try {
      ReturnsActionResponseV2 result = apiInstance.pickup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#pickup");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SelfShipReturnPickupRequests**](SelfShipReturnPickupRequests.md)|  | [optional]

### Return type

[**ReturnsActionResponseV2**](ReturnsActionResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pickupAttempt"></a>
# **pickupAttempt**
> ReturnsActionResponseV2 pickupAttempt(body)

Update self-ship returns pickup attempt

This operation is used to update the failed pickup attempt of self-ship returns.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnPickupAttemptRequests;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    SelfShipReturnPickupAttemptRequests body = new SelfShipReturnPickupAttemptRequests(); // SelfShipReturnPickupAttemptRequests |
    try {
      ReturnsActionResponseV2 result = apiInstance.pickupAttempt(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#pickupAttempt");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SelfShipReturnPickupAttemptRequests**](SelfShipReturnPickupAttemptRequests.md)|  | [optional]

### Return type

[**ReturnsActionResponseV2**](ReturnsActionResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rejectSelfShipReturns"></a>
# **rejectSelfShipReturns**
> ReturnsActionResponseV2 rejectSelfShipReturns(body)

Reject self-ship returns

This operation is used to reject customer self-ship returns.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.ReturnsRejectRequest;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    ReturnsRejectRequest body = new ReturnsRejectRequest(); // ReturnsRejectRequest |
    try {
      ReturnsActionResponseV2 result = apiInstance.rejectSelfShipReturns(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#rejectSelfShipReturns");
      e.printStackTrace();
    }


  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReturnsRejectRequest**](ReturnsRejectRequest.md)|  | [optional]

### Return type

[**ReturnsActionResponseV2**](ReturnsActionResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="returnComplete"></a>
# **returnComplete**
> ReturnsActionResponseV2 returnComplete(body)

Update self-ship returns as complete

This operation is used to mark the self-ship returns as complete.

### Example
```java
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ReturnsV2Api;
import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnCompleteRequest;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator = new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);

    //Replace the below values with your client id and client secret here
    accessTokenGenerator.clientCredentials("__client_id__",
        "__client_secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    ReturnsV2Api apiInstance = new ReturnsV2Api(apiClient);
    SelfShipReturnCompleteRequest body = new SelfShipReturnCompleteRequest(); // SelfShipReturnCompleteRequest |
    try {
      ReturnsActionResponseV2 result = apiInstance.returnComplete(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsV2Api#returnComplete");
      e.printStackTrace();
    }


  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SelfShipReturnCompleteRequest**](SelfShipReturnCompleteRequest.md)|  | [optional]

### Return type

[**ReturnsActionResponseV2**](ReturnsActionResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

