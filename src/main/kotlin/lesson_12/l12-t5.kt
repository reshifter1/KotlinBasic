package lesson_12

fun main() {
    val weatherList = mutableListOf<Weather5>()

    for (i in (1..30)) {
        weatherList.add(
            Weather5(
                (290..330).random() * 1F, (120..250).random() * 1F,
                (0..1).random() == 1
            )
        )
    }

    val dayWeatherList = mutableListOf<Float>()
    val nightWeatherList = mutableListOf<Float>()
    val daysWithFallout = mutableListOf<Weather5>()

    for (day in weatherList) {
        if (day.hasFallout) daysWithFallout.add(day)
        dayWeatherList.add(day.dayWeather)
        nightWeatherList.add(day.nightWeather)
    }

    println(
        """
        Средняя температура днём: %.2f
        Средняя температура ночью: %.2f
        Количество дней с осадками: %d
    """.trimIndent().format(
            dayWeatherList.average(),
            nightWeatherList.average(),
            daysWithFallout.count()
        )
    )
}