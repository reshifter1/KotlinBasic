package lesson_12

const val KELVIN_DIFFERENCE: Float = 273.15F

class Weather4 (_dayWeather: Float, _nightWeather: Float, _hasFallout: Boolean) {
    var dayWeather = _dayWeather - KELVIN_DIFFERENCE
    var nightWeather = _nightWeather - KELVIN_DIFFERENCE
    var hasFallout = _hasFallout

    fun print() {
        println("$dayWeather, $nightWeather, $hasFallout")
    }

    init {
        print()
    }
}

fun main() {
    val day1 = Weather4(320F, 120F, true)
    val day2 = Weather4(310F, 220F, false)

    day2.print()
}