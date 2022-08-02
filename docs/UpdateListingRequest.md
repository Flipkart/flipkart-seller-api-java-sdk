

# UpdateListingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productId** | **String** |  |  |
|**price** | [**Price**](Price.md) |  |  |
|**tax** | [**Tax**](Tax.md) |  |  |
|**listingStatus** | [**ListingStatusEnum**](#ListingStatusEnum) |  |  |
|**shippingFees** | [**ShippingFees**](ShippingFees.md) |  |  [optional] |
|**subsidizedShipping** | **Boolean** |  |  [optional] |
|**fulfillmentProfile** | [**FulfillmentProfileEnum**](#FulfillmentProfileEnum) |  |  |
|**fulfillment** | [**Fulfillment**](Fulfillment.md) |  |  [optional] |
|**packages** | [**Set&lt;ModelPackage&gt;**](ModelPackage.md) |  |  |
|**locations** | [**Set&lt;Location&gt;**](Location.md) |  |  |
|**addressLabel** | [**AddressLabel**](AddressLabel.md) |  |  [optional] |
|**datingLabel** | [**DatingLabel**](DatingLabel.md) |  |  [optional] |
|**archivedStatus** | [**ArchivedStatusEnum**](#ArchivedStatusEnum) |  |  [optional] |



## Enum: ListingStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: FulfillmentProfileEnum

| Name | Value |
|---- | -----|
| NON_FBF | &quot;NON_FBF&quot; |
| FBF_LITE | &quot;FBF_LITE&quot; |
| FBF | &quot;FBF&quot; |



## Enum: ArchivedStatusEnum

| Name | Value |
|---- | -----|
| ARCHIVED | &quot;ARCHIVED&quot; |
| NONE | &quot;NONE&quot; |



