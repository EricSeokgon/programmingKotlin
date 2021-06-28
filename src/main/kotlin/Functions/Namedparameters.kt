package Functions

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val string = "a kindness of ravens"
    string.regionMatches(14, "Red Ravens", 4, 6, true)

    deleteFiles("*.jpg", true, true, false)
    deleteFiles("*.jpg", recursive = true, ignoreCase = true,  deleteDirectories = false)

    string.endsWith(suffix = "ravens", ignoreCase = true)
    string.endsWith(ignoreCase = true, suffix = "ravens")
}

fun deleteFiles(filePattern: String, recursive: Boolean,  ignoreCase: Boolean, deleteDirectories: Boolean): Unit{}

fun createThreadPool(): ExecutorService {
    val threadCount = Runtime.getRuntime().availableProcessors()
    return createThreadPool(threadCount)
}

fun createThreadPool(threadCount: Int): ExecutorService {
    return Executors.newFixedThreadPool(threadCount)
}

fun divide(divisor: BigDecimal, scale: Int = 0, roundingMode: RoundingMode = RoundingMode.UNNECESSARY) {}


