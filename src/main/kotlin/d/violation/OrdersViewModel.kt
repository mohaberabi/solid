package org.example.d.violation

class OrdersViewModel(
    private val db: OrdersDatabase,
) {


    private var loading: Boolean = false


    fun inserOrderToDatabase(order: String) {
        loading = true
        db.insert(order)
        loading = false
        println("Oder Insrted")
    }

}