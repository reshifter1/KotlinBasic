package lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Int
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Планета с приколами",
        dateTime = LocalDateTime.of(2024, 3, 18, 10, 30),
        distanceFromEarth = 5
    )

    println("Название места или собатия: ${alphaCentauri.name}")
    println("Описание места или события: ${alphaCentauri.description}")
    println("Дата и время события: ${alphaCentauri.dateTime}")
    println("Расстояние места или события от Земли в световых годах: ${alphaCentauri.distanceFromEarth}")
}
