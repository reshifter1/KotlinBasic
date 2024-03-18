package lesson_17

class Folder(
    _name: String,
    _fileCount: Int,
    private val isSecret: Boolean
) {
    val folderName: String = _name
        get() = if (isSecret) "Скрытая папка" else field

    val numberOfFiles: Int = _fileCount
        get() = if (isSecret) 0 else field
}

fun main() {
    val secretFolder = Folder("Secret", 10, true)

    println("Folder name: ${secretFolder.folderName}")
    println("Number of files: ${secretFolder.numberOfFiles}")
}