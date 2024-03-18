package lesson_21

class Player(
    val name: String,
    val maxHP: Int,
    var HP: Int
)

val drinkHealthPotion: (Player) -> Unit = {player -> player.HP = player.maxHP}

fun Player.isHealthy(): Boolean { return this.HP == this.maxHP }

fun main() {
    val player = Player("Pavel", 30, 15)

    println(player.HP)
    println(player.isHealthy())

    drinkHealthPotion(player)
    println(player.HP)
    println(player.isHealthy())
}