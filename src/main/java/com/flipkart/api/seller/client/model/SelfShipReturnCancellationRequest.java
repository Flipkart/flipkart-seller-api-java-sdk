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
 * SelfShipReturnCancellationRequest
 */

public class SelfShipReturnCancellationRequest {
  @JsonProperty("returnIds")
  private List<String> returnIds = new ArrayList<String>();

  @JsonProperty("locationId")
  private String locationId = null;

  public SelfShipReturnCancellationRequest returnIds(List<String> returnIds) {
    this.returnIds = returnIds;
    return this;
  }

  public SelfShipReturnCancellationRequest addReturnIdsItem(String returnIdsItem) {
    this.returnIds.add(returnIdsItem);
    return this;
  }

   /**
   * Get returnIds
   * @return returnIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getReturnIds() {
    return returnIds;
  }

  public void setReturnIds(List<String> returnIds) {
    this.returnIds = returnIds;
  }

  public SelfShipReturnCancellationRequest locationId(String locationId) {
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
    SelfShipReturnCancellationRequest selfShipReturnCancellationRequest = (SelfShipReturnCancellationRequest) o;
    return Objects.equals(this.returnIds, selfShipReturnCancellationRequest.returnIds) &&
        Objects.equals(this.locationId, selfShipReturnCancellationRequest.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnIds, locationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfShipReturnCancellationRequest {\n");
    
    sb.append("    returnIds: ").append(toIndentedString(returnIds)).append("\n");
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

