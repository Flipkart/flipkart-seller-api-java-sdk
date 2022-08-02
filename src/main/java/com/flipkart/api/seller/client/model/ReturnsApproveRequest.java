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
import com.flipkart.api.seller.client.model.ReturnApproveRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ReturnsApproveRequest
 */

public class ReturnsApproveRequest {
  @JsonProperty("returns")
  private List<ReturnApproveRequest> returns = new ArrayList<ReturnApproveRequest>();

  @JsonProperty("locationId")
  private String locationId = null;

  public ReturnsApproveRequest returns(List<ReturnApproveRequest> returns) {
    this.returns = returns;
    return this;
  }

  public ReturnsApproveRequest addReturnsItem(ReturnApproveRequest returnsItem) {
    this.returns.add(returnsItem);
    return this;
  }

   /**
   * Get returns
   * @return returns
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ReturnApproveRequest> getReturns() {
    return returns;
  }

  public void setReturns(List<ReturnApproveRequest> returns) {
    this.returns = returns;
  }

  public ReturnsApproveRequest locationId(String locationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsApproveRequest returnsApproveRequest = (ReturnsApproveRequest) o;
    return Objects.equals(this.returns, returnsApproveRequest.returns) &&
        Objects.equals(this.locationId, returnsApproveRequest.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returns, locationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsApproveRequest {\n");
    
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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

