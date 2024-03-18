package lesson_16

class Order(private val orderNumber: Int, var status: String) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun updateStatusByManager(newStatus: String) {
        changeStatus(newStatus)
    }

    fun showStatus() {
        println("Номер заказа: $orderNumber, статус: $status")
    }
}

fun main() {
    val order = Order(123456, "В процессе")
    order.showStatus()

    order.updateStatusByManager("Completed")
    order.showStatus()
}
