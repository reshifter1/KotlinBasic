package lesson_14

open class Liner(
    val capacityCargo: Int = 30,
    val speed: Int = 50,
    val capacityPeople: Int = 50
)

class HeavyShip() : Liner(50, 30, 40) {}

class IceBreaker() : Liner(25, 25, 30) {
    fun crushIce() {
        println("Вжжжжжжж")
    }
}

fun main() {
    val liner = Liner()
    val heavyShip = HeavyShip()
    val iceBreaker = IceBreaker()

    iceBreaker.crushIce()
}


