sealed interface Speaker {
    fun toLanguage(): String
}

data object BrazilSpeaker : Speaker {
    override fun toLanguage() = "Portuguese"
}

data object ArgentinaSpeaker : Speaker {
    override fun toLanguage() = "Spanish"
}

data object GuianaSpeaker : Speaker {
    override fun toLanguage() = "French"
}

fun getLanguage(speaker: Speaker): String = speaker.toLanguage()

fun main() {
    println(getLanguage(BrazilSpeaker))
    println(getLanguage(ArgentinaSpeaker))
    println(getLanguage(GuianaSpeaker))
}
