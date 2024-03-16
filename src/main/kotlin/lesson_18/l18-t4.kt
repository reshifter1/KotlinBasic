package lesson_18

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(val length: Double, val width: Double, val height: Double) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class Cube(val sideLength: Double) : Box() {
    override fun surfaceArea(): Double {
        return 6 * sideLength * sideLength
    }
}

fun main() {
    val rectangularBox = RectangularBox(3.0, 2.0, 1.0)
    val cube = Cube(2.0)

    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.surfaceArea()}")
    println("Площадь поверхности кубической коробки: ${cube.surfaceArea()}")
}
