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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.flipkart.api.seller.client.JSON;


/**
 * Location
 */
@JsonPropertyOrder({
    Location.JSON_PROPERTY_ID,
    Location.JSON_PROPERTY_STATUS,
    Location.JSON_PROPERTY_INVENTORY,
    Location.JSON_PROPERTY_PENDING_INVENTORY
})

public class Location {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ENABLED("ENABLED"),

    DISABLED("DISABLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_INVENTORY = "inventory";
  private Integer inventory;

  public static final String JSON_PROPERTY_PENDING_INVENTORY = "pending_inventory";
  private Integer pendingInventory;

  public Location() {
  }

  public Location id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public Location status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Location inventory(Integer inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   * @return inventory
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVENTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInventory() {
    return inventory;
  }


  @JsonProperty(JSON_PROPERTY_INVENTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }


  public Location pendingInventory(Integer pendingInventory) {
    this.pendingInventory = pendingInventory;
    return this;
  }

  /**
   * Get pendingInventory
   * @return pendingInventory
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PENDING_INVENTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPendingInventory() {
    return pendingInventory;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_INVENTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPendingInventory(Integer pendingInventory) {
    this.pendingInventory = pendingInventory;
  }


  /**
   * Return true if this Location object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.status, location.status) &&
        Objects.equals(this.inventory, location.inventory) &&
        Objects.equals(this.pendingInventory, location.pendingInventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, inventory, pendingInventory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    pendingInventory: ").append(toIndentedString(pendingInventory)).append("\n");
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

