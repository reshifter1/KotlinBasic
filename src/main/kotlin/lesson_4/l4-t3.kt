package lesson_4

const val WET = 20
const val BAD_SEASON = "зима"

fun main() {
    val weather = true
    val tent = true
    val wet = 20
    val season = "зима"

    println(weather && tent && (wet == WET) && (season != BAD_SEASON))
}