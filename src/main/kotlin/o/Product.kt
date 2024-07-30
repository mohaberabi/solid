package org.example.o


enum class ProductType {
    HealthCare,
    Electronics,
    Food
}

data class Product(
    val id: String,
    val type: ProductType,
    val price: Double,
)