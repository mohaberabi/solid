package org.example.s.solution

import org.example.s.Order

class OrderManager {


    fun createOrder(
        order: Order
    ) {
        order.apply {
            println("OrderId :${id}")
            println("Customer :${name}")
            println("Total : ${total}")
            println("Tax : ${tax}")
            println("Items : ${items.joinToString { "," }}")
        }
    }

}