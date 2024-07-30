package org.example.s.solution

import org.example.s.Payment


class PaymentManager {
    fun makePayment(
        payment: Payment,
        total: String,
    ) {
        println("Paying ${total} Method:${payment.name}")
    }
}