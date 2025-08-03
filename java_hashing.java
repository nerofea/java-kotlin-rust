//import is importing the MessageDigest class from the java.security package to use cryptographic hashing in the code//
import java.security.MessageDigest;
//this is importive the NoSuchAlgorithmException from the java.security package. This exception is thrown when a particular cryptographic algorithm is requested but is not available in the environment
import java.security.NoSuchAlgorithmException;
//creating a public class named auth//
public class Auth {
    //This is calling a public method for hashPassword which is expecting a string input for password
    //converts to bytes, then converts to hexidecimal string
    //and returns a hashed password as a string. 
    //Throws is in place incase the cryptographic algorithm isnt available
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        //this is setting the algorithm to be used as SHA-256
        MessageDigest md = MessageDigest.getInstance("SHA-256");
         //converts password to bytes and hashes them using SHA-256
        byte[] hash = md.digest(password.getBytes());
        //this is creating a new StringBuilder Object
        StringBuilder hexString = new StringBuilder();
        //Looping through each byte of the hashed password
        for (byte b : hash) {
            //this is converting each byte to hex format
            hexString.append(String.format("%02x", b));
        }
        //this is returning the new hexidecimal string
        return hexString.toString();
    }
        //This is where the code starts executing
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //this is creating a variable called input with the value of hunter2
        String input = "hunter2";
        //this is creating a variable called stored with calling the hashPassword() method and giving it the value of hunter2
        //this would take the password of hunter2 and return it as a hexidecimal string 
        String stored = hashPassword("hunter2");
    //if the input password matches the stored password (comparing their hashes)
        if (hashPassword(input).equals(stored)) {
            //Print to console "Login successful!
            System.out.println("Login successful!");
            //if not
        } else {
            //print Access denied to console
            System.out.println("Access denied.");
        }
    }
}
