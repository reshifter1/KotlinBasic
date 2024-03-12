package lesson_1_10.lesson_6

fun main() {
    println("Придумайте логин:")
    val username = readln()

    println("Придумайте пароль:")
    val password = readln()

    do {
        println("Введите логин:")
        val inputUsername = readln()
        println("Введите пароль:")
        val inputPassword = readln()

    } while ((username != inputUsername) || (password != inputPassword))

    println("Авторизация прошла успешно")
}