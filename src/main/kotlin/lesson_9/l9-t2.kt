package lesson_9

fun main() {
    val recipe = mutableListOf("рис", "соевый соус", "щепотка любви")

    println("В списке есть базовые ингридиенты: ${recipe.joinToString()}")
    println("Желаете добавить ещё? Напишите \"да\", если желаете.")

    if (readln() !in arrayOf("да", "Да")) return

    println("Какой ингридиент вы хотите добавить?")
    recipe.add(readln())
    println("Теперь в рецепте следующие ингридиенты: ${recipe.joinToString()}")
}