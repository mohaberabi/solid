package org.example.d.solution

interface OrderRepository {


    fun insertOrder(order: String)
}


class DefaultOrderRepository : OrderRepository {
    override fun insertOrder(order: String) {
        println(order)
    }
}