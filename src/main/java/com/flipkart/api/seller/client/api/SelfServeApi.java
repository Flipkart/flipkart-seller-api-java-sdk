package com.flipkart.api.seller.client.api;


import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.Configuration;
import com.flipkart.api.seller.client.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

import com.flipkart.api.seller.client.model.CreateCourierReturnRequest;
import com.flipkart.api.seller.client.model.CreateCourierReturnResponse;
import com.flipkart.api.seller.client.model.CreateService;
import com.flipkart.api.seller.client.model.CreateTestOrdersRequest;
import com.flipkart.api.seller.client.model.CreateTestOrdersResponse;
import com.flipkart.api.seller.client.model.MakeOrderUnHold;
import com.flipkart.api.seller.client.model.MarkOrderItemDelivered;
import com.flipkart.api.seller.client.model.MarkOrderItemPickupComplete;
import com.flipkart.api.seller.client.model.MarkOrderItemShipped;
import com.flipkart.api.seller.client.model.ProcessReturnEvents;
import com.flipkart.api.seller.client.model.PutOrderOnHold;


public class SelfServeApi {
  private ApiClient apiClient;

  public SelfServeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SelfServeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Change &#x60;dispatch_by_date&#x60; and &#x60;dispatch_after_date&#x60;
   * This operation changes dispatch_by_date and dispatch_after_date for a specified order item. Please note dispatch dates should be in IST format. For ex &#x27;dispatch_after_date&#x27;:&#x27;YYYY-MM-DDTHH:MM:SS+05:30&#x27;
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse changeDispatchSlots(CreateTestOrdersRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling changeDispatchSlots");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/update_dispatch_slot";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create courier or customer return
   * This operation creates return for order in post dispatch state. The return type can be courier or customer
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse createReturn(CreateCourierReturnRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createReturn");
    }
    // create path and map variables
    String localVarPath = "/returns/sandbox/create_returns";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create forward or reverse services for drop ship orders
   * This operation creates forward or reverse services for self ship order items. PS: Order items should be of type self ship. serviceType field should be either &#x27;FORWARD&#x27; or &#x27;REVERSE&#x27;
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse createService(CreateService body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createService");
    }
    // create path and map variables
    String localVarPath = "/v2/shipments/sandbox/create_service/";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create test orders
   * This operation creates test orders in sandbox
   * @param body  (required)
   * @return CreateTestOrdersResponse
   * @throws ApiException if fails to make API call
   */
  public CreateTestOrdersResponse createTestOrders(CreateTestOrdersRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTestOrders");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/test_orders";

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

    GenericType<CreateTestOrdersResponse> localVarReturnType = new GenericType<CreateTestOrdersResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Mark order un hold
   * This operation makes specified order item un hold from on hold
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse makeOrderUnHold(MakeOrderUnHold body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling makeOrderUnHold");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/un_hold";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Mark order item as delivered
   * This operation marks specified order item delivered and sends notification for the same
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse markOrderItemDelivered(MarkOrderItemDelivered body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling markOrderItemDelivered");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/delivered";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Mark order item as pick up complete
   * This operation marks specified order item pick up complete and sends notification for the same
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse markOrderItemPickupComplete(MarkOrderItemPickupComplete body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling markOrderItemPickupComplete");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/pick_up_complete";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Mark order item as shipped
   * This operation marks specified order item shipped and sends notification for the same
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse markOrderItemShipped(MarkOrderItemShipped body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling markOrderItemShipped");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/shipped";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Process return events
   * This operation marks return completed or cancelled and sends notification for the same
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse processReturnEvents(ProcessReturnEvents body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling processReturnEvents");
    }
    // create path and map variables
    String localVarPath = "/returns/sandbox/return_events";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Put order on hold
   * This operation puts specified order item on hold and sends notification for the same
   * @param body  (required)
   * @return CreateCourierReturnResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCourierReturnResponse putOrderOnHold(PutOrderOnHold body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putOrderOnHold");
    }
    // create path and map variables
    String localVarPath = "/orders/sandbox/on_hold";

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

    GenericType<CreateCourierReturnResponse> localVarReturnType = new GenericType<CreateCourierReturnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}

