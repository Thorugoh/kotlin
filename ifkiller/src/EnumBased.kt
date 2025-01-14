enum class Source(val language: String) {
    Brazil("Portuguese"),
    Argentina("Spanish"),
    Guiana("French");

    companion object {
        fun getLanguage(source: String): String? {
            return entries.find { it.name == source }?.language
        }
    }
}

fun main(){
    println(Source.getLanguage("Brazil"))
    println(Source.getLanguage("Argentina"))
    println(Source.getLanguage("Guiana"))
}