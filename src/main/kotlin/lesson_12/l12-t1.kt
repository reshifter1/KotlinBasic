package lesson_12

fun main() {
    val day1 = Weather(32, 12, true)
    val day2 = Weather(31, 22, false)
    day2.hasFallout = true
    println(day2.hasFallout)
}

class Weather (_dayWeather: Int, _nightWeather: Int, _hasFallout: Boolean) {
    var dayWeather = _dayWeather
    var nightWeather = _nightWeather
    var hasFallout = _hasFallout
}
