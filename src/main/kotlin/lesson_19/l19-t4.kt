package lesson_19

enum class Bullet() {
    BLUE,
    GREEN,
    RED;

    fun getDamage(): Int {
        return when (this) {
            BLUE -> 5
            GREEN -> 10
            RED -> 20
        }
    }
}

class Tank() {
    var currentBullet: Bullet? = null

    fun newBullet(bullet: Bullet) {
        currentBullet = bullet
    }

    fun shoot() {
        if (currentBullet != null) println("Нанесено ${currentBullet!!.getDamage()} урона")
        else println("Пушка не заряжена!")
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.newBullet(Bullet.RED)
    tank.shoot()

    tank.newBullet(Bullet.GREEN)
    tank.shoot()
}