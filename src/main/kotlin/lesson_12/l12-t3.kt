package lesson_12

const private val KELVIN_DIFFERENCE: Float = 273.15F

class Weather3 (_dayWeather: Float, _nightWeather: Float, _hasFallout: Boolean) {
    var dayWeather = _dayWeather - KELVIN_DIFFERENCE
    var nightWeather = _nightWeather - KELVIN_DIFFERENCE
    var hasFallout = _hasFallout

    fun print() {
        println("$dayWeather, $nightWeather, $hasFallout")
    }
}

fun main() {
    val day1 = Weather3(320F, 120F, true)
    val day2 = Weather3(310F, 220F, false)

    day2.print()
}