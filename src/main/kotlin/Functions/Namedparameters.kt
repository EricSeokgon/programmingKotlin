package Functions

fun main() {
    val string = "a kindness of ravens"
    string.regionMatches(14, "Red Ravens", 4, 6, true)

    deleteFiles("*.jpg", true, true, false)
    deleteFiles("*.jpg", recursive = true, ignoreCase = true,  deleteDirectories = false)

    string.endsWith(suffix = "ravens", ignoreCase = true)
    string.endsWith(ignoreCase = true, suffix = "ravens")
}

fun deleteFiles(filePattern: String, recursive: Boolean,  ignoreCase: Boolean, deleteDirectories: Boolean): Unit{}