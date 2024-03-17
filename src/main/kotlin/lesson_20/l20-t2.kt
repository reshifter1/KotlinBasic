package lesson_20

class Player(
    val name: String,
    val maxHP: Int,
    var HP: Int
)

val drinkHealthPotion: (Player) -> Unit = {player -> player.HP = player.maxHP}

fun main() {
    val player = Player("Pavel", 30, 15)

    println(player.HP)

    drinkHealthPotion(player)
    println(player.HP)
}