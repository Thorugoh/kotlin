enum class Country {
    Brazil, Argentina, Guiana
}

fun getLanguage(source: Country): String {
    return when (source) {
        Country.Brazil -> "Portuguese"
        Country.Guiana -> "French"
        Country.Argentina -> "Spanish"
    }
}

fun main(){
    println(getLanguage(Country.Brazil))
    println(getLanguage(Country.Guiana))
    println(getLanguage(Country.Argentina))
}