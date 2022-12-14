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
import com.flipkart.api.seller.client.model.GenerateLabelRequestItemV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GenerateLabelRequestItemV2
 */

public class GenerateLabelRequestItemV2 {
  @JsonProperty("orderItemId")
  private String orderItemId = null;

  @JsonProperty("taxRate")
  private BigDecimal taxRate = null;

  @JsonProperty("invoiceNumber")
  private String invoiceNumber = null;

  @JsonProperty("serialNumbers")
  private List<List<String>> serialNumbers = null;

  @JsonProperty("invoiceDate")
  private String invoiceDate = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("subItems")
  private List<GenerateLabelRequestItemV2> subItems = null;

  public GenerateLabelRequestItemV2 orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public GenerateLabelRequestItemV2 taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * minimum: 0
   * maximum: 100
   * @return taxRate
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public GenerateLabelRequestItemV2 invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public GenerateLabelRequestItemV2 serialNumbers(List<List<String>> serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

  public GenerateLabelRequestItemV2 addSerialNumbersItem(List<String> serialNumbersItem) {
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

  public GenerateLabelRequestItemV2 invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public GenerateLabelRequestItemV2 quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GenerateLabelRequestItemV2 subItems(List<GenerateLabelRequestItemV2> subItems) {
    this.subItems = subItems;
    return this;
  }

  public GenerateLabelRequestItemV2 addSubItemsItem(GenerateLabelRequestItemV2 subItemsItem) {
    if (this.subItems == null) {
      this.subItems = new ArrayList<GenerateLabelRequestItemV2>();
    }
    this.subItems.add(subItemsItem);
    return this;
  }

   /**
   * Get subItems
   * @return subItems
  **/
  @ApiModelProperty(value = "")
  public List<GenerateLabelRequestItemV2> getSubItems() {
    return subItems;
  }

  public void setSubItems(List<GenerateLabelRequestItemV2> subItems) {
    this.subItems = subItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateLabelRequestItemV2 generateLabelRequestItemV2 = (GenerateLabelRequestItemV2) o;
    return Objects.equals(this.orderItemId, generateLabelRequestItemV2.orderItemId) &&
        Objects.equals(this.taxRate, generateLabelRequestItemV2.taxRate) &&
        Objects.equals(this.invoiceNumber, generateLabelRequestItemV2.invoiceNumber) &&
        Objects.equals(this.serialNumbers, generateLabelRequestItemV2.serialNumbers) &&
        Objects.equals(this.invoiceDate, generateLabelRequestItemV2.invoiceDate) &&
        Objects.equals(this.quantity, generateLabelRequestItemV2.quantity) &&
        Objects.equals(this.subItems, generateLabelRequestItemV2.subItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, taxRate, invoiceNumber, serialNumbers, invoiceDate, quantity, subItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateLabelRequestItemV2 {\n");
    
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subItems: ").append(toIndentedString(subItems)).append("\n");
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

