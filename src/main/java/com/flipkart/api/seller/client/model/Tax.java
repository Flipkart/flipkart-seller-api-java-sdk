package com.flipkart.api.seller.client.model;

/*
 * listings-common-v3
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.flipkart.api.seller.client.JSON;


/**
 * Tax
 */
@JsonPropertyOrder({
    Tax.JSON_PROPERTY_HSN,
    Tax.JSON_PROPERTY_IS_GST_SELLABLE,
    Tax.JSON_PROPERTY_GOODS_SERVICES_RATE,
    Tax.JSON_PROPERTY_TAX_CODE,
    Tax.JSON_PROPERTY_LUXURY_CESS_PERCENTAGE
})

public class Tax {
  public static final String JSON_PROPERTY_HSN = "hsn";
  private String hsn;

  public static final String JSON_PROPERTY_IS_GST_SELLABLE = "is_gst_sellable";
  private Boolean isGstSellable;

  public static final String JSON_PROPERTY_GOODS_SERVICES_RATE = "goods_services_rate";
  private BigDecimal goodsServicesRate;

  public static final String JSON_PROPERTY_TAX_CODE = "tax_code";
  private String taxCode;

  public static final String JSON_PROPERTY_LUXURY_CESS_PERCENTAGE = "luxury_cess_percentage";
  private BigDecimal luxuryCessPercentage;

  public Tax() {
  }

  public Tax hsn(String hsn) {
    this.hsn = hsn;
    return this;
  }

  /**
   * Get hsn
   * @return hsn
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HSN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHsn() {
    return hsn;
  }


  @JsonProperty(JSON_PROPERTY_HSN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHsn(String hsn) {
    this.hsn = hsn;
  }


  public Tax isGstSellable(Boolean isGstSellable) {
    this.isGstSellable = isGstSellable;
    return this;
  }

  /**
   * Get isGstSellable
   * @return isGstSellable
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_GST_SELLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsGstSellable() {
    return isGstSellable;
  }


  @JsonProperty(JSON_PROPERTY_IS_GST_SELLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGstSellable(Boolean isGstSellable) {
    this.isGstSellable = isGstSellable;
  }


  public Tax goodsServicesRate(BigDecimal goodsServicesRate) {
    this.goodsServicesRate = goodsServicesRate;
    return this;
  }

  /**
   * Get goodsServicesRate
   * minimum: 0
   * maximum: 28
   * @return goodsServicesRate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOODS_SERVICES_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGoodsServicesRate() {
    return goodsServicesRate;
  }


  @JsonProperty(JSON_PROPERTY_GOODS_SERVICES_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoodsServicesRate(BigDecimal goodsServicesRate) {
    this.goodsServicesRate = goodsServicesRate;
  }


  public Tax taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

  /**
   * Get taxCode
   * @return taxCode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxCode() {
    return taxCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  public Tax luxuryCessPercentage(BigDecimal luxuryCessPercentage) {
    this.luxuryCessPercentage = luxuryCessPercentage;
    return this;
  }

  /**
   * Get luxuryCessPercentage
   * minimum: 0
   * maximum: 100
   * @return luxuryCessPercentage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LUXURY_CESS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLuxuryCessPercentage() {
    return luxuryCessPercentage;
  }


  @JsonProperty(JSON_PROPERTY_LUXURY_CESS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLuxuryCessPercentage(BigDecimal luxuryCessPercentage) {
    this.luxuryCessPercentage = luxuryCessPercentage;
  }


  /**
   * Return true if this Tax object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.hsn, tax.hsn) &&
        Objects.equals(this.isGstSellable, tax.isGstSellable) &&
        Objects.equals(this.goodsServicesRate, tax.goodsServicesRate) &&
        Objects.equals(this.taxCode, tax.taxCode) &&
        Objects.equals(this.luxuryCessPercentage, tax.luxuryCessPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hsn, isGstSellable, goodsServicesRate, taxCode, luxuryCessPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    sb.append("    hsn: ").append(toIndentedString(hsn)).append("\n");
    sb.append("    isGstSellable: ").append(toIndentedString(isGstSellable)).append("\n");
    sb.append("    goodsServicesRate: ").append(toIndentedString(goodsServicesRate)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    luxuryCessPercentage: ").append(toIndentedString(luxuryCessPercentage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

