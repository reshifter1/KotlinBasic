package lesson_11

import java.util.concurrent.atomic.AtomicInteger

data class ForumUser(val userId: Int, val userName: String)

data class ForumMessage(val authorId: Int, val message: String)

class Forum {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private val userIdCounter = AtomicInteger(1)        // Мне очень понравился этот класс, мне кажется,
                                                                  // это то место, где его и нужно применять

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser(userIdCounter.getAndIncrement(), userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val author = users.find { it.userId == authorId }
        return if (author != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            newMessage
        } else null
    }

    fun printThread() {
        messages.forEach { message ->
            val author = users.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.userName}: ${message.message}")
            }
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Маша")
    val user2 = forum.createNewUser("Саша")

    forum.createNewMessage(user1.userId, "Всем привет!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "О, я тут не один!")
    forum.createNewMessage(user2.userId, "Привет!")

    forum.printThread()
}
