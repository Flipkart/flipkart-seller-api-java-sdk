

# MarketplaceListingDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**listingId** | **String** |  |  |
|**productId** | **String** |  |  |
|**price** | [**Price**](Price.md) |  |  |
|**tax** | [**Tax**](Tax.md) |  |  [optional] |
|**listingStatus** | [**ListingStatusEnum**](#ListingStatusEnum) |  |  |
|**shippingFees** | [**ShippingFees**](ShippingFees.md) |  |  [optional] |
|**fulfillmentProfile** | [**FulfillmentProfileEnum**](#FulfillmentProfileEnum) |  |  |
|**packages** | [**Set&lt;ModelPackage&gt;**](ModelPackage.md) |  |  [optional] |
|**locations** | [**List&lt;Location&gt;**](Location.md) |  |  [optional] |
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



