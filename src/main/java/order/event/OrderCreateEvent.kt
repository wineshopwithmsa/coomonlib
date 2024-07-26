package main.java.order.event

import main.java.order.OrderDto

data class OrderCreateEvent(
    val orderId : Long,
    val wineList : List<OrderDto>,
    val couponId : Long,
    val memberId : Long
)
