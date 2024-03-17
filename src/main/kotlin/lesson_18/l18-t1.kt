package lesson_18

open class Order(val orderNumber: Int, val items: Any)

class SingleItemOrder(orderNumber: Int, item: String) : Order(orderNumber, item) {
    fun printOrderInfo() {
        println("Заказан товар: $items")
    }
}

class MultiItemOrder(orderNumber: Int, items: List<String>) : Order(orderNumber, items) {
    fun printOrderInfo() {
        val itemsString = (items as List<String>).joinToString(separator = ", ")
        println("Заказаны следующие товары: $itemsString")
    }
}

fun main() {
    // Создаем объекты заказов
    val singleItemOrder = SingleItemOrder(1, "Книга")
    val multiItemOrder = MultiItemOrder(2, listOf("Футболка", "Шорты", "Носки"))

    // Выводим информацию о заказах
    singleItemOrder.printOrderInfo()
    multiItemOrder.printOrderInfo()
}

