package lesson_15

abstract class WeatherStationStats

class Temperature(val value: Double) : WeatherStationStats()

class PrecipitationAmount(val amount: Double) : WeatherStationStats()

class WeatherServer {
    fun sendMessage(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> {
                val temperatureValue = weatherData.value
                println("Отправка температурных данных на сервер: $temperatureValue градусов")
            }
            is PrecipitationAmount -> {
                val precipitationAmountValue = weatherData.amount
                println("Отправка данных о количестве осадков на сервер: $precipitationAmountValue мм")
            }
            else -> {
                println("Неподдерживаемый тип данных")
            }
        }
    }
}

fun main() {
    val temperatureData = Temperature(25.5)
    val precipitationData = PrecipitationAmount(10.2)

    val weatherServer = WeatherServer()

    weatherServer.sendMessage(temperatureData)
    weatherServer.sendMessage(precipitationData)
}
