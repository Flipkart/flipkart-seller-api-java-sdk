# SelfServeApi

All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeDispatchSlots**](SelfServeApi.md#changeDispatchSlots) | **POST** /orders/sandbox/update_dispatch_slot | Change &#x60;dispatch_by_date&#x60; and &#x60;dispatch_after_date&#x60;
[**createReturn**](SelfServeApi.md#createReturn) | **POST** /returns/sandbox/create_returns | Create courier or customer return
[**createService**](SelfServeApi.md#createService) | **POST** /v2/shipments/sandbox/create_service/ | Create forward or reverse services for drop ship orders
[**createTestOrders**](SelfServeApi.md#createTestOrders) | **POST** /orders/sandbox/test_orders | Create test orders
[**makeOrderUnHold**](SelfServeApi.md#makeOrderUnHold) | **PUT** /orders/sandbox/un_hold | Mark order un hold
[**markOrderItemDelivered**](SelfServeApi.md#markOrderItemDelivered) | **POST** /orders/sandbox/delivered | Mark order item as delivered
[**markOrderItemPickupComplete**](SelfServeApi.md#markOrderItemPickupComplete) | **POST** /orders/sandbox/pick_up_complete | Mark order item as pick up complete
[**markOrderItemShipped**](SelfServeApi.md#markOrderItemShipped) | **POST** /orders/sandbox/shipped | Mark order item as shipped
[**processReturnEvents**](SelfServeApi.md#processReturnEvents) | **POST** /returns/sandbox/return_events | Process return events
[**putOrderOnHold**](SelfServeApi.md#putOrderOnHold) | **PUT** /orders/sandbox/on_hold | Put order on hold

<a name="changeDispatchSlots"></a>
# **changeDispatchSlots**
> CreateCourierReturnResponse changeDispatchSlots(body)

Change &#x60;dispatch_by_date&#x60; and &#x60;dispatch_after_date&#x60;

This operation changes dispatch_by_date and dispatch_after_date for a specified order item. Please note dispatch dates should be in IST format. For ex &#x27;dispatch_after_date&#x27;:&#x27;YYYY-MM-DDTHH:MM:SS+05:30&#x27;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.CreateTestOrdersRequest;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    CreateTestOrdersRequest body = new CreateTestOrdersRequest(); // CreateTestOrdersRequest |
    try {
      CreateCourierReturnResponse result = apiInstance.changeDispatchSlots(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#changeDispatchSlots");
      e.printStackTrace();
    }


  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTestOrdersRequest**](CreateTestOrdersRequest.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReturn"></a>
# **createReturn**
> CreateCourierReturnResponse createReturn(body)

Create courier or customer return

This operation creates return for order in post dispatch state. The return type can be courier or customer

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnRequest;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    CreateCourierReturnRequest body = new CreateCourierReturnRequest(); // CreateCourierReturnRequest |
    try {
      CreateCourierReturnResponse result = apiInstance.createReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#createReturn");
      e.printStackTrace();
    }


  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCourierReturnRequest**](CreateCourierReturnRequest.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createService"></a>
# **createService**
> CreateCourierReturnResponse createService(body)

Create forward or reverse services for drop ship orders

This operation creates forward or reverse services for self ship order items. PS: Order items should be of type self ship. serviceType field should be either &#x27;FORWARD&#x27; or &#x27;REVERSE&#x27;

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.CreateService;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    CreateService body = new CreateService(); // CreateService |
    try {
      CreateCourierReturnResponse result = apiInstance.createService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#createService");
      e.printStackTrace();
    }


  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateService**](CreateService.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTestOrders"></a>
# **createTestOrders**
> CreateTestOrdersResponse createTestOrders(body)

Create test orders

This operation creates test orders in sandbox

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateTestOrdersRequest;
import com.flipkart.api.seller.client.model.CreateTestOrdersResponse;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    CreateTestOrdersRequest body = new CreateTestOrdersRequest(); // CreateTestOrdersRequest | 
    try {
      CreateTestOrdersResponse result = apiInstance.createTestOrders(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#createTestOrders");
      e.printStackTrace();
    }



  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTestOrdersRequest**](CreateTestOrdersRequest.md)|  |

### Return type

[**CreateTestOrdersResponse**](CreateTestOrdersResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="makeOrderUnHold"></a>
# **makeOrderUnHold**
> CreateCourierReturnResponse makeOrderUnHold(body)

Mark order un hold

This operation makes specified order item un hold from on hold

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.MakeOrderUnHold;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    MakeOrderUnHold body = new MakeOrderUnHold(); // MakeOrderUnHold |
    try {
      CreateCourierReturnResponse result = apiInstance.makeOrderUnHold(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#makeOrderUnHold");
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MakeOrderUnHold**](MakeOrderUnHold.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markOrderItemDelivered"></a>
# **markOrderItemDelivered**
> CreateCourierReturnResponse markOrderItemDelivered(body)

Mark order item as delivered

This operation marks specified order item delivered and sends notification for the same

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.MarkOrderItemDelivered;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    MarkOrderItemDelivered body = new MarkOrderItemDelivered(); // MarkOrderItemDelivered |
    try {
      CreateCourierReturnResponse result = apiInstance.markOrderItemDelivered(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#markOrderItemDelivered");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MarkOrderItemDelivered**](MarkOrderItemDelivered.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markOrderItemPickupComplete"></a>
# **markOrderItemPickupComplete**
> CreateCourierReturnResponse markOrderItemPickupComplete(body)

Mark order item as pick up complete

This operation marks specified order item pick up complete and sends notification for the same

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.MarkOrderItemPickupComplete;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    MarkOrderItemPickupComplete body = new MarkOrderItemPickupComplete(); // MarkOrderItemPickupComplete |
    try {
      CreateCourierReturnResponse result = apiInstance.markOrderItemPickupComplete(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#markOrderItemPickupComplete");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MarkOrderItemPickupComplete**](MarkOrderItemPickupComplete.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markOrderItemShipped"></a>
# **markOrderItemShipped**
> CreateCourierReturnResponse markOrderItemShipped(body)

Mark order item as shipped

This operation marks specified order item shipped and sends notification for the same

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.MarkOrderItemShipped;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    MarkOrderItemShipped body = new MarkOrderItemShipped(); // MarkOrderItemShipped |
    try {
      CreateCourierReturnResponse result = apiInstance.markOrderItemShipped(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#markOrderItemShipped");
      e.printStackTrace();
    }

  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MarkOrderItemShipped**](MarkOrderItemShipped.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="processReturnEvents"></a>
# **processReturnEvents**
> CreateCourierReturnResponse processReturnEvents(body)

Process return events

This operation marks return completed or cancelled and sends notification for the same

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.ProcessReturnEvents;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    ProcessReturnEvents body = new ProcessReturnEvents(); // ProcessReturnEvents |
    try {
      CreateCourierReturnResponse result = apiInstance.processReturnEvents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#processReturnEvents");
      e.printStackTrace();
    }

  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessReturnEvents**](ProcessReturnEvents.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOrderOnHold"></a>
# **putOrderOnHold**
> CreateCourierReturnResponse putOrderOnHold(body)

Put order on hold

This operation puts specified order item on hold and sends notification for the same

### Example
```java
// Import classes:
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.SelfServeApi;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.PutOrderOnHold;

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

    SelfServeApi apiInstance = new SelfServeApi(apiClient);
    PutOrderOnHold body = new PutOrderOnHold(); // PutOrderOnHold |
    try {
      CreateCourierReturnResponse result = apiInstance.putOrderOnHold(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServeApi#putOrderOnHold");
      e.printStackTrace();
    }

  }
}


```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutOrderOnHold**](PutOrderOnHold.md)|  |

### Return type

[**CreateCourierReturnResponse**](CreateCourierReturnResponse.md)

### Authorization

[Oauth2SelfAccess](../README.md#Oauth2SelfAccess)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

