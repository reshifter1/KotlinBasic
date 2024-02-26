package lesson_4

const val WET = 20
const val BAD_SEASON = "зима"
const val OPEN_TENT_CONDITION = true
const val SUNNY_WEATHER_CONDITION = true

fun main() {
    val isSunnyWeather = true
    val isOpenTent = true
    val wet = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
        ((isSunnyWeather || !SUNNY_WEATHER_CONDITION) && (isOpenTent || !OPEN_TENT_CONDITION) &&
                (wet == WET) && (season != BAD_SEASON)))
}