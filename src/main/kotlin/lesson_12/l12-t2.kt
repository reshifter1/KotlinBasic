package lesson_12

fun main() {
    val day1 = Weather2(32, 12, true)
    val day2 = Weather2(31, 22, false)
    day2.hasFallout = true
    day2.printDay()
}

class Weather2 (var dayWeather: Int, var nightWeather: Int, var hasFallout: Boolean) {
    fun printDay() {
        println("$dayWeather, $nightWeather, $hasFallout")
    }
}