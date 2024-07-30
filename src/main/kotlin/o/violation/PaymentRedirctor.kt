package org.example.o.violation

import org.example.o.PaymentProvider
import org.example.o.PaymentResponse


class PaymentRedirctor {
    fun getPaymentRedirectUrl(
        response: PaymentResponse
    ): String {
        return when (response.type) {
            PaymentProvider.Vodafone -> "https://vodafone.com/"
            PaymentProvider.Orange -> "https://orange.com/"
            PaymentProvider.Etisalat -> "https://etisalat.com/"
            PaymentProvider.Fawry -> "https://fawry.com/"
        }
    }
}