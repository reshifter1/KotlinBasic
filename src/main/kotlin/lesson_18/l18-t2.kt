package lesson_18

open class Dice(val sides: Int) {
    open fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

class D4 : Dice(4)

class D6 : Dice(6)

class D8 : Dice(8)

fun main() {
    val d4 = D4()
    val d6 = D6()
    val d8 = D8()

    val diceList: List<Dice> = listOf(d4, d6, d8)

    for (dice in diceList) {
        dice.roll()
    }
}
