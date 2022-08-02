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
import com.flipkart.api.seller.client.model.InvoiceDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * InvoicesSearchResponseV2
 */

public class InvoicesSearchResponseV2 {
  @JsonProperty("invoices")
  private List<InvoiceDetails> invoices = null;

  public InvoicesSearchResponseV2 invoices(List<InvoiceDetails> invoices) {
    this.invoices = invoices;
    return this;
  }

  public InvoicesSearchResponseV2 addInvoicesItem(InvoiceDetails invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<InvoiceDetails>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceDetails> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<InvoiceDetails> invoices) {
    this.invoices = invoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesSearchResponseV2 invoicesSearchResponseV2 = (InvoicesSearchResponseV2) o;
    return Objects.equals(this.invoices, invoicesSearchResponseV2.invoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesSearchResponseV2 {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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

