package lesson_21

import java.io.File

fun File.writeWord(word: String) {
    this.createNewFile()
    val currentContent = this.readText()

    this.writeText("${word.lowercase()}$currentContent")
}

fun main() {
    val file = File("file.txt")

    file.writeWord("ТЕКСТ")
}