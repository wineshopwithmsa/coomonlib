package main.java.order.event

import main.java.order.OrderDto

data class OrderCreateEvent(
    val orderId : Long,
    val wineOrderList : List<OrderDto>,
    val couponId : Long,
    val memberId : Long
)
