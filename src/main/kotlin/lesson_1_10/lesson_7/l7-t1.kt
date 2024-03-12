package lesson_1_10.lesson_7

private const val PASSWORD_LENGTH = 6

fun main() {
    val lowercaseSymbols = 'a'..'z'
    val numbers = 0..9

    var password = ""

    for (i in 1..PASSWORD_LENGTH) {
        if (i % 2 == 1) password += lowercaseSymbols.random()
        else password += numbers.random()
    }

    println(password)
}