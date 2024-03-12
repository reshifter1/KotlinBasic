package lesson_1_10.lesson_5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(1, 1001)
    val number2 = Random.nextInt(1, 1001)

    println("Привет! Чтобы подтвердить, что ты не бот, реши простой пример: $number1 + $number2")

    if (readln().toInt() == (number1 + number2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}