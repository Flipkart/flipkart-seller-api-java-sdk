# ShipmentV3Api

All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelByEnforcedGroupIds**](ShipmentV3Api.md#cancelByEnforcedGroupIds) | **POST** /v3/shipments/cancel | Cancel order items in a shipment
[**getInvoicesPdfFromEsi**](ShipmentV3Api.md#getInvoicesPdfFromEsi) | **GET** /v3/shipments/{shipmentIds}/invoices | Download invoice PDF
[**getLabels**](ShipmentV3Api.md#getLabels) | **GET** /v3/shipments/{shipmentIds}/labels | Download labels and invoices in PDF format for shipments
[**getLabelsOnly**](ShipmentV3Api.md#getLabelsOnly) | **POST** /v3/shipments/{shipmentIds}/labelOnly | Download labels Byte-Stream for shipments
[**getLabelsOnlyPDF**](ShipmentV3Api.md#getLabelsOnlyPDF) | **POST** /v3/shipments/{shipmentIds}/labelOnly/pdf | Download labels in PDF format for shipments
[**getManifest**](ShipmentV3Api.md#getManifest) | **POST** /v3/shipments/manifest | Download manifest PDF
[**getShipmentDetails**](ShipmentV3Api.md#getShipmentDetails) | **GET** /v3/shipments/{shipmentIds} | Get shipping related details for shipments
[**getShipmentDetailsByInternalId**](ShipmentV3Api.md#getShipmentDetailsByInternalId) | **GET** /v3/shipments | Get order details for given shipment or order ids
[**getVendorGroupDetails**](ShipmentV3Api.md#getVendorGroupDetails) | **GET** /v3/shipments/handover/counts | Get shipment handover counts per vendor
[**markRTD**](ShipmentV3Api.md#markRTD) | **POST** /v3/shipments/dispatch | Mark shipments ready for dispatch
[**pack**](ShipmentV3Api.md#pack) | **POST** /v3/shipments/labels | Trigger label generation for shipments
[**searchPreDispatchShipmentGet**](ShipmentV3Api.md#searchPreDispatchShipmentGet) | **GET** /v3/shipments/filter | Search shipments using filters
[**searchPreDispatchShipmentPost**](ShipmentV3Api.md#searchPreDispatchShipmentPost) | **POST** /v3/shipments/filter | Search shipments using filters
[**submitSelfShipDeliverAttemptRequest**](ShipmentV3Api.md#submitSelfShipDeliverAttemptRequest) | **POST** /v3/shipments/selfShip/deliveryAttempt | Update delivery attempt for self-ship shipments
[**submitSelfShipDeliveryRequest**](ShipmentV3Api.md#submitSelfShipDeliveryRequest) | **POST** /v3/shipments/selfShip/delivery | Update delivery date for self-ship shipments
[**submitSelfShiptDispatchRequest**](ShipmentV3Api.md#submitSelfShiptDispatchRequest) | **POST** /v3/shipments/selfShip/dispatch | Mark self-ship shipments dispatched
[**updateTrackingInfo**](ShipmentV3Api.md#updateTrackingInfo) | **POST** /v3/shipments/{shipmentId}/update | Update Tracking Id of the Shipment

<a name="cancelByEnforcedGroupIds"></a>
# **cancelByEnforcedGroupIds**
> ShipmentStatusResponse cancelByEnforcedGroupIds(body)

Cancel order items in a shipment

This operation allows client to cancel order items inside shipment before marking them &#x60;PACKED&#x60;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.CancelShipmentRequest;
import com.flipkart.api.seller.client.model.ShipmentStatusResponse;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    CancelShipmentRequest body = new CancelShipmentRequest(); // CancelShipmentRequest |
    try {
      ShipmentStatusResponse result = apiInstance.cancelByEnforcedGroupIds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#cancelByEnforcedGroupIds");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CancelShipmentRequest**](CancelShipmentRequest.md)|  | [optional]

### Return type

[**ShipmentStatusResponse**](ShipmentStatusResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoicesPdfFromEsi"></a>
# **getInvoicesPdfFromEsi**
> getInvoicesPdfFromEsi(shipmentIds)

Download invoice PDF

This operation provides invoices for shipments in the PDF format. Label and invoice must have been generated before invoking this method.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentIds = "shipmentIds_example"; // String | Comma separated shipment ids
    try {
      File result = apiInstance.getInvoicesPdfFromEsi(shipmentIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getInvoicesPdfFromEsi");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentIds** | **String**| Comma separated shipment ids |

### Return type

File

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLabels"></a>
# **getLabels**
> getLabels(shipmentIds)

Download labels and invoices in PDF format for shipments

This operation returns the labels and invoices for the shipments in PDF format

### Example
```java
// Import classes:

package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentIds = "shipmentIds_example"; // String | Comma separated shipment ids
    try {
      File result = apiInstance.getLabels(shipmentIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getLabels");
      e.printStackTrace();
    }

  }
}

```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentIds** | **String**| Comma separated shipment ids |

### Return type

null (empty response body)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLabelsOnly"></a>
# **getLabelsOnly**
> InputStream getLabelsOnly(shipmentIds, reprint)

Download labels Byte-Stream for shipments

This operation returns the labels for the shipments in Byte-Stream format

### Example
```java
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.InputStream;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentIds = "shipmentIds_example"; // String | Comma separated shipmentIds
    Boolean reprint = false; // Boolean | True to rePrint Label
    try {
      InputStream result = apiInstance.getLabelsOnly(shipmentIds, reprint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getLabelsOnly");
      e.printStackTrace();
    }

  }
}


```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentIds** | **String**| Comma separated shipmentIds |
 **reprint** | **Boolean**| True to rePrint Label | [optional] [default to false]

### Return type

[**InputStream**](InputStream.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream

<a name="getLabelsOnlyPDF"></a>
# **getLabelsOnlyPDF**
> getLabelsOnlyPDF(shipmentIds, reprint)

Download labels in PDF format for shipments

This operation returns the labels for the shipments in PDF format

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentIds = "shipmentIds_example"; // String | Comma separated shipment ids
    Boolean reprint = false; // Boolean | True if you are reprinting Label
    try {
      File result = apiInstance.getLabelsOnlyPDF(shipmentIds, reprint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getLabelsOnlyPDF");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentIds** | **String**| Comma separated shipment ids |
 **reprint** | **Boolean**| True if you are reprinting Label | [optional] [default to false]

### Return type

File

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf


<a name="getManifest"></a>
# **getManifest**
> getManifest(body)

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
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.GetManifestRequest;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    GetManifestRequest body = new GetManifestRequest(); // GetManifestRequest |
    try {
      File result = apiInstance.getManifest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getManifest");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetManifestRequest**](GetManifestRequest.md)|  | [optional]

### Return type

File

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getShipmentDetails"></a>
# **getShipmentDetails**
> ShipmentDetailsResponseV3 getShipmentDetails(shipmentIds)

Get shipping related details for shipments

This operation returns shipping and tracking related details of the shipments e.g delivery / billing address, tracking id, buyer address, etc. Buyer contact number and email address would be provided only for self-ship shipments.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.ShipmentDetailsResponseV3;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentIds = "shipmentIds_example"; // String | Comma separated shipment ids
    try {
      ShipmentDetailsResponseV3 result = apiInstance.getShipmentDetails(shipmentIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getShipmentDetails");
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentIds** | **String**| Comma separated shipment ids |

### Return type

[**ShipmentDetailsResponseV3**](ShipmentDetailsResponseV3.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipmentDetailsByInternalId"></a>
# **getShipmentDetailsByInternalId**
> ShipmentResponse getShipmentDetailsByInternalId(shipmentIds, orderItemIds, orderIds)

Get order details for given shipment or order ids

This operation returns the order related details for the shipments. This operation can accept either shipmentIds, orderIds or orderItemIds, but only one type of query param is accepted per invocation.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.ShipmentResponse;


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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentIds = "shipmentIds_example"; // String | Comma separated shipment ids
    String orderItemIds = "orderItemIds_example"; // String | Comma separated order item ids
    String orderIds = "orderIds_example"; // String | Comma separated order ids
    try {
      ShipmentResponse result = apiInstance.getShipmentDetailsByInternalId(shipmentIds, orderItemIds, orderIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getShipmentDetailsByInternalId");
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentIds** | **String**| Comma separated shipment ids | [optional]
 **orderItemIds** | **String**| Comma separated order item ids | [optional]
 **orderIds** | **String**| Comma separated order ids | [optional]

### Return type

[**ShipmentResponse**](ShipmentResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVendorGroupDetails"></a>
# **getVendorGroupDetails**
> java.util.List&lt;VendorGroupCodeDetailsResponseV3&gt; getVendorGroupDetails(locationId)

Get shipment handover counts per vendor

This operation returns the count of shipments to be handed over to the logistics partner (E-Kart or 3rd party vendors)

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.VendorGroupCodeDetailsResponseV3;


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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String locationId = "locationId_example"; // String | 
    try {
      java.util.List<VendorGroupCodeDetailsResponseV3> result = apiInstance.getVendorGroupDetails(locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#getVendorGroupDetails");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**|  | [optional]

### Return type

[**java.util.List&lt;VendorGroupCodeDetailsResponseV3&gt;**](VendorGroupCodeDetailsResponseV3.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markRTD"></a>
# **markRTD**
> ShipmentStatusResponse markRTD(body)

Mark shipments ready for dispatch

This operation is used to mark the shipments as &#x60;READY_TO_DISPATCH&#x60; after the labels and invoices are generated and downloaded.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.DispatchShipmentRequest;
import com.flipkart.api.seller.client.model.ShipmentStatusResponse;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    DispatchShipmentRequest body = new DispatchShipmentRequest(); // DispatchShipmentRequest |
    try {
      ShipmentStatusResponse result = apiInstance.markRTD(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#markRTD");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DispatchShipmentRequest**](DispatchShipmentRequest.md)|  | [optional]

### Return type

[**ShipmentStatusResponse**](ShipmentStatusResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pack"></a>
# **pack**
> ShipmentStatusResponse pack(body)

Trigger label generation for shipments

This operation triggers the generation of invoice and shipping labels for the shipment ids and marks shipments as &#x60;PACKED&#x60;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.ShipmentPackRequest;
import com.flipkart.api.seller.client.model.ShipmentStatusResponse;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    ShipmentPackRequest body = new ShipmentPackRequest(); // ShipmentPackRequest |
    try {
      ShipmentStatusResponse result = apiInstance.pack(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#pack");
      e.printStackTrace();
    }
  }
}


```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShipmentPackRequest**](ShipmentPackRequest.md)|  | [optional]

### Return type

[**ShipmentStatusResponse**](ShipmentStatusResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchPreDispatchShipmentGet"></a>
# **searchPreDispatchShipmentGet**
> SearchShipmentResponse searchPreDispatchShipmentGet(nextToken)

Search shipments using filters

This operation should be used if &#x60;hasMore&#x60; is true in the response of &#x60;POST /v3/shipments/filter&#x60; API, so that the client can fetch the next set of shipment which qualify the earlier defined filter criteria. User need not build this URL by themselves, just use the URL returned as &#x60;nextPageUrl&#x60; in the response of &#x60;POST /v3/shipments/filter&#x60; or &#x60;GET /v3/shipments/filter&#x60;.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.SearchShipmentResponse;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String nextToken = "nextToken_example"; // String |
    try {
      SearchShipmentResponse result = apiInstance.searchPreDispatchShipmentGet(nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#searchPreDispatchShipmentGet");
      e.printStackTrace();
    }
  }
}



```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextToken** | **String**|  | [optional]

### Return type

[**SearchShipmentResponse**](SearchShipmentResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchPreDispatchShipmentPost"></a>
# **searchPreDispatchShipmentPost**
> SearchShipmentResponse searchPreDispatchShipmentPost(body)

Search shipments using filters

This operation returns shipments based on applied filters

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.SearchShipmentRequest;
import com.flipkart.api.seller.client.model.SearchShipmentResponse;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    SearchShipmentRequest body = new SearchShipmentRequest(); // SearchShipmentRequest |
    try {
      SearchShipmentResponse result = apiInstance.searchPreDispatchShipmentPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#searchPreDispatchShipmentPost");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchShipmentRequest**](SearchShipmentRequest.md)|  | [optional]

### Return type

[**SearchShipmentResponse**](SearchShipmentResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSelfShipDeliverAttemptRequest"></a>
# **submitSelfShipDeliverAttemptRequest**
> ShipmentsDeliverResponseV2 submitSelfShipDeliverAttemptRequest(body)

Update delivery attempt for self-ship shipments

This operation is used to update the delivery attempt with failure reason and new delivery date for the self-ship shipments.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.SearchShipmentRequest;
import com.flipkart.api.seller.client.model.SearchShipmentResponse;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    ShipmentsDeliverAttemptRequestV2 body = new ShipmentsDeliverAttemptRequestV2(); // ShipmentsDeliverAttemptRequestV2 |
    try {
      ShipmentsDeliverResponseV2 result = apiInstance.submitSelfShipDeliverAttemptRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#submitSelfShipDeliverAttemptRequest");
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
 
<a name="submitSelfShipDeliveryRequest"></a>
# **submitSelfShipDeliveryRequest**
> ShipmentsDeliverResponseV2 submitSelfShipDeliveryRequest(body)

Update delivery date for self-ship shipments

This operation is used to update the delivery date for self-ship shipments.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    ShipmentsDeliverRequestV2 body = new ShipmentsDeliverRequestV2(); // ShipmentsDeliverRequestV2 |
    try {
      ShipmentsDeliverResponseV2 result = apiInstance.submitSelfShipDeliveryRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#submitSelfShipDeliveryRequest");
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

<a name="submitSelfShiptDispatchRequest"></a>
# **submitSelfShiptDispatchRequest**
> ShipmentsDispatchResponseV2 submitSelfShiptDispatchRequest(body)

Mark self-ship shipments dispatched

This operation is used to mark self-ship order items as &#x60;SHIPPED&#x60; from the seller warehouse.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.SelfshipDispatchRequestV3;
import com.flipkart.api.seller.client.model.ShipmentsDeliverRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverResponseV2;
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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    SelfshipDispatchRequestV3 body = new SelfshipDispatchRequestV3(); // SelfshipDispatchRequestV3 |
    try {
      ShipmentsDispatchResponseV2 result = apiInstance.submitSelfShiptDispatchRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#submitSelfShiptDispatchRequest");
      e.printStackTrace();
    }


  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SelfshipDispatchRequestV3**](SelfshipDispatchRequestV3.md)|  | [optional]

### Return type

[**ShipmentsDispatchResponseV2**](ShipmentsDispatchResponseV2.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTrackingInfo"></a>
# **updateTrackingInfo**
> updateTrackingInfo(shipmentId, body)

Update Tracking Id of the Shipment

This operation is used to update the Tracking Id for self-ship shipments.

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.UpdateShipmentRequest;

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

    ShipmentV3Api apiInstance = new ShipmentV3Api(apiClient);
    String shipmentId = "shipmentId_example"; // String |
    UpdateShipmentRequest body = new UpdateShipmentRequest(); // UpdateShipmentRequest |
    try {
      apiInstance.updateTrackingInfo(shipmentId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentV3Api#updateTrackingInfo");
      e.printStackTrace();
    }


  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**|  |
 **body** | [**UpdateShipmentRequest**](UpdateShipmentRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

