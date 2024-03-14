package lesson_12

fun main() {
    val day1 = Weather().apply {
        dayWeather = 32
        nightWeather = 12
        hasFallout = true
    }
    val day2 = Weather().apply {
        dayWeather = 31
        nightWeather = 22
        hasFallout = false
    }
    day2.hasFallout = true

    day2.printFallout()
}

class Weather {
    var dayWeather: Int = 0
    var nightWeather: Int = 0
    var hasFallout: Boolean = false

    fun printFallout() {
        println("hasFallout: $hasFallout")
    }
}