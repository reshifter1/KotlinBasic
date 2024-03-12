package lesson_1_10.lesson_8

fun main() {
    val recipe = arrayOf("рис", "куриное филе", "соевый соус", "глютамат натрия", "немного любви")

    println("Введите ингридиент для поиска")
    val itemToFind = readln()

    if (recipe.indexOf(itemToFind) >= 0) {
        println("Ингредиент $itemToFind в рецепте есть")
        return
    }

    println("Ингридиент $itemToFind отсутствует")
}