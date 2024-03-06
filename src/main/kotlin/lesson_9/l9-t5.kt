package lesson_9

fun main() {
    val recipeSet: MutableSet<String> = mutableSetOf()

    while (recipeSet.count() < 5) {
        println("Введите ингридиент:")
        recipeSet.add(readln())
    }

    val recipe: MutableList<String> = recipeSet.sorted().toMutableList()
    recipe[0] = recipe[0].replaceFirstChar {it.uppercase()}
    println(recipe.joinToString(", "))
}