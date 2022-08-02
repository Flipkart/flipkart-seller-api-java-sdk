/*
 * Flipkart Marketplace API
 * This API is offered by Flipkart Marketplace to sellers and partners for orders and listing management. <br /><br />You will need an access token to explore our APIs in the sandbox environment. For details on getting an access token, refer to the <a href='https://seller.flipkart.com/api-docs/FMSAPI.html#sandbox-environment'> documentation</a>. <br />Once you get the access token, use it to authorize the requests using the  <code>Authorize</code> button below. e.g. if your access token is <code>ACCTOK1</code>, the input for authorization should be <code>Bearer ACCTOK1</code>
 *
 * OpenAPI spec version: 3.0
 * Contact: seller-api-queries@flipkart.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipkart.api.seller.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.flipkart.api.seller.client.model.CreateOrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateTestOrdersRequest
 */
public class CreateTestOrdersRequest {
  @JsonProperty("shipmentType")
  private String shipmentType = null;

  @JsonProperty("locationId")
  private String locationId = null;

  @JsonProperty("orderItems")
  private List<CreateOrderItem> orderItems = null;

  public CreateTestOrdersRequest shipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

  /**
   * Get shipmentType
   * @return shipmentType
   **/
  @ApiModelProperty(value = "")
  public String getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }

  public CreateTestOrdersRequest locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
   **/
  @ApiModelProperty(value = "")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public CreateTestOrdersRequest orderItems(List<CreateOrderItem> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public CreateTestOrdersRequest addOrderItemsItem(CreateOrderItem orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<CreateOrderItem>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
   **/
  @ApiModelProperty(value = "")
  public List<CreateOrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<CreateOrderItem> orderItems) {
    this.orderItems = orderItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTestOrdersRequest createTestOrdersRequest = (CreateTestOrdersRequest) o;
    return Objects.equals(this.shipmentType, createTestOrdersRequest.shipmentType) &&
        Objects.equals(this.locationId, createTestOrdersRequest.locationId) &&
        Objects.equals(this.orderItems, createTestOrdersRequest.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentType, locationId, orderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTestOrdersRequest {\n");

    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

