package lesson_4

const val SAFE_SHIP_CONDITION = true
const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_FOOD_NUMBER = 50
const val WEATHER_CONDITION = false

fun main() {
    println("Введите данные:")
    val isShipDamaged: Boolean = readln().toBoolean()
    val crewNumber: Int = readln().toInt()
    val foodNumber: Int = readln().toInt()
    val isGoodWeather: Boolean = readln().toBoolean()

    println("Корабль может приступить к долгосрочному плаванию: " +
            (
                    (
                        (isShipDamaged == SAFE_SHIP_CONDITION) && crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER
                                && (foodNumber > MIN_FOOD_NUMBER) && (isGoodWeather || !WEATHER_CONDITION)
                    )
                    || (
                        (isShipDamaged == !SAFE_SHIP_CONDITION) && crewNumber == MAX_CREW_NUMBER
                                && (foodNumber >= MIN_FOOD_NUMBER)
                    )
            )
    )
}