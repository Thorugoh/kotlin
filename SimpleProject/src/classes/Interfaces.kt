package classes

data class Document(val text: String)
interface Printer {
    fun print(text: String): Document
    val printerType: String
}

interface TextConverter {
    val defaultText: String
        get() = "Unknown"
    fun convert(text: String, printerType: String): String {
        return text.ifEmpty { defaultText }
    }
}

class PdfPrinter: Printer, TextConverter {
    override fun print(text: String): Document {
        convert(text = text, printerType = printerType)
        println("PDF: $text")
        return Document(text = text)
    }

    override val printerType: String
        get() = "PDF"

    override fun convert(text: String, printerType: String): String {
        println("Converting text '$text' to type $printerType")
        return text
    }
}

class WordPrinter: Printer, TextConverter {
    override fun print(text: String): Document {
        convert(text = text, printerType = printerType)
        println("Word: $text")
        return Document(text = text)
    }

    override val printerType: String
        get() = "Word"

    override fun convert(text: String, printerType: String): String {
        println("Converting text '$text' to type $printerType")
        return text
    }

}

fun main() {
    val pdfPrinter = PdfPrinter()
    val pdfDocument = pdfPrinter.print("Hello Kotlin from PDf")

    println(pdfDocument)

    val wordPrinter = WordPrinter()

    val wordDocument = wordPrinter.print("Hello Kotlin from Word")

    println(wordDocument)
}