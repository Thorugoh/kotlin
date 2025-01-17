package com.thorugoh.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRateResult(
    val from: String,
    val to: String,
    @SerialName("exchange_rate")
    val exchangeRate: Double,
)

val exchangeRates: Map<String, Map<String, Double>> = mapOf(
    "USD" to mapOf( // Dólar Americano
        "EUR" to 0.91,  // Euro
        "JPY" to 113.56, // Iene Japonês
        "GBP" to 0.78,  // Libra Esterlina
        "CNY" to 6.47,  // Yuan Chinês
        "BRL" to 5.08   // Real Brasileiro
    ),
    "EUR" to mapOf( // Euro
        "USD" to 1.10,  // Dólar Americano
        "JPY" to 124.56, // Iene Japonês
        "GBP" to 0.85,  // Libra Esterlina
        "CNY" to 7.12,  // Yuan Chinês
        "BRL" to 5.60   // Real Brasileiro
    ),
    "JPY" to mapOf( // Iene Japonês
        "USD" to 0.0088, // Dólar Americano
        "EUR" to 0.0080, // Euro
        "GBP" to 0.0068, // Libra Esterlina
        "CNY" to 0.057,  // Yuan Chinês
        "BRL" to 0.044   // Real Brasileiro
    ),
    "GBP" to mapOf( // Libra Esterlina
        "USD" to 1.28,  // Dólar Americano
        "EUR" to 1.17,  // Euro
        "JPY" to 146.72, // Iene Japonês
        "CNY" to 8.34,  // Yuan Chinês
        "BRL" to 6.45   // Real Brasileiro
    ),
    "CNY" to mapOf( // Yuan Chinês
        "USD" to 0.15,  // Dólar Americano
        "EUR" to 0.14,  // Euro
        "JPY" to 17.56,  // Iene Japonês
        "GBP" to 0.12,  // Libra Esterlina
        "BRL" to 0.77   // Real Brasileiro
    ),
    "BRL" to mapOf( // Real Brasileiro
        "USD" to 0.20,  // Dólar Americano
        "EUR" to 0.18,  // Euro
        "JPY" to 22.56, // Iene Japonês
        "GBP" to 0.16,  // Libra Esterlina
        "CNY" to 1.30   // Yuan Chinês
    )
)
