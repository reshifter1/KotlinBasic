package lesson_1_10.lesson_8

fun main() {
    println("Введите количество ингридиентов:")

    val arrayLength = readln().toInt()
    val recipe = Array(arrayLength) {index -> ""}
    for (i in 1..recipe.size) {
        println("Введите ингридиент $i/${recipe.size}:")
        recipe[i-1] = readln()
    }

    println(recipe.joinToString())
}