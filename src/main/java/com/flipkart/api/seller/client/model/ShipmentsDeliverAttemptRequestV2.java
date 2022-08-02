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


package com.flipkart.api.seller.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.flipkart.api.seller.client.model.DeliverRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ShipmentsDeliverAttemptRequestV2
 */

public class ShipmentsDeliverAttemptRequestV2 {
  @JsonProperty("shipments")
  private List<DeliverRequest> shipments = new ArrayList<DeliverRequest>();

  public ShipmentsDeliverAttemptRequestV2 shipments(List<DeliverRequest> shipments) {
    this.shipments = shipments;
    return this;
  }

  public ShipmentsDeliverAttemptRequestV2 addShipmentsItem(DeliverRequest shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @ApiModelProperty(required = true, value = "")
  public List<DeliverRequest> getShipments() {
    return shipments;
  }

  public void setShipments(List<DeliverRequest> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentsDeliverAttemptRequestV2 shipmentsDeliverAttemptRequestV2 = (ShipmentsDeliverAttemptRequestV2) o;
    return Objects.equals(this.shipments, shipmentsDeliverAttemptRequestV2.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentsDeliverAttemptRequestV2 {\n");
    
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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

