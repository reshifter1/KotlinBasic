package lesson_15

abstract class UserTemplate(
    val name: String
) {
    fun read() {
        println("Открыта страничка")
    }

    fun write(text: String) {
        println("Отправлено сообщение: $text")
    }
}

class User(name: String) : UserTemplate(name)

interface AdminRights {
    fun deleteUser(user: User) {
        println("${user.name} deleted")
    }

    fun deletePost(post: String) {
        println("$post deleted")
    }
}

class Admin(name: String) : UserTemplate(name), AdminRights

fun main() {}