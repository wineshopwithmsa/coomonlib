package main.java.order.event

import main.java.order.OrderDto

data class CheckStockEvent(
    val orderId : Long,
    val wineList : List<OrderDto>
)
