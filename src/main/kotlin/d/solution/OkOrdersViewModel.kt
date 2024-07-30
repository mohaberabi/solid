package org.example.d.solution

class OkOrdersViewModel(
    private val orderRepository: OrderRepository
) {


    private var loading: Boolean = false


    fun insertOrderToDatabase(order: String) {
        loading = true
        orderRepository.insertOrder(order)
        loading = false
        println("Order inserted")
    }

}