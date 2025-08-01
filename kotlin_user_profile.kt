/*This is creating a data class called UserProfile which is used to store user related info*/
data class UserProfile(
    /*declaring a property of username. VAL's  are immutable, read-only local variables that can’t be reassigned a different value after its created*/
    val username: String,
    /*Declaring the property of level to a number*/
    val level: Int,
    /*declaring the property of isPremium to true or false*/
    val isPremium: Boolean
)
/*this is the main function where the program starts execution*/
fun main() {
    /*  This line creates a variable named user. 
   It stores a new instance of the UserProfile class, 
   and assigns it the values player_01  level 5, isPremium true.*/
    val user = UserProfile("player_01", 5, true)
    /*this prints all the values out to the screen*/
    println("User: ${user.username}, Level: ${user.level}, Premium: ${user.isPremium}")
}
