# OrdersV2Api

All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrders**](OrdersV2Api.md#cancelOrders) | **POST** /v2/orders/cancel | Cancel order items
[**getBulkActionProgressByRequestId**](OrdersV2Api.md#getBulkActionProgressByRequestId) | **GET** /v2/orders/labelRequest/{requestId} | Check label generation status
[**getInvoicesInfo**](OrdersV2Api.md#getInvoicesInfo) | **GET** /v2/orders/invoices | Get invoice details for order items
[**getLabels**](OrdersV2Api.md#getLabels) | **GET** /v2/orders/labels | Download labels and invoices in PDF format for order items
[**getManifestPdfForRequest**](OrdersV2Api.md#getManifestPdfForRequest) | **GET** /v2/orders/manifest | Download manifest PDF
[**getOrderItemById**](OrdersV2Api.md#getOrderItemById) | **GET** /v2/orders/{order_item_id} | Get details of order item
[**getOrderItemsByIds**](OrdersV2Api.md#getOrderItemsByIds) | **GET** /v2/orders | Get details of order items
[**getShipments**](OrdersV2Api.md#getShipments) | **GET** /v2/orders/shipments | Get shipping related details of order items
[**searchOrderItemRequest**](OrdersV2Api.md#searchOrderItemRequest) | **POST** /v2/orders/search | Search order items using filters
[**submitBulkConfirmRequest**](OrdersV2Api.md#submitBulkConfirmRequest) | **POST** /v2/orders/labels | Trigger label generation for order items
[**submitBulkRtdRequest**](OrdersV2Api.md#submitBulkRtdRequest) | **POST** /v2/orders/dispatch | Mark order items ready for dispatch
[**submitSelfShipDeliverAttemptRequest**](OrdersV2Api.md#submitSelfShipDeliverAttemptRequest) | **POST** /v2/shipments/deliveryAttempt | Update delivery attempt for self-ship order items
[**submitSelfShipDeliverRequest**](OrdersV2Api.md#submitSelfShipDeliverRequest) | **POST** /v2/shipments/delivery | Update delivery date for self-ship order items
[**submitSelfShipmentDispatchRequest**](OrdersV2Api.md#submitSelfShipmentDispatchRequest) | **POST** /v2/shipments/dispatch | Mark self-ship order items ready for dispatch
[**submitServiceAttemptRequest**](OrdersV2Api.md#submitServiceAttemptRequest) | **POST** /v2/services/attempt | Update service attempts
[**submitServiceCompleteRequest**](OrdersV2Api.md#submitServiceCompleteRequest) | **POST** /v2/services/complete | Update services as complete

<a name="cancelOrders"></a>
# **cancelOrders**
> OrderItemCancelResponse cancelOrders(body)

Cancel order items

This operation allows client to cancel order items before marking them &#x60;PACKED&#x60;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.CancelRequestV2;
import com.flipkart.api.seller.client.model.OrderItemCancelResponse;

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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    CancelRequestV2 body = new CancelRequestV2(); // CancelRequestV2 |
    try {
      OrderItemCancelResponse result = apiInstance.cancelOrders(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#cancelOrders");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CancelRequestV2**](CancelRequestV2.md)|  | [optional]

### Return type

[**OrderItemCancelResponse**](OrderItemCancelResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBulkActionProgressByRequestId"></a>
# **getBulkActionProgressByRequestId**
> BulkActionProgressResponse getBulkActionProgressByRequestId(requestId)

Check label generation status

This operation returns the status of the label generation process which was triggered using &#x60;POST /v2/orders/labels&#x60; API. Query param &#x60;requestId&#x60; is the same value which is returned in the response of &#x60;POST /v2/orders/labels&#x60; API

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.BulkActionProgressResponse;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    String requestId = "requestId_example"; // String |
    try {
      BulkActionProgressResponse result = apiInstance.getBulkActionProgressByRequestId(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getBulkActionProgressByRequestId");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**|  |

### Return type

[**BulkActionProgressResponse**](BulkActionProgressResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoicesInfo"></a>
# **getInvoicesInfo**
> InvoicesSearchResponseV2 getInvoicesInfo(orderItemIds)

Get invoice details for order items

This operation returns the GST tax details, invoice number and date for the order items

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.InvoicesSearchResponseV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    String orderItemIds = "orderItemIds_example"; // String |
    try {
      InvoicesSearchResponseV2 result = apiInstance.getInvoicesInfo(orderItemIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getInvoicesInfo");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItemIds** | **String**|  | [optional]

### Return type

[**InvoicesSearchResponseV2**](InvoicesSearchResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLabels"></a>
# **getLabels**
> getLabels(orderItemIds)

Download labels and invoices in PDF format for order items

This operation returns the labels and invoices for the order items in PDF format. Label and invoice must have been generated before invoking this method.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import java.io.File;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    String orderItemIds = "orderItemIds_example"; // String | Comma separated order items ids
    try {
      File result = apiInstance.getLabels(orderItemIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getLabels");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItemIds** | **String**| Comma separated order items ids | [optional]

### Return type

File

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getManifestPdfForRequest"></a>
# **getManifestPdfForRequest**
> getManifestPdfForRequest()

Download manifest PDF

This operation returns the manifest file in PDF format

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import java.io.File;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    try {
      File result = apiInstance.getManifestPdfForRequest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getManifestPdfForRequest");
      e.printStackTrace();
    }

  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

File

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrderItemById"></a>
# **getOrderItemById**
> OrderItem getOrderItemById(orderItemId)

Get details of order item

This operation returns details for the order item id

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.OrderItem;
import java.io.File;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    String orderItemId = "orderItemId_example"; // String | A single order item id
    try {
      OrderItem result = apiInstance.getOrderItemById(orderItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getOrderItemById");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItemId** | **String**| A single order item id |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderItemsByIds"></a>
# **getOrderItemsByIds**
> FetchOrderItemsResponse getOrderItemsByIds(orderItemIds)

Get details of order items

This operation returns details for the order item ids passed in the query param. This is a bulk version of &#x60;GET /v2/orders/{order_item_id}&#x60; API

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.FetchOrderItemsResponse;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    String orderItemIds = "orderItemIds_example"; // String | Comma separated order item ids
    try {
      FetchOrderItemsResponse result = apiInstance.getOrderItemsByIds(orderItemIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getOrderItemsByIds");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItemIds** | **String**| Comma separated order item ids | [optional]

### Return type

[**FetchOrderItemsResponse**](FetchOrderItemsResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipments"></a>
# **getShipments**
> ShipmentSearchResponse getShipments(orderItemIds)

Get shipping related details of order items

This operation returns shipping and tracking related details of the order items e.g delivery / billing address, tracking id, buyer address, etc. Buyer contact number and email address would be provided only for self-ship orders.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.ShipmentSearchResponse;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    String orderItemIds = "orderItemIds_example"; // String |
    try {
      ShipmentSearchResponse result = apiInstance.getShipments(orderItemIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#getShipments");
      e.printStackTrace();
    }


  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItemIds** | **String**|  | [optional]

### Return type

[**ShipmentSearchResponse**](ShipmentSearchResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchOrderItemRequest"></a>
# **searchOrderItemRequest**
> SearchOrderItemResponseV2 searchOrderItemRequest(body)

Search order items using filters

This operation returns order items based on applied filters

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.SearchOrderItemRequest;
import com.flipkart.api.seller.client.model.SearchOrderItemResponseV2;

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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    SearchOrderItemRequest body = new SearchOrderItemRequest(); // SearchOrderItemRequest |
    try {
      SearchOrderItemResponseV2 result = apiInstance.searchOrderItemRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#searchOrderItemRequest");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchOrderItemRequest**](SearchOrderItemRequest.md)|  | [optional]

### Return type

[**SearchOrderItemResponseV2**](SearchOrderItemResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitBulkConfirmRequest"></a>
# **submitBulkConfirmRequest**
> BulkConfirmResponseV2 submitBulkConfirmRequest(body)

Trigger label generation for order items

This operation triggers the generation of invoice and shipping labels for the order items and marks them as &#x60;PACKED&#x60;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.BulkConfirmResponseV2;
import com.flipkart.api.seller.client.model.GenerateLabelRequestV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    GenerateLabelRequestV2 body = new GenerateLabelRequestV2(); // GenerateLabelRequestV2 |
    try {
      BulkConfirmResponseV2 result = apiInstance.submitBulkConfirmRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitBulkConfirmRequest");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenerateLabelRequestV2**](GenerateLabelRequestV2.md)|  | [optional]

### Return type

[**BulkConfirmResponseV2**](BulkConfirmResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitBulkRtdRequest"></a>
# **submitBulkRtdRequest**
> BulkRtdResponse submitBulkRtdRequest(body)

Mark order items ready for dispatch

This operation is used to mark the order items as &#x60;READY_TO_DISPATCH&#x60;. It must be invoked after downloading the invoice and label.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.BulkConfirmResponseV2;
import com.flipkart.api.seller.client.model.BulkRtdActionRequest;
import com.flipkart.api.seller.client.model.BulkRtdResponse;
import com.flipkart.api.seller.client.model.GenerateLabelRequestV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    BulkRtdActionRequest body = new BulkRtdActionRequest(); // BulkRtdActionRequest |
    try {
      BulkRtdResponse result = apiInstance.submitBulkRtdRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitBulkRtdRequest");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkRtdActionRequest**](BulkRtdActionRequest.md)|  | [optional]

### Return type

[**BulkRtdResponse**](BulkRtdResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSelfShipDeliverAttemptRequest"></a>
# **submitSelfShipDeliverAttemptRequest**
> ShipmentsDeliverResponseV2 submitSelfShipDeliverAttemptRequest(body)

Update delivery attempt for self-ship order items

This operation is used to update the delivery attempt with failure reason and new delivery date for the self-ship order items.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.ShipmentsDeliverAttemptRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverResponseV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    ShipmentsDeliverAttemptRequestV2 body = new ShipmentsDeliverAttemptRequestV2(); // ShipmentsDeliverAttemptRequestV2 |
    try {
      ShipmentsDeliverResponseV2 result = apiInstance.submitSelfShipDeliverAttemptRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitSelfShipDeliverAttemptRequest");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShipmentsDeliverAttemptRequestV2**](ShipmentsDeliverAttemptRequestV2.md)|  | [optional]

### Return type

[**ShipmentsDeliverResponseV2**](ShipmentsDeliverResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSelfShipDeliverRequest"></a>
# **submitSelfShipDeliverRequest**
> ShipmentsDeliverResponseV2 submitSelfShipDeliverRequest(body)

Update delivery date for self-ship order items

This operation is used to update the delivery date for self-ship order items.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.ShipmentsDeliverRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverResponseV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    ShipmentsDeliverRequestV2 body = new ShipmentsDeliverRequestV2(); // ShipmentsDeliverRequestV2 |
    try {
      ShipmentsDeliverResponseV2 result = apiInstance.submitSelfShipDeliverRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitSelfShipDeliverRequest");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShipmentsDeliverRequestV2**](ShipmentsDeliverRequestV2.md)|  | [optional]

### Return type

[**ShipmentsDeliverResponseV2**](ShipmentsDeliverResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSelfShipmentDispatchRequest"></a>
# **submitSelfShipmentDispatchRequest**
> ShipmentsDispatchResponseV2 submitSelfShipmentDispatchRequest(body)

Mark self-ship order items ready for dispatch

This operation is used to mark self-ship order items as &#x60;READY_TO_DISPATCH&#x60; from the seller warehouse.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.ShipmentsDispatchRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDispatchResponseV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    ShipmentsDispatchRequestV2 body = new ShipmentsDispatchRequestV2(); // ShipmentsDispatchRequestV2 |
    try {
      ShipmentsDispatchResponseV2 result = apiInstance.submitSelfShipmentDispatchRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitSelfShipmentDispatchRequest");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShipmentsDispatchRequestV2**](ShipmentsDispatchRequestV2.md)|  | [optional]

### Return type

[**ShipmentsDispatchResponseV2**](ShipmentsDispatchResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitServiceAttemptRequest"></a>
# **submitServiceAttemptRequest**
> ServiceResponseStatusV2 submitServiceAttemptRequest(body)

Update service attempts

This operation is used to update the service attempt with failure reason and new delivery date.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.ServiceAttemptRequest;
import com.flipkart.api.seller.client.model.ServiceResponseStatusV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    ServiceAttemptRequest body = new ServiceAttemptRequest(); // ServiceAttemptRequest |
    try {
      ServiceResponseStatusV2 result = apiInstance.submitServiceAttemptRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitServiceAttemptRequest");
      e.printStackTrace();
    }


  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceAttemptRequest**](ServiceAttemptRequest.md)|  | [optional]

### Return type

[**ServiceResponseStatusV2**](ServiceResponseStatusV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitServiceCompleteRequest"></a>
# **submitServiceCompleteRequest**
> ServiceResponseStatusV2 submitServiceCompleteRequest(body)

Update services as complete

This operation is used to mark the services as complete.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.OrdersV2Api;
import com.flipkart.api.seller.client.model.ServiceCompleteRequest;
import com.flipkart.api.seller.client.model.ServiceResponseStatusV2;


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

    OrdersV2Api apiInstance = new OrdersV2Api(apiClient);
    ServiceCompleteRequest body = new ServiceCompleteRequest(); // ServiceCompleteRequest | 
    try {
      ServiceResponseStatusV2 result = apiInstance.submitServiceCompleteRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV2Api#submitServiceCompleteRequest");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceCompleteRequest**](ServiceCompleteRequest.md)|  | [optional]

### Return type

[**ServiceResponseStatusV2**](ServiceResponseStatusV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

