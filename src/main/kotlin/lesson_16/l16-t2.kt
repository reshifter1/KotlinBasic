package lesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun calculateLength(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)
    val length = circle.calculateLength()
    val area = circle.calculateArea()

    println("Длина круга: %.1f".format(length))
    println("Площадь круга: $area")
}
