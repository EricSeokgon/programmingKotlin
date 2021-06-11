package OOP

import java.io.InputStream
import java.io.OutputStream

interface Document {
    val version: Long
    val size: Long

    val name: String
        get() = "NoName"

    fun save(intput: InputStream)
    fun load(stream: OutputStream)
    fun getDescription(): String {
        return "Document $name had $size byte(-s)"
    }
}