package lesson_6

fun main() {
    val guessedNumber = (1..9).random()
    var attemptsNum = 5

    println("Отгадай число от 1 до 9")
    println("*ветер нашёптывает тебе число $guessedNumber*")

    while (attemptsNum > 0) {
        if (readln().toInt() == guessedNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно! Попробуй ещё. Осталось попыток: ${--attemptsNum}")
        }
    }

    println("Ужасная игра")

}