package lesson_4

const val SAFE_SHIP_CONDITION = true
const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_FOOD_NUMBER = 50
const val WEATHER_CONDITION = false

const val ALT_SAFE_SHIP_CONDITION = false
const val ALT_CREW_NUMBER = 70
const val ALT_FOOD_NUMBER = 50
const val ALT_WEATHER_CONDITION = true

fun main() {
    val isShipDamaged: Boolean = readln().toBoolean()
    val crewNumber: Int = readln().toInt()
    val foodNumber: Int = readln().toInt()
    val isGoodWeather: Boolean = readln().toBoolean()

    println(
        (
                (isShipDamaged || (SAFE_SHIP_CONDITION)) && crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER &&
                        (foodNumber > MIN_FOOD_NUMBER) && (isGoodWeather || (!WEATHER_CONDITION))
                )
                || (
                (isShipDamaged || (ALT_SAFE_SHIP_CONDITION)) && crewNumber == ALT_CREW_NUMBER &&
                        (foodNumber >= ALT_FOOD_NUMBER) && (isGoodWeather || (!ALT_WEATHER_CONDITION))
                )
    )
}