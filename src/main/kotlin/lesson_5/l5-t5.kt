package lesson_5

const val LIMIT_OF_RANDOM = 42

const val JACKPOT = 3
const val BIG_WIN = 2
const val SMALL_WIN = 1

fun main() {
    val randomNumber1: Int = (1..LIMIT_OF_RANDOM).random()
    val randomNumber2: Int = (1..LIMIT_OF_RANDOM).random()
    val randomNumber3: Int = (1..LIMIT_OF_RANDOM).random()

    val randomNumbers: Array<Int> = arrayOf(randomNumber1, randomNumber2, randomNumber3)

    println("Введите 3 числа:")
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