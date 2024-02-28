package lesson_8

fun main() {
    val recipe = arrayOf("рис", "куриное филе", "соевый соус", "глютамат натрия", "немного любви")
    val itemToFind = readln()

    for (item in recipe) {
        if (item == itemToFind) {
            println("Ингредиент $itemToFind в рецепте есть")
            return
        }
    }

    println("Ингридиент $itemToFind отсутствует")
}