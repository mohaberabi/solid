package org.example.o.solution

import org.example.o.Product

class OkDiscountMaker(
    private val strategy: DiscountStarategy,
) {
    fun getDiscount(
        product: Product,
    ): Double = strategy.getDiscount(product.price)
}