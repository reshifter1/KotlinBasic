package lesson_7

fun main() {
    while (true) {
        val code = (1000..9999).random().toString()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        if (readln() == code) break
    }
    println("Привет!!!")
}