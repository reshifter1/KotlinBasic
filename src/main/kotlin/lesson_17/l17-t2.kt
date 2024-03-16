package lesson_17

class Ship(_name: String, _speed: Int, _port: String) {
    var name = _name
        set(value) {
            println("Нелья менять имя корабля! Обратитесь к диспетчеру!")}
        get() = "НЕизменяемое имя корябля: $field"
    val speed = _speed
    val port = _port
}

fun main() {
    val ship = Ship("Победа", 15, "Македонский")
    println(ship.name)

    ship.name = "Беда"
    println(ship.name)
}