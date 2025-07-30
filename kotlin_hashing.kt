import java.security.MessageDigest

fun hashPassword(password: String): String {
    val bytes = MessageDigest.getInstance("SHA-256").digest(password.toByteArray())
    return bytes.joinToString("") { "%02x".format(it) }
}

fun main() {
    val input = "hunter2"
    val stored = hashPassword("hunter2")

    if (hashPassword(input) == stored) {
        println("Login successful!")
    } else {
        println("Access denied.")
    }
}
