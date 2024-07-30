package org.example.o.violation

import org.example.o.Product
import org.example.o.ProductType

class DiscountMaker {
    fun getDiscount(product: Product): Double {
        return when (product.type) {
            ProductType.HealthCare -> product.price * 0.9
            ProductType.Electronics -> product.price * 0.2
            ProductType.Food -> product.price * 0.3
        }
    }
    
}