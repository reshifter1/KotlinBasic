package lesson_12

class Weather2 (var dayWeather: Int, var nightWeather: Int, var hasFallout: Boolean) {
    fun printDay() {
        println("$dayWeather, $nightWeather, $hasFallout")
    }
}