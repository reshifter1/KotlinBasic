package lesson_10

fun passwordGenerate(length: Int): String {
    var password = ""
    val numbers = (0..9)
    val symbols = "!\"#\$%&'()*+,-./"
    for (i in (0..(length - 1))) {
        if ((i % 2) == 0) password += numbers.random()
        else password += symbols.random()
    }
    return password
}

fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()

    println(passwordGenerate(length))
}