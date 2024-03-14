package lesson_16

class Dice {
    private val number: Int

    init {
        number = (1..6).random()
    }

    fun getNumber(): Int {
        return number
    }
}

fun main() {
    val dice = Dice()
    val rollResult = dice.getNumber()
    println("Результат броска кубика: $rollResult")
}
