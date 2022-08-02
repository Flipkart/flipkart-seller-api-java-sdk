package com.flipkart.api.seller.client.api;

import com.flipkart.api.seller.client.ApiClient;
import com.flipkart.api.seller.client.ApiException;
import com.flipkart.api.seller.client.Configuration;
import com.flipkart.api.seller.client.Pair;
import com.flipkart.api.seller.client.model.GetMarketplaceListingDetailsResponse;
import com.flipkart.api.seller.client.model.ListingChangeResponse;
import com.flipkart.api.seller.client.model.UpdateInventoryRequest;
import com.flipkart.api.seller.client.model.UpdatePriceRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ListingsCommonV3Api {
  private ApiClient apiClient;

  public ListingsCommonV3Api() {
    this(Configuration.getDefaultApiClient());
  }

  public ListingsCommonV3Api(ApiClient apiClient) {
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
   * Get listings for SKUs
   *
   * @param skuIds sku-ids (required)
   * @return GetMarketplaceListingDetailsResponse
   * @throws ApiException if fails to make API call

  <table summary="Response Details" border="1">
  <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
  <tr><td> 200 </td><td> Successfully got the response </td><td>  -  </td></tr>
  <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
  <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
  </table>
   */
  public GetMarketplaceListingDetailsResponse getListings(String skuIds) throws ApiException {

    Object localVarPostBody = null;

    // verify the required parameter 'skuIds' is set
    if (skuIds == null) {
      throw new ApiException(400, "Missing the required parameter 'skuIds' when calling getListings");
    }

    // create path and map variables
    String localVarPath = "/listings/v3/{skuIds}"
        .replaceAll("\\{" + "skuIds" + "\\}", apiClient.escapeString(skuIds.toString()));


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

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2SelfAccess" };

    GenericType<GetMarketplaceListingDetailsResponse> localVarReturnType = new GenericType<GetMarketplaceListingDetailsResponse>() {};

    return apiClient.invokeAPI( localVarPath, "GET", localVarQueryParams, localVarPostBody,
        localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType);
  }


  /**
   * Update listing inventory request
   *
   * @param body request (required)
   * @return Map&lt;String, ListingChangeResponse&gt;
   * @throws ApiException if fails to make API call

  <table summary="Response Details" border="1">
  <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
  <tr><td> 200 </td><td> Successfully updated inventories </td><td>  -  </td></tr>
  <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
  <tr><td> 401 </td><td> Client unauthorized </td><td>  -  </td></tr>
  <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
  </table>
   */
  public Map<String, ListingChangeResponse> updateInventory(Map<String, UpdateInventoryRequest> body) throws ApiException {

    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInventory");
    }

    // create path and map variables
    String localVarPath = "/listings/v3/update/inventory";

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
   * Update listing price request
   *
   * @param body request (required)
   * @return Map&lt;String, ListingChangeResponse&gt;
   * @throws ApiException if fails to make API call

  <table summary="Response Details" border="1">
  <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
  <tr><td> 200 </td><td> Successfully updated prices </td><td>  -  </td></tr>
  <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
  <tr><td> 401 </td><td> Client unauthorized </td><td>  -  </td></tr>
  <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
  </table>
   */
  public Map<String, ListingChangeResponse> updatePrice(Map<String, UpdatePriceRequest> body) throws ApiException {

    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePrice");
    }

    // create path and map variables
    String localVarPath = "/listings/v3/update/price";

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


