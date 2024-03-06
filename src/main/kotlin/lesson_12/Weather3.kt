package lesson_12

const val KELVIN_DIFFERENCE: Float = 273.15F

class Weather3 (_dayWeather: Float, _nightWeather: Float, _hasFallout: Boolean) {
    var dayWeather = _dayWeather - KELVIN_DIFFERENCE
    var nightWeather = _nightWeather - KELVIN_DIFFERENCE
    var hasFallout = _hasFallout

    fun print() {
        println("$dayWeather, $nightWeather, $hasFallout")
    }
}