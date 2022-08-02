package com.flipkart.api.seller.client.model;

/*
 * listings-flipkart-v3
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.flipkart.api.seller.client.JSON;


/**
 * AddressLabel
 */
@JsonPropertyOrder({
    AddressLabel.JSON_PROPERTY_MANUFACTURER_DETAILS,
    AddressLabel.JSON_PROPERTY_IMPORTER_DETAILS,
    AddressLabel.JSON_PROPERTY_PACKER_DETAILS,
    AddressLabel.JSON_PROPERTY_COUNTRIES_OF_ORIGIN
})

public class AddressLabel {
  public static final String JSON_PROPERTY_MANUFACTURER_DETAILS = "manufacturer_details";
  private Set<String> manufacturerDetails = null;

  public static final String JSON_PROPERTY_IMPORTER_DETAILS = "importer_details";
  private Set<String> importerDetails = null;

  public static final String JSON_PROPERTY_PACKER_DETAILS = "packer_details";
  private Set<String> packerDetails = null;

  public static final String JSON_PROPERTY_COUNTRIES_OF_ORIGIN = "countries_of_origin";
  private Set<String> countriesOfOrigin = null;

  public AddressLabel() {
  }

  public AddressLabel manufacturerDetails(Set<String> manufacturerDetails) {
    this.manufacturerDetails = manufacturerDetails;
    return this;
  }

  public AddressLabel addManufacturerDetailsItem(String manufacturerDetailsItem) {
    if (this.manufacturerDetails == null) {
      this.manufacturerDetails = new LinkedHashSet<>();
    }
    this.manufacturerDetails.add(manufacturerDetailsItem);
    return this;
  }

  /**
   * Get manufacturerDetails
   * @return manufacturerDetails
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANUFACTURER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getManufacturerDetails() {
    return manufacturerDetails;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MANUFACTURER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturerDetails(Set<String> manufacturerDetails) {
    this.manufacturerDetails = manufacturerDetails;
  }


  public AddressLabel importerDetails(Set<String> importerDetails) {
    this.importerDetails = importerDetails;
    return this;
  }

  public AddressLabel addImporterDetailsItem(String importerDetailsItem) {
    if (this.importerDetails == null) {
      this.importerDetails = new LinkedHashSet<>();
    }
    this.importerDetails.add(importerDetailsItem);
    return this;
  }

  /**
   * Get importerDetails
   * @return importerDetails
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPORTER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getImporterDetails() {
    return importerDetails;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_IMPORTER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImporterDetails(Set<String> importerDetails) {
    this.importerDetails = importerDetails;
  }


  public AddressLabel packerDetails(Set<String> packerDetails) {
    this.packerDetails = packerDetails;
    return this;
  }

  public AddressLabel addPackerDetailsItem(String packerDetailsItem) {
    if (this.packerDetails == null) {
      this.packerDetails = new LinkedHashSet<>();
    }
    this.packerDetails.add(packerDetailsItem);
    return this;
  }

  /**
   * Get packerDetails
   * @return packerDetails
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getPackerDetails() {
    return packerDetails;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PACKER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackerDetails(Set<String> packerDetails) {
    this.packerDetails = packerDetails;
  }


  public AddressLabel countriesOfOrigin(Set<String> countriesOfOrigin) {
    this.countriesOfOrigin = countriesOfOrigin;
    return this;
  }

  public AddressLabel addCountriesOfOriginItem(String countriesOfOriginItem) {
    if (this.countriesOfOrigin == null) {
      this.countriesOfOrigin = new LinkedHashSet<>();
    }
    this.countriesOfOrigin.add(countriesOfOriginItem);
    return this;
  }

  /**
   * Get countriesOfOrigin
   * @return countriesOfOrigin
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRIES_OF_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getCountriesOfOrigin() {
    return countriesOfOrigin;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_COUNTRIES_OF_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountriesOfOrigin(Set<String> countriesOfOrigin) {
    this.countriesOfOrigin = countriesOfOrigin;
  }


  /**
   * Return true if this AddressLabel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressLabel addressLabel = (AddressLabel) o;
    return Objects.equals(this.manufacturerDetails, addressLabel.manufacturerDetails) &&
        Objects.equals(this.importerDetails, addressLabel.importerDetails) &&
        Objects.equals(this.packerDetails, addressLabel.packerDetails) &&
        Objects.equals(this.countriesOfOrigin, addressLabel.countriesOfOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturerDetails, importerDetails, packerDetails, countriesOfOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressLabel {\n");
    sb.append("    manufacturerDetails: ").append(toIndentedString(manufacturerDetails)).append("\n");
    sb.append("    importerDetails: ").append(toIndentedString(importerDetails)).append("\n");
    sb.append("    packerDetails: ").append(toIndentedString(packerDetails)).append("\n");
    sb.append("    countriesOfOrigin: ").append(toIndentedString(countriesOfOrigin)).append("\n");
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


