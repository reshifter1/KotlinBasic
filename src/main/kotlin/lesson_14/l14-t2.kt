package lesson_14

open class Liner(
    val capacity: Int = 30,
    val speed: Int = 50
) {
    open fun ship() {
        println("Выдвигается горизонтальный трап со шкафута")
    }

    fun printInfo() {
        println("Вместимость: $capacity\nСкорость: $speed")
    }
}

class HeavyShip() : Liner(50, 30) {
    override fun ship() {
        println("Активируется погрузочный кран")
    }
}

class IceBreaker() : Liner(25, 25) {
    fun crushIce() {
        println("Вжжжжжжж")
    }

    override fun ship() {
        println("Открываются ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner()
    val heavyShip = HeavyShip()
    val iceBreaker = IceBreaker()

    iceBreaker.printInfo()
}


