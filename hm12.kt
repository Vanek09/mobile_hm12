fun main() {
    val string = readln()
    val words = string.split("\\s+".toRegex())
    println(numberOfWords(words))
    println(numberOfNumerics(words))
    println(stringOnlyWithLetters(string))
    println(replaceMultiplySpaces(string))
    println(deleteWordsThatStartWithLowerCase(words))
}

fun numberOfWords(words: List<String>) = words.filter { symbol -> symbol.any { it.isLetter() } }.size

fun numberOfNumerics(words: List<String>) = words.filter { symbol -> symbol.all { it.isDigit() } }.size

fun stringOnlyWithLetters(string: String) = string.filter { it.isLetter() }

fun replaceMultiplySpaces(string: String) = string.replace("\\s+".toRegex(), " ")

fun deleteWordsThatStartWithLowerCase(words: List<String>) =
    words.filter { it.first().isUpperCase() }.joinToString(" ")
