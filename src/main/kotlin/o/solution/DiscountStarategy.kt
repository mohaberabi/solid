package org.example.o.solution


interface DiscountStarategy {
    fun getDiscount(
        price: Double,
    ): Double
}


class EelectronicsDiscountStrategy(
    private val percentage: Double = 0.1,
) : DiscountStarategy {
    override fun getDiscount(price: Double): Double = price * percentage

}

class HealthCareDiscountStartegy : DiscountStarategy {
    override fun getDiscount(price: Double): Double = price * 0.9
}

class FoodDiscountStrategy : DiscountStarategy {
    override fun getDiscount(price: Double): Double = price * 0.25
}