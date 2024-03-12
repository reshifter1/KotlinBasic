package lesson_14

open class Liner(
    val capacity: Int = 30,
    val speed: Int = 50
) {}

class HeavyShip() : Liner(50, 30) {}

class IceBreaker() : Liner(25, 25) {
    fun crushIce() {
        println("Вжжжжжжж")
    }
}

fun main() {
    val liner = Liner()
    val heavyShip = HeavyShip()
    val iceBreaker = IceBreaker()
}


