//import is importing the MessageDigest class from the java.security package to use cryptographic hashing in the code//
import java.security.MessageDigest;
//this is importive the NoSuchAlgorithmException from the java.security package. This exception is thrown when a particular cryptographic algorithm is requested but is not available in the environment
import java.security.NoSuchAlgorithmException;
//creating a public class named auth//
public class Auth {
    
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "hunter2";
        String stored = hashPassword("hunter2");

        if (hashPassword(input).equals(stored)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Access denied.");
        }
    }
}
