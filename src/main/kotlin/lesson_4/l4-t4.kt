package lesson_4

const val isEven = 0
const val isOdd = 1

const val HANDS = isOdd
const val LEGS = isEven
const val BACK = isEven
const val PRESS = isOdd
fun main() {
    val dayNumber = 5

    println("""
        Упражнения для рук:    ${dayNumber % 2 == HANDS}
        Упражнения для ног:    ${dayNumber % 2 == LEGS}
        Упражнения для спины:  ${dayNumber % 2 == BACK}
        Упражнения для пресса: ${dayNumber % 2 == PRESS}
    """.trimIndent())
}