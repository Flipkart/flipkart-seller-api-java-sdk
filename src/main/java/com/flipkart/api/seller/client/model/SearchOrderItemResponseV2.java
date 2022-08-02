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
import com.flipkart.api.seller.client.model.OrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchOrderItemResponseV2
 */

public class SearchOrderItemResponseV2 {
  @JsonProperty("hasMore")
  private Boolean hasMore = null;

  @JsonProperty("orderItems")
  private List<OrderItem> orderItems = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("nextPageUrl")
  private String nextPageUrl = null;

  @JsonProperty("previousPageUrl")
  private String previousPageUrl = null;

  public SearchOrderItemResponseV2 hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public SearchOrderItemResponseV2 orderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public SearchOrderItemResponseV2 addOrderItemsItem(OrderItem orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<OrderItem>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @ApiModelProperty(value = "")
  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public SearchOrderItemResponseV2 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SearchOrderItemResponseV2 nextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @ApiModelProperty(value = "")
  public String getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public SearchOrderItemResponseV2 previousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
    return this;
  }

   /**
   * Get previousPageUrl
   * @return previousPageUrl
  **/
  @ApiModelProperty(value = "")
  public String getPreviousPageUrl() {
    return previousPageUrl;
  }

  public void setPreviousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOrderItemResponseV2 searchOrderItemResponseV2 = (SearchOrderItemResponseV2) o;
    return Objects.equals(this.hasMore, searchOrderItemResponseV2.hasMore) &&
        Objects.equals(this.orderItems, searchOrderItemResponseV2.orderItems) &&
        Objects.equals(this.url, searchOrderItemResponseV2.url) &&
        Objects.equals(this.nextPageUrl, searchOrderItemResponseV2.nextPageUrl) &&
        Objects.equals(this.previousPageUrl, searchOrderItemResponseV2.previousPageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, orderItems, url, nextPageUrl, previousPageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrderItemResponseV2 {\n");
    
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    previousPageUrl: ").append(toIndentedString(previousPageUrl)).append("\n");
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

