fun getLanguage(source: String): String? {
    val countries = mapOf(
        "Brazil" to "Portuguese",
        "Argentina" to "Spanish",
        "Guiana" to "French"
    )

    return countries[source]
}

fun main() {
    println(getLanguage("Brazil"))
    println(getLanguage("Argentina"))
    println(getLanguage("Guiana"))
}