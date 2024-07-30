package org.example.o.solution

import org.example.o.PaymentProvider

interface PaymentRedirectStrategy {
    fun getRedirectUrl(provider: PaymentProvider): String
}


class FawryPaymentRedirect : PaymentRedirectStrategy {
    override fun getRedirectUrl(provider: PaymentProvider): String = "fawry.com"
}

class EtisalatPaymentRedirect : PaymentRedirectStrategy {
    override fun getRedirectUrl(provider: PaymentProvider): String = "etisalat.com"
}

class VodafonePaymentRedirect : PaymentRedirectStrategy {
    override fun getRedirectUrl(provider: PaymentProvider): String = "vodafone.com"
}

class OrangePaymentRedirect : PaymentRedirectStrategy {
    override fun getRedirectUrl(provider: PaymentProvider): String = "orange.com"
}