package lesson_9

fun main() {
    val recipe = listOf("яйцо", "молоко", "сливочное масло")
    val amountForOnePortion = listOf(2, 50, 15)
    val dimension = listOf("шт", "мл", "гр")

    println("Сколько порций вы хотите приготовить?")
    val portionsCount = readln().toInt()

    println("Нужно продуктов:")
    for (i in (0..<recipe.count())) {
        println("${recipe[i]} ${amountForOnePortion[i] * portionsCount} ${dimension[i]}.")
    }
}