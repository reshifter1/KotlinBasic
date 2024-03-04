package lesson_9

fun main() {
    val recipe: MutableList<String> = mutableListOf()
    var ingridient: String

    while (recipe.count() < 5) {
        println("Введите ингридиент:")
        ingridient = readln()

        if (recipe.contains(ingridient)) println("Такой ингридиент уже есть!")
        else recipe.addLast(ingridient)
    }
    recipe.sort()
    recipe[0] = recipe[0].replaceFirstChar {it.uppercase()}
    println(recipe.joinToString(", "))
}