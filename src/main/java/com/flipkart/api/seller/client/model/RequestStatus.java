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

/**
 * RequestStatus
 */

public class RequestStatus {
  @JsonProperty("serviceFulfilmentId")
  private String serviceFulfilmentId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("failureReason")
  private String failureReason = null;

  public RequestStatus serviceFulfilmentId(String serviceFulfilmentId) {
    this.serviceFulfilmentId = serviceFulfilmentId;
    return this;
  }

   /**
   * Get serviceFulfilmentId
   * @return serviceFulfilmentId
  **/
  @ApiModelProperty(value = "")
  public String getServiceFulfilmentId() {
    return serviceFulfilmentId;
  }

  public void setServiceFulfilmentId(String serviceFulfilmentId) {
    this.serviceFulfilmentId = serviceFulfilmentId;
  }

  public RequestStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RequestStatus failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestStatus requestStatus = (RequestStatus) o;
    return Objects.equals(this.serviceFulfilmentId, requestStatus.serviceFulfilmentId) &&
        Objects.equals(this.status, requestStatus.status) &&
        Objects.equals(this.failureReason, requestStatus.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFulfilmentId, status, failureReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestStatus {\n");
    
    sb.append("    serviceFulfilmentId: ").append(toIndentedString(serviceFulfilmentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
