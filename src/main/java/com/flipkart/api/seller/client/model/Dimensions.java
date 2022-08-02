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
import java.math.BigDecimal;

/**
 * Dimensions
 */

public class Dimensions {
  @JsonProperty("length")
  private BigDecimal length = null;

  @JsonProperty("breadth")
  private BigDecimal breadth = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("weight")
  private BigDecimal weight = null;

  public Dimensions length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public Dimensions breadth(BigDecimal breadth) {
    this.breadth = breadth;
    return this;
  }

   /**
   * Get breadth
   * @return breadth
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBreadth() {
    return breadth;
  }

  public void setBreadth(BigDecimal breadth) {
    this.breadth = breadth;
  }

  public Dimensions height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Dimensions weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.breadth, dimensions.breadth) &&
        Objects.equals(this.height, dimensions.height) &&
        Objects.equals(this.weight, dimensions.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, breadth, height, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    breadth: ").append(toIndentedString(breadth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

