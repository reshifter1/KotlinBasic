package lesson_9

fun main() {
    val recipe = listOf("рис", "куриное филе", "соевый соус", "щепотка любви")

    println("В рецепте есть следующие ингридиенты:")
    recipe.forEach { println(it) }
}