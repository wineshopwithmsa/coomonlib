package main.java.order.event

data class ApplyCouponEvent(
    val orderId : Long,
    val couponId : Long,
    val memberId : Long
)
