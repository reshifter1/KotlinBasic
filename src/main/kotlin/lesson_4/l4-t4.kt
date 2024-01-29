package lesson_4

const val HANDS = 1
const val LEGS = 0
const val BACK = 0
const val PRESS = 1
fun main() {
    val dayNumber = 5

    println("""
        Упражнения для рук:    ${dayNumber % 2 == HANDS}
        Упражнения для ног:    ${dayNumber % 2 == LEGS}
        Упражнения для спины:  ${dayNumber % 2 == BACK}
        Упражнения для пресса: ${dayNumber % 2 == PRESS}
    """.trimIndent())
}