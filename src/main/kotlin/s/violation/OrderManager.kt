package org.example.s.violation

import org.example.s.Order
import org.example.s.Payment


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


    fun makePayment(
        payment: Payment,
        total: String,
    ) {
        println("Paying ${total} Method:${payment.name}")
    }

    fun sendNotification(
        userName: String,
    ) {
        println(
            "Order Was Created ${userName} Sad To Serve " +
                    "You From A Class Violates Single Responsibility Principle"
        )
    }
}