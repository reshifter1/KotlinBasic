package lesson_19

enum class Category {
    CLOTHES, STATIONERY, OTHER;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Разное"
        }
    }
}

class Product(val name: String, val id: Int, val category: Category) {
    fun printInfo() {
        println("Товар: $name (ID: $id), Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHES)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Кружка", 3, Category.OTHER)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}