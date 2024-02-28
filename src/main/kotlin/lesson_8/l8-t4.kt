/// Сделаю бесконечную замену, пока пользователю не надоест. Так сложнее и интереснее

package lesson_8

fun main() {
    val recipe = arrayOf("рис", "куриное филе", "соевый соус", "глютамат натрия", "немного любви")

    println("У нас есть рецепт: ${recipe.joinToString()}\nХотите что-нибудь заменить?" +
            "\nВведите ингридиент или \"0\", если не хотите")
    var itemToReplace = readln()

    while (itemToReplace != "0") {
        val index = recipe.indexOf(itemToReplace)
        if (index >= 0) {
            println("Введите новый ингридиент:")
            recipe[index] = readln()
            println("Новый рецепт: ${recipe.joinToString()}\n" +
                    "Хотите что-нибудь заменить?\nВведите ингридиент или \"0\", если не хотите")
        } else println("Такого ингридиента нет. Хотите что-нибудь заменить? " +
                "Введите ингридиент или \"0\", если не хотите")
        itemToReplace = readln()
    }

    println("Итоговый рецепт: ${recipe.joinToString()}")
}