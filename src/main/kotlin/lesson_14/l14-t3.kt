package lesson_14

private const val PI = 3.14F

abstract class Figure(
    val color: String
) {
    abstract fun calculateArea(): Float

    abstract fun calculatePerimeter(): Float
}

class Circle(
    val radius: Float,
    color: String
) : Figure(color) {
    override fun calculateArea(): Float {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Float {
        return 2 * PI * radius
    }
}

class Rectangle(
    val length: Float,
    val width: Float,
    color: String
) : Figure(color) {
    override fun calculateArea(): Float {
        return length * width
    }

    override fun calculatePerimeter(): Float {
        return (length + width) * 2
    }
}


fun main() {
    val figuresList = mutableListOf(
        Circle(4.0F, "white"),
        Circle(3.0F, "black"),
        Rectangle(2.0F, 2.0F, "black"),
        Rectangle(4.0F, 4.0F, "white")
    )

    var areaSum = 0.0F
    var perimeterSum = 0.0F

    for (figure in figuresList) {
        if (figure.color == "black") perimeterSum += figure.calculatePerimeter()
        else areaSum += figure.calculateArea()
    }

    println(
        "Сумма периметров чёрных фигур: %.1f\nСумма площадей белых фигур: %.1f".format(
            perimeterSum, areaSum
        )
    )
}