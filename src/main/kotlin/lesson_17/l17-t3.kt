package lesson_17

class Folder(
    private val name: String,
    private val fileCount: Int,
    private val isSecret: Boolean
) {
    val folderName: String
        get() = if (isSecret) "Скрытая папка" else name

    val numberOfFiles: Int
        get() = if (isSecret) 0 else fileCount
}

fun main() {
    val secretFolder = Folder("Secret", 10, true)

    println("Folder name: ${secretFolder.folderName}")
    println("Number of files: ${secretFolder.numberOfFiles}")
}
