package com.thorugoh

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name: String,
    val acronym: String,
    val symbol: String,
    val countryFlagImageUrl: String,
)

@Serializable
data class CurrencyTypesResult(
    val values: List<CurrencyType>
)

val commonCurrencies = listOf(
    CurrencyType(
        name = "United States Dollar",
        acronym = "USD",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/us.svg"
    ),
    CurrencyType(
        name = "Euro",
        acronym = "EUR",
        symbol = "€",
        countryFlagImageUrl = "https://flagcdn.com/eu.svg"
    ),
    CurrencyType(
        name = "Japanese Yen",
        acronym = "JPY",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/jp.svg"
    ),
    CurrencyType(
        name = "British Pound Sterling",
        acronym = "GBP",
        symbol = "£",
        countryFlagImageUrl = "https://flagcdn.com/gb.svg"
    ),
    CurrencyType(
        name = "Australian Dollar",
        acronym = "AUD",
        symbol = "A$",
        countryFlagImageUrl = "https://flagcdn.com/au.svg"
    ),
    CurrencyType(
        name = "Canadian Dollar",
        acronym = "CAD",
        symbol = "C$",
        countryFlagImageUrl = "https://flagcdn.com/ca.svg"
    ),
    CurrencyType(
        name = "Swiss Franc",
        acronym = "CHF",
        symbol = "CHF",
        countryFlagImageUrl = "https://flagcdn.com/ch.svg"
    ),
    CurrencyType(
        name = "Chinese Yuan",
        acronym = "CNY",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/cn.svg"
    ),
    CurrencyType(
        name = "Brazilian Real",
        acronym = "BRL",
        symbol = "R$",
        countryFlagImageUrl = "https://flagcdn.com/br.svg"
    ),
    CurrencyType(
        name = "Indian Rupee",
        acronym = "INR",
        symbol = "₹",
        countryFlagImageUrl = "https://flagcdn.com/in.svg"
    )
)