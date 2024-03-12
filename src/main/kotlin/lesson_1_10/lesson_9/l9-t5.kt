package lesson_1_10.lesson_9

fun main() {
    val recipeSet: MutableSet<String> = mutableSetOf()

    while (recipeSet.count() < 5) {
        println("Введите ингридиент:")
        recipeSet.add(readln())
    }

    println(recipeSet.sorted().joinToString(", ").replaceFirstChar { it.uppercase() })
}