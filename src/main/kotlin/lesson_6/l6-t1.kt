package lesson_6

fun main() {
    println("Придумайте логин:")
    val username = readln()

    println("Придумайте пароль:")
    val password = readln()

    do {
        println("Введите логин и пароль:")
        val inputUsername = readln()
        val inputPassword = readln()

        if ((username != inputUsername) && (password != inputPassword)) println("Данные неверны")

    } while ((username != inputUsername) && (password != inputPassword))

    println("Авторизация прошла успешно")
}