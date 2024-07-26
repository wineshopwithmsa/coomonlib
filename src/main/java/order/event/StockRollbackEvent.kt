package main.java.order.event

import main.java.order.OrderDto

data class StockRollbackEvent(
    val wineList : List<OrderDto>
)
