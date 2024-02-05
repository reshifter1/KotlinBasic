package lesson_5

import kotlin.random.Random

const val LIMIT_OF_RANDOM = 42
const val START_FROM_1 = 1

const val JACKPOT = 3
const val BIG_WIN = 2
const val SMALL_WIN = 1

fun main() {
    val randomNumber1: Int = START_FROM_1 + Random.nextInt(LIMIT_OF_RANDOM)
    val randomNumber2: Int = START_FROM_1 + Random.nextInt(LIMIT_OF_RANDOM)
    val randomNumber3: Int = START_FROM_1 + Random.nextInt(LIMIT_OF_RANDOM)

    val randomNumbers: Array<Int> = arrayOf(randomNumber1, randomNumber2, randomNumber3)

    val inputNumbers: Array<Int> = arrayOf(readln().toInt(), readln().toInt(), readln().toInt())

    val inersectedArrayCount = inputNumbers.intersect(randomNumbers.toSet()).count()

    println(
        when(inersectedArrayCount) {
            JACKPOT -> "ДЖЕКПОТ!!!"
            BIG_WIN -> "Крупный выигрыш!"
            SMALL_WIN -> "Утешительный приз."
            else -> "Проигрыш..."
        }
    )

    println("Победные числа: " + randomNumber1 + " " + randomNumber2 + " " + randomNumber3)
}