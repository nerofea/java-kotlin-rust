data class UserProfile(
    val username: String,
    val level: Int,
    val isPremium: Boolean
)

fun main() {
    val user = UserProfile("player_01", 5, true)
    println("User: ${user.username}, Level: ${user.level}, Premium: ${user.isPremium}")
}
