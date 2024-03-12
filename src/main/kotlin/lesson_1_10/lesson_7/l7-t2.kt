package lesson_1_10.lesson_7

fun main() {
    var code = "0000"
    var input = ""
    while (code != input) {
        code = (1000..9999).random().toString()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        input = readln()
    }
    println("Привет!!!")
}