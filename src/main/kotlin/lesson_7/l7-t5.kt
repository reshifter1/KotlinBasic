package lesson_7

import kotlin.random.Random

fun main() {

    val lowercaseSymbols = ('a'..'z')
    val uppercaseSymbols = ('A'..'Z')
    val numbers = (0..9)
    val allSymbols: List<Any> = lowercaseSymbols + uppercaseSymbols + numbers


    var passwordLength: Int
    do {
        println("Введите длину пароля, не менее 6 символов:")
        passwordLength = readln().toInt()
    } while (passwordLength < 6)

    var password = ""

    while (!numbers.any { it.toString() in password } && !lowercaseSymbols.any { it in password } &&
        !uppercaseSymbols.any { it in password }) {
        password = ""

        for (i in 1..passwordLength) password += allSymbols[Random.nextInt(allSymbols.size)]
    }

    println(password)
}