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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * UpdateShipmentRequest
 */

public class UpdateShipmentRequest {
  @JsonProperty("shipment_id")
  private String shipmentId = null;

  @JsonProperty("tracking_id")
  private String trackingId = null;

  @JsonProperty("seller_id")
  private String sellerId = null;

  @JsonProperty("delivery_partner")
  private String deliveryPartner = null;

  @JsonProperty("tentative_delivery_date")
  private OffsetDateTime tentativeDeliveryDate = null;

  public UpdateShipmentRequest shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(value = "")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public UpdateShipmentRequest trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public UpdateShipmentRequest sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * Get sellerId
   * @return sellerId
  **/
  @ApiModelProperty(value = "")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public UpdateShipmentRequest deliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
    return this;
  }

   /**
   * Get deliveryPartner
   * @return deliveryPartner
  **/
  @ApiModelProperty(value = "")
  public String getDeliveryPartner() {
    return deliveryPartner;
  }

  public void setDeliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
  }

  public UpdateShipmentRequest tentativeDeliveryDate(OffsetDateTime tentativeDeliveryDate) {
    this.tentativeDeliveryDate = tentativeDeliveryDate;
    return this;
  }

   /**
   * Get tentativeDeliveryDate
   * @return tentativeDeliveryDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTentativeDeliveryDate() {
    return tentativeDeliveryDate;
  }

  public void setTentativeDeliveryDate(OffsetDateTime tentativeDeliveryDate) {
    this.tentativeDeliveryDate = tentativeDeliveryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShipmentRequest updateShipmentRequest = (UpdateShipmentRequest) o;
    return Objects.equals(this.shipmentId, updateShipmentRequest.shipmentId) &&
        Objects.equals(this.trackingId, updateShipmentRequest.trackingId) &&
        Objects.equals(this.sellerId, updateShipmentRequest.sellerId) &&
        Objects.equals(this.deliveryPartner, updateShipmentRequest.deliveryPartner) &&
        Objects.equals(this.tentativeDeliveryDate, updateShipmentRequest.tentativeDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, trackingId, sellerId, deliveryPartner, tentativeDeliveryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShipmentRequest {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    deliveryPartner: ").append(toIndentedString(deliveryPartner)).append("\n");
    sb.append("    tentativeDeliveryDate: ").append(toIndentedString(tentativeDeliveryDate)).append("\n");
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
