package lesson_20

fun main() {
    val elements = listOf("Button", "Checkbox", "TextField", "RadioButton", "Switch")

    val lambdaList: List<Unit> = elements.mapIndexed { index: Int, element: String ->
        if (index % 2 == 0) println("Нажат элемент $element")
    }

    lambdaList.forEach { it }
}
