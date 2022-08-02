package com.flipkart.api.seller.client.api;

import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiResponse;
import com.flipkart.api.seller.client.Configuration;
import com.flipkart.api.seller.client.Pair;

import javax.ws.rs.core.GenericType;

import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.ReturnsApproveRequest;
import com.flipkart.api.seller.client.model.ReturnsRejectRequest;
import com.flipkart.api.seller.client.model.ReturnsSearchResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnCancellationRequest;
import com.flipkart.api.seller.client.model.SelfShipReturnCompleteRequest;
import com.flipkart.api.seller.client.model.SelfShipReturnPickupAttemptRequests;
import com.flipkart.api.seller.client.model.SelfShipReturnPickupRequests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnsV2Api {
  private ApiClient apiClient;

  public ReturnsV2Api() {
    this(Configuration.getDefaultApiClient());
  }

  public ReturnsV2Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Approve self-ship returns
   * This operation is used to approve the self-ship returns.
   * @param body  (optional)
   * @return ReturnsActionResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsActionResponseV2 approveSelfShipReturns(ReturnsApproveRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v2/returns/approve";

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

    GenericType<ReturnsActionResponseV2> localVarReturnType = new GenericType<ReturnsActionResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel self-ship return
   * This operation is used to cancel the self-ship return
   * @param body  (optional)
   * @return ReturnsActionResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsActionResponseV2 cancelSelfShipReturn(SelfShipReturnCancellationRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v2/returns/cancel";

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

    GenericType<ReturnsActionResponseV2> localVarReturnType = new GenericType<ReturnsActionResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch returns
   * This operation is used to fetch returns based on given return created / modified date ranges or specific &#x60;returnIds&#x60; or &#x60;trackingIds&#x60;
   * @param source  (optional)
   * @param modifiedAfter  (optional)
   * @param modifiedBefore  (optional)
   * @param createdAfter  (optional)
   * @param createdBefore  (optional)
   * @param returnIds Comma separated return ids. Max. 25 allowed. (optional)
   * @param trackingIds Comma separated tracking ids. Max. 25 allowed. (optional)
   * @param locationId  (optional)
   * @return ReturnsSearchResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsSearchResponseV2 getReturns(String source, String modifiedAfter, String modifiedBefore, String createdAfter, String createdBefore, String returnIds, String trackingIds, String locationId) throws ApiException {
   Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/returns";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "modifiedAfter", modifiedAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "modifiedBefore", modifiedBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdAfter", createdAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdBefore", createdBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnIds", returnIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trackingIds", trackingIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationId", locationId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<ReturnsSearchResponseV2> localVarReturnType = new GenericType<ReturnsSearchResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update self-ship returns pickup details
   * This operation is used to update the pickup details of customer self-ship returns.
   * @param body  (optional)
   * @return ReturnsActionResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsActionResponseV2 pickup(SelfShipReturnPickupRequests body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v2/returns/pickup";

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

    GenericType<ReturnsActionResponseV2> localVarReturnType = new GenericType<ReturnsActionResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update self-ship returns pickup attempt
   * This operation is used to update the failed pickup attempt of self-ship returns.
   * @param body  (optional)
   * @return ReturnsActionResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsActionResponseV2 pickupAttempt(SelfShipReturnPickupAttemptRequests body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v2/returns/pickupAttempt";

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

    GenericType<ReturnsActionResponseV2> localVarReturnType = new GenericType<ReturnsActionResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reject self-ship returns
   * This operation is used to reject customer self-ship returns.
   * @param body  (optional)
   * @return ReturnsActionResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsActionResponseV2 rejectSelfShipReturns(ReturnsRejectRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v2/returns/reject";

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

    GenericType<ReturnsActionResponseV2> localVarReturnType = new GenericType<ReturnsActionResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update self-ship returns as complete
   * This operation is used to mark the self-ship returns as complete.
   * @param body  (optional)
   * @return ReturnsActionResponseV2
   * @throws ApiException if fails to make API call
   */
  public ReturnsActionResponseV2 returnComplete(SelfShipReturnCompleteRequest body) throws ApiException {

    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v2/returns/complete";

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

    GenericType<ReturnsActionResponseV2> localVarReturnType = new GenericType<ReturnsActionResponseV2>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
