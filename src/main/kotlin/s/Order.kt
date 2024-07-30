package org.example.s


data class Order(

    val id: String,
    val total: String,
    val cartTotal: String,
    val tax: String,
    val name: String,
    val address: String,
    val items: List<String>
)


enum class Payment {
    CreditCard,
    CashOnDelivery,
}