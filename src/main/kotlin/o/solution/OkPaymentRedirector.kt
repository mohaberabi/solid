package org.example.o.solution

import org.example.o.PaymentResponse

class OkPaymentRedirector(
    private val strategy: PaymentRedirectStrategy,
) {
    fun getPaymentRedirectUrl(
        response: PaymentResponse
    ): String = strategy.getRedirectUrl(response.type)
}
