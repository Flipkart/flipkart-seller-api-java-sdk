package com.flipkart.api.seller.client.api;

import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiResponse;
import com.flipkart.api.seller.client.Configuration;
import com.flipkart.api.seller.client.Pair;

import java.io.File;
import javax.ws.rs.core.GenericType;

import com.flipkart.api.seller.client.model.CancelShipmentRequest;
import com.flipkart.api.seller.client.model.DispatchShipmentRequest;
import com.flipkart.api.seller.client.model.GetManifestRequest;
import com.flipkart.api.seller.client.model.InputStream;
import com.flipkart.api.seller.client.model.SearchShipmentRequest;
import com.flipkart.api.seller.client.model.SearchShipmentResponse;
import com.flipkart.api.seller.client.model.SelfshipDispatchRequestV3;
import com.flipkart.api.seller.client.model.ShipmentDetailsResponseV3;
import com.flipkart.api.seller.client.model.ShipmentPackRequest;
import com.flipkart.api.seller.client.model.ShipmentResponse;
import com.flipkart.api.seller.client.model.ShipmentStatusResponse;
import com.flipkart.api.seller.client.model.ShipmentsDeliverAttemptRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverRequestV2;
import com.flipkart.api.seller.client.model.ShipmentsDeliverResponseV2;
import com.flipkart.api.seller.client.model.ShipmentsDispatchResponseV2;
import com.flipkart.api.seller.client.model.UpdateShipmentRequest;
import com.flipkart.api.seller.client.model.VendorGroupCodeDetailsResponseV3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentV3Api {
  private ApiClient apiClient;

  public ShipmentV3Api() {
    this(Configuration.getDefaultApiClient());
  }

  public ShipmentV3Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel order items in a shipment
   * This operation allows client to cancel order items inside shipment before marking them &#x60;PACKED&#x60;
   * @param body  (optional)
   * @return ShipmentStatusResponse
   * @throws ApiException if fails to make API call
   */
  public ShipmentStatusResponse cancelByEnforcedGroupIds(CancelShipmentRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/cancel";

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

    GenericType<ShipmentStatusResponse> localVarReturnType = new GenericType<ShipmentStatusResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download invoice PDF
   * This operation provides invoices for shipments in the PDF format. Label and invoice must have been generated before invoking this method.
   * @param shipmentIds Comma separated shipment ids (required)
   * @throws ApiException if fails to make API call
   */
  public File getInvoicesPdfFromEsi(String shipmentIds) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentIds' is set
    if (shipmentIds == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentIds' when calling getInvoicesPdfFromEsi");
    }
    
    // create path and map variables
    String localVarPath = "/v3/shipments/{shipmentIds}/invoices"
      .replaceAll("\\{" + "shipmentIds" + "\\}", apiClient.escapeString(shipmentIds.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/pdf"
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
   * Download labels and invoices in PDF format for shipments
   * This operation returns the labels and invoices for the shipments in PDF format
   * @param shipmentIds Comma separated shipment ids (required)
   * @throws ApiException if fails to make API call
   */
  public File getLabels(String shipmentIds) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentIds' is set
    if (shipmentIds == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentIds' when calling getLabels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/shipments/{shipmentIds}/labels"
      .replaceAll("\\{" + "shipmentIds" + "\\}", apiClient.escapeString(shipmentIds.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };
    GenericType<File> localVarReturnType = new GenericType<File>() {};


     return  apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Download labels Byte-Stream for shipments
   * This operation returns the labels for the shipments in Byte-Stream format
   * @param shipmentIds Comma separated shipmentIds (required)
   * @param reprint True to rePrint Label (optional, default to false)
   * @return InputStream
   * @throws ApiException if fails to make API call
   */
  public InputStream getLabelsOnly(String shipmentIds, Boolean reprint) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentIds' is set
    if (shipmentIds == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentIds' when calling getLabelsOnly");
    }
    
    // create path and map variables
    String localVarPath = "/v3/shipments/{shipmentIds}/labelOnly"
      .replaceAll("\\{" + "shipmentIds" + "\\}", apiClient.escapeString(shipmentIds.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reprint", reprint));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<InputStream> localVarReturnType = new GenericType<InputStream>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download labels in PDF format for shipments
   * This operation returns the labels for the shipments in PDF format
   * @param shipmentIds Comma separated shipment ids (required)
   * @param reprint True if you are reprinting Label (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public File getLabelsOnlyPDF(String shipmentIds, Boolean reprint) throws ApiException {


    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentIds' is set
    if (shipmentIds == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentIds' when calling getLabelsOnlyPDF");
    }
    
    // create path and map variables
    String localVarPath = "/v3/shipments/{shipmentIds}/labelOnly/pdf"
      .replaceAll("\\{" + "shipmentIds" + "\\}", apiClient.escapeString(shipmentIds.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reprint", reprint));

    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Download manifest PDF
   * This operation returns the manifest file in PDF format
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public File getManifest(GetManifestRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/manifest";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };
    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get shipping related details for shipments
   * This operation returns shipping and tracking related details of the shipments e.g delivery / billing address, tracking id, buyer address, etc. Buyer contact number and email address would be provided only for self-ship shipments.
   * @param shipmentIds Comma separated shipment ids (required)
   * @return ShipmentDetailsResponseV3
   * @throws ApiException if fails to make API call
   */
  public ShipmentDetailsResponseV3 getShipmentDetails(String shipmentIds) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentIds' is set
    if (shipmentIds == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentIds' when calling getShipmentDetails");
    }
    
    // create path and map variables
    String localVarPath = "/v3/shipments/{shipmentIds}"
      .replaceAll("\\{" + "shipmentIds" + "\\}", apiClient.escapeString(shipmentIds.toString()));

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

    GenericType<ShipmentDetailsResponseV3> localVarReturnType = new GenericType<ShipmentDetailsResponseV3>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get order details for given shipment or order ids
   * This operation returns the order related details for the shipments. This operation can accept either shipmentIds, orderIds or orderItemIds, but only one type of query param is accepted per invocation.
   * @param shipmentIds Comma separated shipment ids (optional)
   * @param orderItemIds Comma separated order item ids (optional)
   * @param orderIds Comma separated order ids (optional)
   * @return ShipmentResponse
   * @throws ApiException if fails to make API call
   */
  public ShipmentResponse getShipmentDetailsByInternalId(String shipmentIds, String orderItemIds, String orderIds) throws ApiException {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/shipments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipmentIds", shipmentIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderItemIds", orderItemIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderIds", orderIds));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ShipmentResponse> localVarReturnType = new GenericType<ShipmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get shipment handover counts per vendor
   * This operation returns the count of shipments to be handed over to the logistics partner (E-Kart or 3rd party vendors)
   * @param locationId  (optional)
   * @return List&lt;VendorGroupCodeDetailsResponseV3&gt;
   * @throws ApiException if fails to make API call
   */
  public List<VendorGroupCodeDetailsResponseV3> getVendorGroupDetails(String locationId) throws ApiException {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/handover/counts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationId", locationId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<List<VendorGroupCodeDetailsResponseV3>> localVarReturnType = new GenericType<List<VendorGroupCodeDetailsResponseV3>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mark shipments ready for dispatch
   * This operation is used to mark the shipments as &#x60;READY_TO_DISPATCH&#x60; after the labels and invoices are generated and downloaded.
   * @param body  (optional)
   * @return ShipmentStatusResponse
   * @throws ApiException if fails to make API call
   */
  public ShipmentStatusResponse markRTD(DispatchShipmentRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/dispatch";

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

    GenericType<ShipmentStatusResponse> localVarReturnType = new GenericType<ShipmentStatusResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Trigger label generation for shipments
   * This operation triggers the generation of invoice and shipping labels for the shipment ids and marks shipments as &#x60;PACKED&#x60;
   * @param body  (optional)
   * @return ShipmentStatusResponse
   * @throws ApiException if fails to make API call
   */
  public ShipmentStatusResponse pack(ShipmentPackRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/labels";

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

    GenericType<ShipmentStatusResponse> localVarReturnType = new GenericType<ShipmentStatusResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search shipments using filters
   * This operation should be used if &#x60;hasMore&#x60; is true in the response of &#x60;POST /v3/shipments/filter&#x60; API, so that the client can fetch the next set of shipment which qualify the earlier defined filter criteria. User need not build this URL by themselves, just use the URL returned as &#x60;nextPageUrl&#x60; in the response of &#x60;POST /v3/shipments/filter&#x60; or &#x60;GET /v3/shipments/filter&#x60;.
   * @param nextToken  (optional)
   * @return SearchShipmentResponse
   * @throws ApiException if fails to make API call
   */
  public SearchShipmentResponse searchPreDispatchShipmentGet(String nextToken) throws ApiException {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/filter";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_token", nextToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<SearchShipmentResponse> localVarReturnType = new GenericType<SearchShipmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search shipments using filters
   * This operation returns shipments based on applied filters
   * @param body  (optional)
   * @return SearchShipmentResponse
   * @throws ApiException if fails to make API call
   */
  public SearchShipmentResponse searchPreDispatchShipmentPost(SearchShipmentRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/filter";

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

    GenericType<SearchShipmentResponse> localVarReturnType = new GenericType<SearchShipmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update delivery attempt for self-ship shipments
   * This operation is used to update the delivery attempt with failure reason and new delivery date for the self-ship shipments.
   * @param body  (optional)
   * @return ShipmentsDeliverResponseV2
   * @throws ApiException if fails to make API call
   */
  public ShipmentsDeliverResponseV2 submitSelfShipDeliverAttemptRequest(ShipmentsDeliverAttemptRequestV2 body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/selfShip/deliveryAttempt";

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
   * Update delivery date for self-ship shipments
   * This operation is used to update the delivery date for self-ship shipments.
   * @param body  (optional)
   * @return ShipmentsDeliverResponseV2
   * @throws ApiException if fails to make API call
   */
  public ShipmentsDeliverResponseV2 submitSelfShipDeliveryRequest(ShipmentsDeliverRequestV2 body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/selfShip/delivery";

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
   * Mark self-ship shipments dispatched
   * This operation is used to mark self-ship order items as &#x60;SHIPPED&#x60; from the seller warehouse.
   * @param body  (optional)
   * @return ShipmentsDispatchResponseV2
   * @throws ApiException if fails to make API call
   */
  public ShipmentsDispatchResponseV2 submitSelfShiptDispatchRequest(SelfshipDispatchRequestV3 body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/shipments/selfShip/dispatch";

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
   * Update Tracking Id of the Shipment
   * This operation is used to update the Tracking Id for self-ship shipments.
   * @param shipmentId  (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateTrackingInfo(String shipmentId, UpdateShipmentRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling updateTrackingInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v3/shipments/{shipmentId}/update"
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
