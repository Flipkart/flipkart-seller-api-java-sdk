
# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderItemId** | **String** |  |  [optional]
**orderId** | **String** |  |  [optional]
**cancellationGroupId** | **String** |  |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**cancellationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**cancellationReason** | **String** |  |  [optional]
**cancellationSubReason** | **String** |  |  [optional]
**courierReturn** | **Boolean** |  |  [optional]
**quantity** | **Integer** |  |  [optional]
**fsn** | **String** |  |  [optional]
**sku** | **String** |  |  [optional]
**listingId** | **String** |  |  [optional]
**hsn** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**packageIds** | **List&lt;String&gt;** |  |  [optional]
**priceComponents** | [**PriceComponent**](PriceComponent.md) |  |  [optional]
**serviceProfile** | [**ServiceProfileEnum**](#ServiceProfileEnum) |  |  [optional]
**isReplacement** | **Boolean** |  |  [optional]


<a name="PaymentTypeEnum"></a>
## Enum: PaymentTypeEnum
Name | Value
---- | -----
COD | &quot;COD&quot;
PREPAID | &quot;PREPAID&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
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


<a name="ServiceProfileEnum"></a>
## Enum: ServiceProfileEnum
Name | Value
---- | -----
FLIPKART_FULFILMENT | &quot;Flipkart_Fulfilment&quot;
SELLER_FULFILMENT | &quot;Seller_Fulfilment&quot;
SMART_FULFILMENT | &quot;Smart_Fulfilment&quot;
FBF | &quot;FBF&quot;
NON_FBF | &quot;NON_FBF&quot;
FBF_LITE | &quot;FBF_LITE&quot;



