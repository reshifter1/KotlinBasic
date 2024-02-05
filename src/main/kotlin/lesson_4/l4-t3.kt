package lesson_4

const val WET = 20
const val BAD_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isOpenTent = true
    val wet = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
        (isSunnyWeather && isOpenTent && (wet == WET) && (season != BAD_SEASON)))
}