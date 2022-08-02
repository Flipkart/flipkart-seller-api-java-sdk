package com.flipkart.api.seller.client.api;

import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.ApiResponse;
import com.flipkart.api.seller.client.Configuration;
import com.flipkart.api.seller.client.Pair;
import com.flipkart.api.seller.client.model.CreateHyperlocalListingRequest;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
import com.flipkart.api.seller.client.model.UpdateHyperlocalListingRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ListingsHyperlocalV3Api {
  private ApiClient apiClient;

  public ListingsHyperlocalV3Api() {
    this(Configuration.getDefaultApiClient());
  }

  public ListingsHyperlocalV3Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create listing request
   *
   * @param body request (required)
   * @return Map&lt;String, ListingChangeResponse&gt;
   * @throws ApiException if fails to make API call
  <table summary="Response Details" border="1">
  <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
  <tr><td> 200 </td><td> Successfully created listings </td><td>  -  </td></tr>
  <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
  <tr><td> 401 </td><td> Client unauthorized </td><td>  -  </td></tr>
  <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
  </table>
   */
  public Map<String, ListingChangeResponse> createListings(Map<String, CreateHyperlocalListingRequest> body) throws ApiException {

    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createListings");
    }

    // create path and map variables
    String localVarPath = "/listings/v3/hyperlocal";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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

    GenericType<Map<String, ListingChangeResponse>> localVarReturnType = new GenericType<Map<String, ListingChangeResponse>>() {};

    return apiClient.invokeAPI( localVarPath, "POST", localVarQueryParams, localVarPostBody,
        localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType);
  }

  /**
   * Update listing request
   *
   * @param body request (required)
   * @return Map&lt;String, ListingChangeResponse&gt;
   * @throws ApiException if fails to make API call
  <table summary="Response Details" border="1">
  <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
  <tr><td> 200 </td><td> Successfully updated listings </td><td>  -  </td></tr>
  <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
  <tr><td> 401 </td><td> Client unauthorized </td><td>  -  </td></tr>
  <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
  </table>
   */
  public Map<String, ListingChangeResponse> updateListings(Map<String, UpdateHyperlocalListingRequest> body) throws ApiException {

    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateListings");
    }

    // create path and map variables
    String localVarPath = "/listings/v3/hyperlocal/update";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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

    GenericType<Map<String, ListingChangeResponse>> localVarReturnType = new GenericType<Map<String, ListingChangeResponse>>() {};

    return apiClient.invokeAPI( localVarPath, "POST", localVarQueryParams, localVarPostBody,
        localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType);
  }
}
