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
import com.flipkart.api.seller.client.model.Dimensions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SubShipments
 */

public class SubShipments {
  @JsonProperty("subShipmentId")
  private String subShipmentId = null;

  @JsonProperty("dimensions")
  private Dimensions dimensions = null;

  public SubShipments subShipmentId(String subShipmentId) {
    this.subShipmentId = subShipmentId;
    return this;
  }

   /**
   * Get subShipmentId
   * @return subShipmentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubShipmentId() {
    return subShipmentId;
  }

  public void setSubShipmentId(String subShipmentId) {
    this.subShipmentId = subShipmentId;
  }

  public SubShipments dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubShipments subShipments = (SubShipments) o;
    return Objects.equals(this.subShipmentId, subShipments.subShipmentId) &&
        Objects.equals(this.dimensions, subShipments.dimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subShipmentId, dimensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubShipments {\n");
    
    sb.append("    subShipmentId: ").append(toIndentedString(subShipmentId)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

