package org.example.o


enum class PaymentProvider {
    Vodafone,
    Orange,
    Etisalat,
    Fawry
}

data class PaymentResponse(
    val id: String,
    val amount: String,
    val type: PaymentProvider
)
