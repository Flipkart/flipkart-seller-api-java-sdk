/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipkart.api.seller.client.api;

import com.flipkart.api.seller.client.model.ReturnsActionResponseV2;
import com.flipkart.api.seller.client.model.ReturnsApproveRequest;
import com.flipkart.api.seller.client.model.ReturnsRejectRequest;
import com.flipkart.api.seller.client.model.ReturnsSearchResponseV2;
import com.flipkart.api.seller.client.model.SelfShipReturnCancellationRequest;
import com.flipkart.api.seller.client.model.SelfShipReturnCompleteRequest;
import com.flipkart.api.seller.client.model.SelfShipReturnPickupAttemptRequests;
import com.flipkart.api.seller.client.model.SelfShipReturnPickupRequests;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReturnsV2Api
 */
@Ignore
public class ReturnsV2ApiTest {

    private final ReturnsV2Api api = new ReturnsV2Api();

    
    /**
     * Approve self-ship returns
     *
     * This operation is used to approve the self-ship returns.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void approveSelfShipReturnsTest() throws Exception {
        ReturnsApproveRequest body = null;
        ReturnsActionResponseV2 response = api.approveSelfShipReturns(body);

        // TODO: test validations
    }
    
    /**
     * Cancel self-ship return
     *
     * This operation is used to cancel the self-ship return
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelSelfShipReturnTest() throws Exception {
        SelfShipReturnCancellationRequest body = null;
        ReturnsActionResponseV2 response = api.cancelSelfShipReturn(body);

        // TODO: test validations
    }
    
    /**
     * Fetch returns
     *
     * This operation is used to fetch returns based on given return created / modified date ranges or specific &#x60;returnIds&#x60; or &#x60;trackingIds&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReturnsTest() throws Exception {
        String source = null;
        String modifiedAfter = null;
        String modifiedBefore = null;
        String createdAfter = null;
        String createdBefore = null;
        String returnIds = null;
        String trackingIds = null;
        String locationId = null;
        ReturnsSearchResponseV2 response = api.getReturns(source, modifiedAfter, modifiedBefore, createdAfter, createdBefore, returnIds, trackingIds, locationId);

        // TODO: test validations
    }
    
    /**
     * Update self-ship returns pickup details
     *
     * This operation is used to update the pickup details of customer self-ship returns.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pickupTest() throws Exception {
        SelfShipReturnPickupRequests body = null;
        ReturnsActionResponseV2 response = api.pickup(body);

        // TODO: test validations
    }
    
    /**
     * Update self-ship returns pickup attempt
     *
     * This operation is used to update the failed pickup attempt of self-ship returns.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pickupAttemptTest() throws Exception {
        SelfShipReturnPickupAttemptRequests body = null;
        ReturnsActionResponseV2 response = api.pickupAttempt(body);

        // TODO: test validations
    }
    
    /**
     * Reject self-ship returns
     *
     * This operation is used to reject customer self-ship returns.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rejectSelfShipReturnsTest() throws Exception {
        ReturnsRejectRequest body = null;
        ReturnsActionResponseV2 response = api.rejectSelfShipReturns(body);

        // TODO: test validations
    }
    
    /**
     * Update self-ship returns as complete
     *
     * This operation is used to mark the self-ship returns as complete.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void returnCompleteTest() throws Exception {
        SelfShipReturnCompleteRequest body = null;
        ReturnsActionResponseV2 response = api.returnComplete(body);

        // TODO: test validations
    }
    
}
