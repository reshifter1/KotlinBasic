package lesson_5

import kotlin.random.Random

const val LIMIT_OF_RANDOM = 42
const val START_FROM_1 = 1

fun main() {
    val randomNumber1 = START_FROM_1 + Random.nextInt(LIMIT_OF_RANDOM)
    val randomNumber2 = START_FROM_1 + Random.nextInt(LIMIT_OF_RANDOM)
    val randomNumbers = arrayOf(randomNumber1, randomNumber2)

    val inputNumber1 = readln().toInt()
    val inputNumber2 = readln().toInt()

    if ((randomNumber1 == inputNumber1) && (randomNumber2 == inputNumber2) ||
        (randomNumber2 == inputNumber1) && (randomNumber1 == inputNumber2))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (inputNumber1 in randomNumbers || inputNumber2 in randomNumbers)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Числа для победы: " + randomNumber1 + " " + randomNumber2)
}