package lesson_15

interface AccessorySearchable {
    fun searchAccessories(): String
}

abstract class Product(val name: String, val quantity: Int)

class Instrument(name: String, quantity: Int) : Product(name, quantity), AccessorySearchable {
    override fun searchAccessories(): String {
        return "Выполняется поиск комплектующих для инструмента: $name"
    }
}

class InstrumentAccessory(name: String, quantity: Int) : Product(name, quantity)

fun main() {}
