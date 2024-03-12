package lesson_1_10.lesson_4

private const val WET = 20
private const val BAD_SEASON = "зима"
private const val OPEN_TENT_CONDITION = true
private const val SUNNY_WEATHER_CONDITION = true

fun main() {
    val isSunnyWeather = true
    val isOpenTent = true
    val wet = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
        ((isSunnyWeather || !SUNNY_WEATHER_CONDITION) && (isOpenTent || !OPEN_TENT_CONDITION) &&
                (wet == WET) && (season != BAD_SEASON)))
}