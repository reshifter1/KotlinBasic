package lesson_21

fun String.vowelCount(): Int {
    val vowel = "уеыаоэяиюeyuioa"
    var counter = 0
    for (letter in this.lowercase()) {
        if (letter in vowel) counter += 1
    }
    return counter
}

fun main() {
    println("hello".vowelCount())
}