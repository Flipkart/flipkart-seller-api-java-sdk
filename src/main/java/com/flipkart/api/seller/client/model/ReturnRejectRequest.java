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
 * ReturnRejectRequest
 */

public class ReturnRejectRequest {
  @JsonProperty("returnId")
  private String returnId = null;

  @JsonProperty("serviceFulfilmentId")
  private String serviceFulfilmentId = null;

  @JsonProperty("serviceDate")
  private OffsetDateTime serviceDate = null;

  @JsonProperty("comments")
  private String comments = null;

  public ReturnRejectRequest returnId(String returnId) {
    this.returnId = returnId;
    return this;
  }

   /**
   * Get returnId
   * @return returnId
  **/
  @ApiModelProperty(value = "")
  public String getReturnId() {
    return returnId;
  }

  public void setReturnId(String returnId) {
    this.returnId = returnId;
  }

  public ReturnRejectRequest serviceFulfilmentId(String serviceFulfilmentId) {
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

  public ReturnRejectRequest serviceDate(OffsetDateTime serviceDate) {
    this.serviceDate = serviceDate;
    return this;
  }

   /**
   * Get serviceDate
   * @return serviceDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getServiceDate() {
    return serviceDate;
  }

  public void setServiceDate(OffsetDateTime serviceDate) {
    this.serviceDate = serviceDate;
  }

  public ReturnRejectRequest comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnRejectRequest returnRejectRequest = (ReturnRejectRequest) o;
    return Objects.equals(this.returnId, returnRejectRequest.returnId) &&
        Objects.equals(this.serviceFulfilmentId, returnRejectRequest.serviceFulfilmentId) &&
        Objects.equals(this.serviceDate, returnRejectRequest.serviceDate) &&
        Objects.equals(this.comments, returnRejectRequest.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnId, serviceFulfilmentId, serviceDate, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRejectRequest {\n");
    
    sb.append("    returnId: ").append(toIndentedString(returnId)).append("\n");
    sb.append("    serviceFulfilmentId: ").append(toIndentedString(serviceFulfilmentId)).append("\n");
    sb.append("    serviceDate: ").append(toIndentedString(serviceDate)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
