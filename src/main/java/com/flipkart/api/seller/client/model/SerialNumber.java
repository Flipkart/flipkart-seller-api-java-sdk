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
import java.util.ArrayList;
import java.util.List;

/**
 * SerialNumber
 */

public class SerialNumber {
  @JsonProperty("orderItemId")
  private String orderItemId = null;

  @JsonProperty("serialNumbers")
  private List<List<String>> serialNumbers = null;

  public SerialNumber orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  @ApiModelProperty(value = "")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public SerialNumber serialNumbers(List<List<String>> serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

  public SerialNumber addSerialNumbersItem(List<String> serialNumbersItem) {
    if (this.serialNumbers == null) {
      this.serialNumbers = new ArrayList<List<String>>();
    }
    this.serialNumbers.add(serialNumbersItem);
    return this;
  }

   /**
   * Get serialNumbers
   * @return serialNumbers
  **/
  @ApiModelProperty(value = "")
  public List<List<String>> getSerialNumbers() {
    return serialNumbers;
  }

  public void setSerialNumbers(List<List<String>> serialNumbers) {
    this.serialNumbers = serialNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerialNumber serialNumber = (SerialNumber) o;
    return Objects.equals(this.orderItemId, serialNumber.orderItemId) &&
        Objects.equals(this.serialNumbers, serialNumber.serialNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, serialNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SerialNumber {\n");
    
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
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

