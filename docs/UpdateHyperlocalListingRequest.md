

# UpdateHyperlocalListingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productId** | **String** |  |  |
|**price** | [**Price**](Price.md) |  |  |
|**tax** | [**Tax**](Tax.md) |  |  |
|**listingStatus** | [**ListingStatusEnum**](#ListingStatusEnum) |  |  |
|**_package** | [**ModelPackage**](ModelPackage.md) |  |  [optional] |
|**location** | [**Location**](Location.md) |  |  |
|**addressLabel** | [**AddressLabel**](AddressLabel.md) |  |  [optional] |
|**datingLabel** | [**DatingLabel**](DatingLabel.md) |  |  [optional] |
|**archivedStatus** | [**ArchivedStatusEnum**](#ArchivedStatusEnum) |  |  [optional] |



## Enum: ListingStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: ArchivedStatusEnum

| Name | Value |
|---- | -----|
| ARCHIVED | &quot;ARCHIVED&quot; |
| NONE | &quot;NONE&quot; |



