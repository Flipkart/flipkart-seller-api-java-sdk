
# Filter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**states** | [**List&lt;StatesEnum&gt;**](#List&lt;StatesEnum&gt;) |  |  [optional]
**locationId** | **String** |  |  [optional]
**sku** | **List&lt;String&gt;** |  |  [optional]
**orderDate** | [**DateFilter**](DateFilter.md) |  |  [optional]
**dispatchAfterDate** | [**DateFilter**](DateFilter.md) |  |  [optional]
**dispatchByDate** | [**DateFilter**](DateFilter.md) |  |  [optional]
**modifiedDate** | [**DateFilter**](DateFilter.md) |  |  [optional]
**shipmentTypes** | [**List&lt;ShipmentTypesEnum&gt;**](#List&lt;ShipmentTypesEnum&gt;) |  |  [optional]
**serviceProfiles** | [**List&lt;ServiceProfilesEnum&gt;**](#List&lt;ServiceProfilesEnum&gt;) |  |  [optional]
**dispatchServiceTiers** | [**List&lt;DispatchServiceTiersEnum&gt;**](#List&lt;DispatchServiceTiersEnum&gt;) |  |  [optional]
**cancellationDate** | [**DateFilter**](DateFilter.md) |  |  [optional]
**cancellationType** | [**CancellationTypeEnum**](#CancellationTypeEnum) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PREDISPATCH | &quot;preDispatch&quot;
POSTDISPATCH | &quot;postDispatch&quot;
CANCELLED | &quot;cancelled&quot;


<a name="List<StatesEnum>"></a>
## Enum: List&lt;StatesEnum&gt;
Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
PACKING_IN_PROGRESS | &quot;PACKING_IN_PROGRESS&quot;
FORM_FAILED | &quot;FORM_FAILED&quot;
PACKED | &quot;PACKED&quot;
READY_TO_DISPATCH | &quot;READY_TO_DISPATCH&quot;
PICKUP_COMPLETE | &quot;PICKUP_COMPLETE&quot;
CANCELLED | &quot;CANCELLED&quot;
RETURN_REQUESTED | &quot;RETURN_REQUESTED&quot;
RETURNED | &quot;RETURNED&quot;
SHIPPED | &quot;SHIPPED&quot;
DELIVERED | &quot;DELIVERED&quot;
COMPLETED | &quot;COMPLETED&quot;


<a name="List<ShipmentTypesEnum>"></a>
## Enum: List&lt;ShipmentTypesEnum&gt;
Name | Value
---- | -----
EXPRESS | &quot;EXPRESS&quot;
NORMAL | &quot;NORMAL&quot;
SELF | &quot;SELF&quot;


<a name="List<ServiceProfilesEnum>"></a>
## Enum: List&lt;ServiceProfilesEnum&gt;
Name | Value
---- | -----
FBF | &quot;FBF&quot;
NON_FBF | &quot;NON_FBF&quot;
FBF_LITE | &quot;FBF_LITE&quot;


<a name="List<DispatchServiceTiersEnum>"></a>
## Enum: List&lt;DispatchServiceTiersEnum&gt;
Name | Value
---- | -----
EXPRESS | &quot;EXPRESS&quot;
REGULAR | &quot;REGULAR&quot;


<a name="CancellationTypeEnum"></a>
## Enum: CancellationTypeEnum
Name | Value
---- | -----
SELLERCANCELLATION | &quot;sellerCancellation&quot;
BUYERCANCELLATION | &quot;buyerCancellation&quot;
MARKETPLACECANCELLATION | &quot;marketplaceCancellation&quot;



