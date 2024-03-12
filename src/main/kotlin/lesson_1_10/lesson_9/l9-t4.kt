package lesson_1_10.lesson_9

fun main() {
    println("Введите 5 ингридиентов, перечисленных через запятую и пробел:")
    val recipe = readln()
    val recipeArray = recipe.split(", ").sorted()
    println(recipeArray)
}