# Flipkart Seller API Java SDK.

<img src="https://www.kindpng.com/picc/m/3-31442_vector-transparent-flipkart-logo-png-png-download.png" alt="flipkart" height="300" width="1000"/>

<br> This repository contains Flipkart Seller API Java SDK and samples to invoke Endpoints.</br>

## Flipkart Marketplace API
- API version: 3.0

This API is offered by Flipkart Marketplace to sellers and partners for orders and listing management. <br>You will need an access token to explore our APIs in both sandbox and prod environment. For details on getting an access token, refer to the <a href='https://seller.flipkart.com/api-docs/FMSAPI.html#sandbox-environment'> documentation</a>.

## Table of contents

- [Requirements](#requirements)
- [Installation](#installation)
  - [Maven users](#maven-users)
  - [Gradle users](#gradle-users)
  - [Others](#others)
- [Getting Started](#getting-started)
- [Sample Example For Sandbox Environmnet](#sample-example-for-sandbox-environment)
- [Sample Example For Prod Environment](#sample-example-for-prod-environment)
- [Documentation for API Endpoints](#documentation-for-api-endpoints)
- [Documentation for Models](#documentation-for-models)
- [Documentation for Authorization](#documentation-for-authorization)
- [Recommendation](#recommendation)
- [Author](#author)

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.flipkart.api.seller</groupId>
  <artifactId>flipkart-seller-api-java-sdk</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```gradle
repositories {
  mavenLocal()
}

dependencies {
  compile "com.flipkart.api.seller:flipkart-seller-api-java-sdk:0.1.0"
}
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/flipkart-seller-api-client-0.1.0-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:
1. First, create file MyFlipkartApplication.java in your workspace.
2. Select the Environment (SANDBOX or PROD)
    ```shell
    String env = String.valueOf(Environment.SANDBOX);
    ```
3. If it is Self Access, you can directly specify env
    ```
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);
    ```
    
    If it is Third Party Access, you have to specify both env and authorization_code. For more details please refer [Authorization Code Flow](https://seller.flipkart.com/api-docs/FMSAPI.html#auth-code-grant-label)
    ```
    UrlConfiguration urlConfiguration = new UrlConfiguration(env,"__authorization_code__");
    ```
4. Fetch the client id and client secret from Seller API's - Developer Admin

   ### Sandbox Environment 
   #### For Both Self and Third Party Access
   * [Sandbox Seller API's - Developer Admin](https://sandbox-api.flipkart.net/oauth-register/login;jsessionid=A5F5726AD6160EAF99B8C3A781ED0053)
   
   ### Production Environment
   #### For Self Access
   * [Seller Dashboard - Developer Portal](https://seller.flipkart.com/sell-online/?referral_url=%2Findex.html%3F%23dashboard%2Fdeveloper-access)
   #### For Third Party Access
   * [Prod Seller API's - Developer Admin](https://api.flipkart.net/oauth-register/login;jsessionid=A5F5726AD6160EAF99B8C3A781ED0053)

   ```
   //Replace the below values with your client id and secret
   accessTokenGenerator.clientCredentials("2236b321b07115458a50a701216b03229194","1e90ba1dc37ace3e658281c70ff215aac");
   String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
   System.out.println("Your Access Token: " + accessToken);
   ```
5. Create an ApiClient object with proper configurations.
    ```
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);
    ```
6. Make API Calls.
   ```
    //Sample API Call
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

    ```
7. Here, you can find a sample code snippet for all the flipkart seller api's [Documentation for API Endpoints](#documentation-for-api-endpoints) 

8. Run the code using IDE.

### Sample Example For Sandbox Environment 

```java
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.ShipmentResponse;
import java.util.ArrayList;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator= new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.SANDBOX);
    //For Self Access
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);
    //For Third Party
    UrlConfiguration urlConfiguration = new UrlConfiguration(env,"__auth_code__");

    //Replace the below values with client id and client secret here
    accessTokenGenerator.clientCredentials("__Client_ID__","__Client_Secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    //End Point Invocation
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
```

### Sample Example For PROD Environment

```java
package com.flipkart.api.seller.client.client_application;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Environment;
import com.flipkart.api.seller.client.UrlConfiguration;
import com.flipkart.api.seller.client.access_token_generation.AccessTokenGenerator;
import com.flipkart.api.seller.client.api.ShipmentV3Api;
import com.flipkart.api.seller.client.model.ShipmentResponse;
import java.util.ArrayList;

public class MyFlipkartApplication {

  public static void main(String[] args) {

    //Access Token Generation
    AccessTokenGenerator accessTokenGenerator= new AccessTokenGenerator();

    //choose environment SANDBOX or PROD
    String env = String.valueOf(Environment.PROD);
    //For Self Access
    UrlConfiguration urlConfiguration = new UrlConfiguration(env);
    //For Third Party
    UrlConfiguration urlConfiguration = new UrlConfiguration(env,"__auth_code__");

    //Replace the below values with client id and client secret here
    accessTokenGenerator.clientCredentials("__Client_ID__","__Client_Secret__");
    String accessToken = AccessTokenGenerator.getClientCredentialsAccessToken();
    System.out.println("Your Access Token: " + accessToken);

    //client call
    ApiClient apiClient = new ApiClient();
    apiClient.setAccessToken(accessToken);

    //End Point Invocation
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
```


## Documentation for API Endpoints


All URIs are relative to *https://sandbox-api.flipkart.net/sellers* , *https://api.flipkart.net/sellers*
<br>

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ListingsCommonV3Api* | [**getListings**](docs/ListingsCommonV3Api.md#getListings) | **GET** /listings/v3/{skuIds} | Get listings for SKUs 
*ListingsCommonV3Api* | [**updateInventory**](docs/ListingsCommonV3Api.md#updateInventory) | **POST** /listings/v3/update/inventory | Update listing inventory request 
*ListingsCommonV3Api* | [**updatePrice**](docs/ListingsCommonV3Api.md#updatePrice) | **POST** /listings/v3/update/price | Update listing price request
*ListingsFlipkartV3Api* | [**createListings**](ListingsFlipkartV3Api.md#createListings) | **POST** /listings/v3 | Create listing request |
*ListingsFlipkartV3Api* | [**updateListings**](ListingsFlipkartV3Api.md#updateListings) | **POST** /listings/v3/update | Update listing request |
*ListingsHyperlocalV3Api* | [**createListings**](ListingsHyperlocalV3Api.md#createListings) | **POST** /listings/v3/hyperlocal | Create listing request 
*ListingsHyperlocalV3Api* | [**updateListings**](ListingsHyperlocalV3Api.md#updateListings) | **POST** /listings/v3/hyperlocal/update | Update listing request 
*OrdersV2Api* | [**cancelOrders**](docs/OrdersV2Api.md#cancelOrders) | **POST** /v2/orders/cancel | Cancel order items
*OrdersV2Api* | [**getBulkActionProgressByRequestId**](docs/OrdersV2Api.md#getBulkActionProgressByRequestId) | **GET** /v2/orders/labelRequest/{requestId} | Check label generation status
*OrdersV2Api* | [**getInvoicesInfo**](docs/OrdersV2Api.md#getInvoicesInfo) | **GET** /v2/orders/invoices | Get invoice details for order items
*OrdersV2Api* | [**getLabels**](docs/OrdersV2Api.md#getLabels) | **GET** /v2/orders/labels | Download labels and invoices in PDF format for order items
*OrdersV2Api* | [**getManifestPdfForRequest**](docs/OrdersV2Api.md#getManifestPdfForRequest) | **GET** /v2/orders/manifest | Download manifest PDF
*OrdersV2Api* | [**getOrderItemById**](docs/OrdersV2Api.md#getOrderItemById) | **GET** /v2/orders/{order_item_id} | Get details of order item
*OrdersV2Api* | [**getOrderItemsByIds**](docs/OrdersV2Api.md#getOrderItemsByIds) | **GET** /v2/orders | Get details of order items
*OrdersV2Api* | [**getShipments**](docs/OrdersV2Api.md#getShipments) | **GET** /v2/orders/shipments | Get shipping related details of order items
*OrdersV2Api* | [**searchOrderItemRequest**](docs/OrdersV2Api.md#searchOrderItemRequest) | **POST** /v2/orders/search | Search order items using filters
*OrdersV2Api* | [**submitBulkConfirmRequest**](docs/OrdersV2Api.md#submitBulkConfirmRequest) | **POST** /v2/orders/labels | Trigger label generation for order items
*OrdersV2Api* | [**submitBulkRtdRequest**](docs/OrdersV2Api.md#submitBulkRtdRequest) | **POST** /v2/orders/dispatch | Mark order items ready for dispatch
*OrdersV2Api* | [**submitSelfShipDeliverAttemptRequest**](docs/OrdersV2Api.md#submitSelfShipDeliverAttemptRequest) | **POST** /v2/shipments/deliveryAttempt | Update delivery attempt for self-ship order items
*OrdersV2Api* | [**submitSelfShipDeliverRequest**](docs/OrdersV2Api.md#submitSelfShipDeliverRequest) | **POST** /v2/shipments/delivery | Update delivery date for self-ship order items
*OrdersV2Api* | [**submitSelfShipmentDispatchRequest**](docs/OrdersV2Api.md#submitSelfShipmentDispatchRequest) | **POST** /v2/shipments/dispatch | Mark self-ship order items ready for dispatch
*OrdersV2Api* | [**submitServiceAttemptRequest**](docs/OrdersV2Api.md#submitServiceAttemptRequest) | **POST** /v2/services/attempt | Update service attempts
*OrdersV2Api* | [**submitServiceCompleteRequest**](docs/OrdersV2Api.md#submitServiceCompleteRequest) | **POST** /v2/services/complete | Update services as complete
*ReturnsV2Api* | [**approveSelfShipReturns**](docs/ReturnsV2Api.md#approveSelfShipReturns) | **POST** /v2/returns/approve | Approve self-ship returns
*ReturnsV2Api* | [**cancelSelfShipReturn**](docs/ReturnsV2Api.md#cancelSelfShipReturn) | **POST** /v2/returns/cancel | Cancel self-ship return
*ReturnsV2Api* | [**getReturns**](docs/ReturnsV2Api.md#getReturns) | **GET** /v2/returns | Fetch returns
*ReturnsV2Api* | [**pickup**](docs/ReturnsV2Api.md#pickup) | **POST** /v2/returns/pickup | Update self-ship returns pickup details
*ReturnsV2Api* | [**pickupAttempt**](docs/ReturnsV2Api.md#pickupAttempt) | **POST** /v2/returns/pickupAttempt | Update self-ship returns pickup attempt
*ReturnsV2Api* | [**rejectSelfShipReturns**](docs/ReturnsV2Api.md#rejectSelfShipReturns) | **POST** /v2/returns/reject | Reject self-ship returns
*ReturnsV2Api* | [**returnComplete**](docs/ReturnsV2Api.md#returnComplete) | **POST** /v2/returns/complete | Update self-ship returns as complete
*ShipmentV3Api* | [**cancelByEnforcedGroupIds**](docs/ShipmentV3Api.md#cancelByEnforcedGroupIds) | **POST** /v3/shipments/cancel | Cancel order items in a shipment
*ShipmentV3Api* | [**getInvoicesPdfFromEsi**](docs/ShipmentV3Api.md#getInvoicesPdfFromEsi) | **GET** /v3/shipments/{shipmentIds}/invoices | Download invoice PDF
*ShipmentV3Api* | [**getLabels**](docs/ShipmentV3Api.md#getLabels) | **GET** /v3/shipments/{shipmentIds}/labels | Download labels and invoices in PDF format for shipments
*ShipmentV3Api* | [**getLabelsOnly**](docs/ShipmentV3Api.md#getLabelsOnly) | **POST** /v3/shipments/{shipmentIds}/labelOnly | Download labels Byte-Stream for shipments
*ShipmentV3Api* | [**getLabelsOnlyPDF**](docs/ShipmentV3Api.md#getLabelsOnlyPDF) | **POST** /v3/shipments/{shipmentIds}/labelOnly/pdf | Download labels in PDF format for shipments
*ShipmentV3Api* | [**getManifest**](docs/ShipmentV3Api.md#getManifest) | **POST** /v3/shipments/manifest | Download manifest PDF
*ShipmentV3Api* | [**getShipmentDetails**](docs/ShipmentV3Api.md#getShipmentDetails) | **GET** /v3/shipments/{shipmentIds} | Get shipping related details for shipments
*ShipmentV3Api* | [**getShipmentDetailsByInternalId**](docs/ShipmentV3Api.md#getShipmentDetailsByInternalId) | **GET** /v3/shipments | Get order details for given shipment or order ids
*ShipmentV3Api* | [**getVendorGroupDetails**](docs/ShipmentV3Api.md#getVendorGroupDetails) | **GET** /v3/shipments/handover/counts | Get shipment handover counts per vendor
*ShipmentV3Api* | [**markRTD**](docs/ShipmentV3Api.md#markRTD) | **POST** /v3/shipments/dispatch | Mark shipments ready for dispatch
*ShipmentV3Api* | [**pack**](docs/ShipmentV3Api.md#pack) | **POST** /v3/shipments/labels | Trigger label generation for shipments
*ShipmentV3Api* | [**searchPreDispatchShipmentGet**](docs/ShipmentV3Api.md#searchPreDispatchShipmentGet) | **GET** /v3/shipments/filter | Search shipments using filters
*ShipmentV3Api* | [**searchPreDispatchShipmentPost**](docs/ShipmentV3Api.md#searchPreDispatchShipmentPost) | **POST** /v3/shipments/filter | Search shipments using filters
*ShipmentV3Api* | [**submitSelfShipDeliverAttemptRequest**](docs/ShipmentV3Api.md#submitSelfShipDeliverAttemptRequest) | **POST** /v3/shipments/selfShip/deliveryAttempt | Update delivery attempt for self-ship shipments
*ShipmentV3Api* | [**submitSelfShipDeliveryRequest**](docs/ShipmentV3Api.md#submitSelfShipDeliveryRequest) | **POST** /v3/shipments/selfShip/delivery | Update delivery date for self-ship shipments
*ShipmentV3Api* | [**submitSelfShiptDispatchRequest**](docs/ShipmentV3Api.md#submitSelfShiptDispatchRequest) | **POST** /v3/shipments/selfShip/dispatch | Mark self-ship shipments dispatched
*ShipmentV3Api* | [**updateTrackingInfo**](docs/ShipmentV3Api.md#updateTrackingInfo) | **POST** /v3/shipments/{shipmentId}/update | Update Tracking Id of the Shipment


All URIs are relative to *https://sandbox-api.flipkart.net/sellers*
<br>

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SelfServeApi* | [**changeDispatchSlots**](docs/SelfServeApi.md#changeDispatchSlots) | **POST** /orders/sandbox/update_dispatch_slot | Change &#x60;dispatch_by_date&#x60; and &#x60;dispatch_after_date&#x60;
*SelfServeApi* | [**createReturn**](docs/SelfServeApi.md#createReturn) | **POST** /returns/sandbox/create_returns | Create courier or customer return
*SelfServeApi* | [**createService**](docs/SelfServeApi.md#createService) | **POST** /v2/shipments/sandbox/create_service/ | Create forward or reverse services for drop ship orders
*SelfServeApi* | [**createTestOrders**](docs/SelfServeApi.md#createTestOrders) | **POST** /orders/sandbox/test_orders | Create test orders
*SelfServeApi* | [**makeOrderUnHold**](docs/SelfServeApi.md#makeOrderUnHold) | **PUT** /orders/sandbox/un_hold | Mark order un hold
*SelfServeApi* | [**markOrderItemDelivered**](docs/SelfServeApi.md#markOrderItemDelivered) | **POST** /orders/sandbox/delivered | Mark order item as delivered
*SelfServeApi* | [**markOrderItemPickupComplete**](docs/SelfServeApi.md#markOrderItemPickupComplete) | **POST** /orders/sandbox/pick_up_complete | Mark order item as pick up complete
*SelfServeApi* | [**markOrderItemShipped**](docs/SelfServeApi.md#markOrderItemShipped) | **POST** /orders/sandbox/shipped | Mark order item as shipped
*SelfServeApi* | [**processReturnEvents**](docs/SelfServeApi.md#processReturnEvents) | **POST** /returns/sandbox/return_events | Process return events
*SelfServeApi* | [**putOrderOnHold**](docs/SelfServeApi.md#putOrderOnHold) | **PUT** /orders/sandbox/on_hold | Put order on hold

## Documentation for Models

 - [Address](docs/Address.md)
 - [AddressLabel](docs/AddressLabel.md)
 - [AttributeError](docs/AttributeError.md)
 - [BulkActionProgressResponse](docs/BulkActionProgressResponse.md)
 - [BulkConfirmItem](docs/BulkConfirmItem.md)
 - [BulkConfirmResponseV2](docs/BulkConfirmResponseV2.md)
 - [BulkConfirmedItem](docs/BulkConfirmedItem.md)
 - [BulkOrderItem](docs/BulkOrderItem.md)
 - [BulkRtdActionRequest](docs/BulkRtdActionRequest.md)
 - [BulkRtdRequestItemStatus](docs/BulkRtdRequestItemStatus.md)
 - [BulkRtdResponse](docs/BulkRtdResponse.md)
 - [BuyerDetails](docs/BuyerDetails.md)
 - [CancelOrderItemRequest](docs/CancelOrderItemRequest.md)
 - [CancelRequestV2](docs/CancelRequestV2.md)
 - [CancelShipment](docs/CancelShipment.md)
 - [CancelShipmentRequest](docs/CancelShipmentRequest.md)
 - [ConfirmItemRow](docs/ConfirmItemRow.md)
 - [Courier](docs/Courier.md)
 - [CourierDetails](docs/CourierDetails.md)
 - [CreateCourierReturnRequest](docs/CreateCourierReturnRequest.md)
 - [CreateCourierReturnResponse](docs/CreateCourierReturnResponse.md)
 - [CreateHyperlocalListingRequest](docs/CreateHyperlocalListingRequest.md)
 - [CreateOrderItem](docs/CreateOrderItem.md)
 - [CreateOrderItemResponse](docs/CreateOrderItemResponse.md)
 - [CreateListingRequest](docs/CreateListingRequest.md)
 - [CreateService](docs/CreateService.md)
 - [CreateTestOrdersRequest](docs/CreateTestOrdersRequest.md)
 - [CreateTestOrdersResponse](docs/CreateTestOrdersResponse.md)
 - [Currency](docs/Currency.md) 
 - [DateFilter](docs/DateFilter.md)
 - [DatingLabel](docs/DatingLabel.md)
 - [DeliverRequest](docs/DeliverRequest.md)
 - [Dimension](docs/Dimension.md)
 - [Dimensions](docs/Dimensions.md)
 - [DispatchAddress](docs/DispatchAddress.md)
 - [DispatchLocation](docs/DispatchLocation.md)
 - [DispatchRequest](docs/DispatchRequest.md)
 - [DispatchRequestV3](docs/DispatchRequestV3.md)
 - [DispatchShipmentRequest](docs/DispatchShipmentRequest.md)
 - [Error](docs/Error.md)
 - [FailedCancellations](docs/FailedCancellations.md)
 - [FailureAttributes](docs/FailureAttributes.md)
 - [FetchOrderItemsResponse](docs/FetchOrderItemsResponse.md)
 - [Filter](docs/Filter.md)
 - [Form](docs/Form.md)
 - [Fulfillment](docs/Fulfillment.md)
 - [GenerateLabelRequestItemV2](docs/GenerateLabelRequestItemV2.md)
 - [GenerateLabelRequestV2](docs/GenerateLabelRequestV2.md)
 - [GetManifestRequest](docs/GetManifestRequest.md)
 - [GetMarketplaceListingDetailsResponse](docs/GetMarketplaceListingDetailsResponse.md)
 - [Handling](docs/Handling.md)
 - [InputStream](docs/InputStream.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceDetails](docs/InvoiceDetails.md)
 - [InvoiceDetailsResponseV3](docs/InvoiceDetailsResponseV3.md)
 - [InvoiceItem](docs/InvoiceItem.md)
 - [InvoiceRequest](docs/InvoiceRequest.md)
 - [InvoicesSearchResponseV2](docs/InvoicesSearchResponseV2.md)
 - [ListingChangeResponse](docs/ListingChangeResponse.md)
 - [Location](docs/Location.md)
 - [MakeOrderUnHold](docs/MakeOrderUnHold.md)
 - [MarkOrderItemDelivered](docs/MarkOrderItemDelivered.md)
 - [MarkOrderItemPickupComplete](docs/MarkOrderItemPickupComplete.md)
 - [MarkOrderItemShipped](docs/MarkOrderItemShipped.md)
 - [MarketplaceListingDetail](docs/MarketplaceListingDetail.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [NotionalValue](docs/NotionalValue.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderItemCancelResponse](docs/OrderItemCancelResponse.md)
 - [OrderItems](docs/OrderItems.md)
 - [Otc](docs/Otc.md)
 - [PackRequest](docs/PackRequest.md)
 - [Pagination](docs/Pagination.md)
 - [Params](docs/Params.md)
 - [PickUpDate](docs/PickUpDate.md)
 - [Price](docs/Price.md)
 - [PriceComponent](docs/PriceComponent.md)
 - [PriceComponents](docs/PriceComponents.md)
 - [ProcessReturnEvents](docs/ProcessReturnEvents.md)
 - [PutOrderOnHold](docs/PutOrderOnHold.md)
 - [RequestStatus](docs/RequestStatus.md)
 - [ReturnActionResponse](docs/ReturnActionResponse.md)
 - [ReturnApproveRequest](docs/ReturnApproveRequest.md)
 - [ReturnItem](docs/ReturnItem.md)
 - [ReturnRejectRequest](docs/ReturnRejectRequest.md)
 - [ReturnsActionResponseV2](docs/ReturnsActionResponseV2.md)
 - [ReturnsApproveRequest](docs/ReturnsApproveRequest.md)
 - [ReturnsRejectRequest](docs/ReturnsRejectRequest.md)
 - [ReturnsSearchResponseV2](docs/ReturnsSearchResponseV2.md)
 - [SearchOrderItemRequest](docs/SearchOrderItemRequest.md)
 - [SearchOrderItemResponseV2](docs/SearchOrderItemResponseV2.md)
 - [SearchShipmentRequest](docs/SearchShipmentRequest.md)
 - [SearchShipmentResponse](docs/SearchShipmentResponse.md)
 - [SelfShipReturnAttemptPickupRequest](docs/SelfShipReturnAttemptPickupRequest.md)
 - [SelfShipReturnCancellationRequest](docs/SelfShipReturnCancellationRequest.md)
 - [SelfShipReturnCompleteRequest](docs/SelfShipReturnCompleteRequest.md)
 - [SelfShipReturnPickupAttemptRequests](docs/SelfShipReturnPickupAttemptRequests.md)
 - [SelfShipReturnPickupRequest](docs/SelfShipReturnPickupRequest.md)
 - [SelfShipReturnPickupRequests](docs/SelfShipReturnPickupRequests.md)
 - [SelfshipDispatchRequestV3](docs/SelfshipDispatchRequestV3.md)
 - [SellerAddress](docs/SellerAddress.md)
 - [SerialNumber](docs/SerialNumber.md)
 - [Service](docs/Service.md)
 - [ServiceAttemptRequest](docs/ServiceAttemptRequest.md)
 - [ServiceCompleteRequest](docs/ServiceCompleteRequest.md)
 - [ServiceResponseStatusV2](docs/ServiceResponseStatusV2.md)
 - [Shipment](docs/Shipment.md)
 - [ShipmentDetails](docs/ShipmentDetails.md)
 - [ShipmentDetailsResponseV3](docs/ShipmentDetailsResponseV3.md)
 - [ShippingFees](docs/ShippingFees.md)
 - [ShipmentPackRequest](docs/ShipmentPackRequest.md)
 - [ShipmentResponse](docs/ShipmentResponse.md)
 - [ShipmentResponseStatusV2](docs/ShipmentResponseStatusV2.md)
 - [ShipmentSearchResponse](docs/ShipmentSearchResponse.md)
 - [ShipmentStatusResponse](docs/ShipmentStatusResponse.md)
 - [ShipmentsDeliverAttemptRequestV2](docs/ShipmentsDeliverAttemptRequestV2.md)
 - [ShipmentsDeliverRequestV2](docs/ShipmentsDeliverRequestV2.md)
 - [ShipmentsDeliverResponseV2](docs/ShipmentsDeliverResponseV2.md)
 - [ShipmentsDispatchRequestV2](docs/ShipmentsDispatchRequestV2.md)
 - [ShipmentsDispatchResponseV2](docs/ShipmentsDispatchResponseV2.md)
 - [Sort](docs/Sort.md)
 - [SubItemRequest](docs/SubItemRequest.md)
 - [SubShipment](docs/SubShipment.md)
 - [SubShipments](docs/SubShipments.md)
 - [Tax](docs/Tax.md)
 - [TaxDetails](docs/TaxDetails.md)
 - [TaxItem](docs/TaxItem.md)
 - [UpdateHyperlocalListingRequest](docs/UpdateHyperlocalListingRequest.md)
 - [UpdateInventoryRequest](docs/UpdateInventoryRequest.md)
 - [UpdatePriceRequest](docs/UpdatePriceRequest.md)
 - [UpdateListingRequest](docs/UpdateListingRequest.md)
 - [UpdateShipmentRequest](docs/UpdateShipmentRequest.md)
 - [VendorGroupCodeDetailsResponseV3](docs/VendorGroupCodeDetailsResponseV3.md)


## Documentation for Authorization

Authentication schemes defined for the API:

### Oauth2SelfAccess

- **Type**: OAuth
- **Flow**: application
- **Generating Access Token**: https://seller.flipkart.com/api-docs/FMSAPI.html#generating-access-tokens
- **Scopes**: 
  - : Seller_Api

### Oauth2ThirdParty

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization Code flow**: https://seller.flipkart.com/api-docs/FMSAPI.html#auth-code-grant-label
- **Generating Access Token**: https://seller.flipkart.com/api-docs/FMSAPI.html#generating-access-tokens
- **Scopes**: 
  - : Seller_Api


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

- seller-api-queries@flipkart.com


