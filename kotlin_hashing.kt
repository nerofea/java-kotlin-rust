//this is importing the messagedigest package from java.security
import java.security.MessageDigest
//this is creating a new function named hashPassword that takes a password string and returns a hashed password
fun hashPassword(password: String): String {
    //this converts the password to bytes and hashes it using SHA-256
    val bytes = MessageDigest.getInstance("SHA-256").digest(password.toByteArray())
    //this converts the hashed bytes to a hexadecimal string
    return bytes.joinToString("") { "%02x".format(it) }
}
//this is where the code starts execution
fun main() {
    //creating a variable named input with the value as hunter2
    val input = "hunter2"
    //creating a variable named stored calling the hashPassword function with the value of hunter2
    val stored = hashPassword("hunter2")
 //this is comparing the hashed input password with the stored hashed password
    if (hashPassword(input) == stored) {
        //if they match output to console Login successful
        println("Login successful!")
    //if they dont
    } else {
        //print to console access denied
        println("Access denied.")
    }
}

