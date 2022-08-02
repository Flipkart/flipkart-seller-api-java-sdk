package com.flipkart.api.seller.client.api;

import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiResponse;
import com.flipkart.api.seller.client.Configuration;
import com.flipkart.api.seller.client.Pair;

import java.io.File;
import javax.ws.rs.core.GenericType;

import com.flipkart.api.seller.client.model.BulkActionProgressResponse;
import com.flipkart.api.seller.client.model.BulkConfirmResponseV2;
import com.flipkart.api.seller.client.model.BulkRtdActionRequest;
import com.flipkart.api.seller.client.model.BulkRtdResponse;
import com.flipkart.api.seller.client.model.CancelRequestV2;
import com.flipkart.api.seller.client.model.FetchOrderItemsResponse;
import com.flipkart.api.seller.client.model.GenerateLabelRequestV2;
import com.flipkart.api.seller.client.model.InvoicesSearchResponseV2;
import com.flipkart.api.seller.client.model.OrderItem;
import com.flipkart.api.seller.client.model.OrderItemCancelResponse;
import com.flipkart.api.seller.client.model.SearchOrderItemRequest;
import com.flipkart.api.seller.client.model.SearchOrderItemResponseV2;
import com.flipkart.api.seller.client.model.ServiceAttemptRequest;
import com.flipkart.api.seller.client.model.ServiceCompleteRequest;
import com.flipkart.api.seller.client.model.ServiceResponseStatusV2;
import com.flipkart.api.seller.client.model.ShipmentSearchResponse;
import com.flipkart.api.seller.client.model.ShipmentsDeliverAttemptRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverResponseV2;
import com.flipkart.api.seller.client.model.ShipmentsDispatchRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDispatchResponseV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrdersV2Api {
  private ApiClient apiClient;

  public OrdersV2Api() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersV2Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel order items
   * This operation allows client to cancel order items before marking them &#x60;PACKED&#x60;
   * @param body  (optional)
   * @return OrderItemCancelResponse
   * @throws ApiException if fails to make API call
   */
  public OrderItemCancelResponse cancelOrders(CancelRequestV2 body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/orders/cancel";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<OrderItemCancelResponse> localVarReturnType = new GenericType<OrderItemCancelResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Check label generation status
   * This operation returns the status of the label generation process which was triggered using &#x60;POST /v2/orders/labels&#x60; API. Query param &#x60;requestId&#x60; is the same value which is returned in the response of &#x60;POST /v2/orders/labels&#x60; API
   * @param requestId  (required)
   * @return BulkActionProgressResponse
   * @throws ApiException if fails to make API call
   */
  public BulkActionProgressResponse getBulkActionProgressByRequestId(String requestId) throws ApiException {

    Object localVarPostBody = null;

    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling getBulkActionProgressByRequestId");
    }

    // create path and map variables
    String localVarPath = "/v2/orders/labelRequest/{requestId}"
      .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<BulkActionProgressResponse> localVarReturnType = new GenericType<BulkActionProgressResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get invoice details for order items
   * This operation returns the GST tax details, invoice number and date for the order items
   * @param orderItemIds  (optional)
   * @return InvoicesSearchResponseV2
   * @throws ApiException if fails to make API call
   */
  public InvoicesSearchResponseV2 getInvoicesInfo(String orderItemIds) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/v2/orders/invoices";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderItemIds", orderItemIds));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<InvoicesSearchResponseV2> localVarReturnType = new GenericType<InvoicesSearchResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download labels and invoices in PDF format for order items
   * This operation returns the labels and invoices for the order items in PDF format. Label and invoice must have been generated before invoking this method.
   * @param orderItemIds Comma separated order items ids (optional)
   * @throws ApiException if fails to make API call
   */
  public File getLabels(String orderItemIds) throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/v2/orders/labels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderItemIds", orderItemIds));



    final String[] localVarAccepts = {
      "application/json", "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };
    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Download manifest PDF
   * This operation returns the manifest file in PDF format
   * @throws ApiException if fails to make API call
   */
  public File getManifestPdfForRequest() throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/v2/orders/manifest";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };
    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get details of order item
   * This operation returns details for the order item id
   * @param orderItemId A single order item id (required)
   * @return OrderItem
   * @throws ApiException if fails to make API call
   */
  public OrderItem getOrderItemById(String orderItemId) throws ApiException {

    Object localVarPostBody = null;

    // verify the required parameter 'orderItemId' is set
    if (orderItemId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderItemId' when calling getOrderItemById");
    }

    // create path and map variables
    String localVarPath = "/v2/orders/{order_item_id}"
      .replaceAll("\\{" + "order_item_id" + "\\}", apiClient.escapeString(orderItemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<OrderItem> localVarReturnType = new GenericType<OrderItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get details of order items
   * This operation returns details for the order item ids passed in the query param. This is a bulk version of &#x60;GET /v2/orders/{order_item_id}&#x60; API
   * @param orderItemIds Comma separated order item ids (optional)
   * @return FetchOrderItemsResponse
   * @throws ApiException if fails to make API call
   */
  public FetchOrderItemsResponse getOrderItemsByIds(String orderItemIds) throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/v2/orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderItemIds", orderItemIds));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<FetchOrderItemsResponse> localVarReturnType = new GenericType<FetchOrderItemsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get shipping related details of order items
   * This operation returns shipping and tracking related details of the order items e.g delivery / billing address, tracking id, buyer address, etc. Buyer contact number and email address would be provided only for self-ship orders.
   * @param orderItemIds  (optional)
   * @return ShipmentSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ShipmentSearchResponse getShipments(String orderItemIds) throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/v2/orders/shipments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderItemIds", orderItemIds));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ShipmentSearchResponse> localVarReturnType = new GenericType<ShipmentSearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search order items using filters
   * This operation returns order items based on applied filters
   * @param body  (optional)
   * @return SearchOrderItemResponseV2
   * @throws ApiException if fails to make API call
   */
  public SearchOrderItemResponseV2 searchOrderItemRequest(SearchOrderItemRequest body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/orders/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<SearchOrderItemResponseV2> localVarReturnType = new GenericType<SearchOrderItemResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Trigger label generation for order items
   * This operation triggers the generation of invoice and shipping labels for the order items and marks them as &#x60;PACKED&#x60;
   * @param body  (optional)
   * @return BulkConfirmResponseV2
   * @throws ApiException if fails to make API call
   */
  public BulkConfirmResponseV2 submitBulkConfirmRequest(GenerateLabelRequestV2 body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/orders/labels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<BulkConfirmResponseV2> localVarReturnType = new GenericType<BulkConfirmResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark order items ready for dispatch
   * This operation is used to mark the order items as &#x60;READY_TO_DISPATCH&#x60;. It must be invoked after downloading the invoice and label.
   * @param body  (optional)
   * @return BulkRtdResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRtdResponse submitBulkRtdRequest(BulkRtdActionRequest body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/orders/dispatch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<BulkRtdResponse> localVarReturnType = new GenericType<BulkRtdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update delivery attempt for self-ship order items
   * This operation is used to update the delivery attempt with failure reason and new delivery date for the self-ship order items.
   * @param body  (optional)
   * @return ShipmentsDeliverResponseV2
   * @throws ApiException if fails to make API call
   */
  public ShipmentsDeliverResponseV2 submitSelfShipDeliverAttemptRequest(ShipmentsDeliverAttemptRequestV2 body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/shipments/deliveryAttempt";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ShipmentsDeliverResponseV2> localVarReturnType = new GenericType<ShipmentsDeliverResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update delivery date for self-ship order items
   * This operation is used to update the delivery date for self-ship order items.
   * @param body  (optional)
   * @return ShipmentsDeliverResponseV2
   * @throws ApiException if fails to make API call
   */
  public ShipmentsDeliverResponseV2 submitSelfShipDeliverRequest(ShipmentsDeliverRequestV2 body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/shipments/delivery";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ShipmentsDeliverResponseV2> localVarReturnType = new GenericType<ShipmentsDeliverResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark self-ship order items ready for dispatch
   * This operation is used to mark self-ship order items as &#x60;READY_TO_DISPATCH&#x60; from the seller warehouse.
   * @param body  (optional)
   * @return ShipmentsDispatchResponseV2
   * @throws ApiException if fails to make API call
   */
  public ShipmentsDispatchResponseV2 submitSelfShipmentDispatchRequest(ShipmentsDispatchRequestV2 body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/shipments/dispatch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ShipmentsDispatchResponseV2> localVarReturnType = new GenericType<ShipmentsDispatchResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update service attempts
   * This operation is used to update the service attempt with failure reason and new delivery date.
   * @param body  (optional)
   * @return ServiceResponseStatusV2
   * @throws ApiException if fails to make API call
   */
  public ServiceResponseStatusV2 submitServiceAttemptRequest(ServiceAttemptRequest body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/services/attempt";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ServiceResponseStatusV2> localVarReturnType = new GenericType<ServiceResponseStatusV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update services as complete
   * This operation is used to mark the services as complete.
   * @param body  (optional)
   * @return ServiceResponseStatusV2
   * @throws ApiException if fails to make API call
   */
  public ServiceResponseStatusV2 submitServiceCompleteRequest(ServiceCompleteRequest body) throws ApiException {

    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v2/services/complete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ServiceResponseStatusV2> localVarReturnType = new GenericType<ServiceResponseStatusV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
