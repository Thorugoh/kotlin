import javax.naming.ldap.SortKey

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
    println(Source.Brazil.language)

    println(Source.getLanguage("Argentina"))
    println(Source.Argentina.language)

    println(Source.getLanguage("Guiana"))
    println(Source.Guiana.language)
}