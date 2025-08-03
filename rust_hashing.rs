// Imports the SHA256 hashing algorithm
use sha2::{Sha256, Digest};

// Creates a function that takes a password string and returns its SHA256 hash as a hex string
fn hash_password(password: &str) -> String {
     // Creates a new mutable SHA256 hasher instance
    let mut hasher = Sha256::new();
     // Updates the hasher with the password bytes
    hasher.update(password);
    // Computes the final hash digest
    let result = hasher.finalize();
    // Converts the hash bytes into a hexadecimal string
    format!("{:x}", result)
}
//this starts the execution of the code
fn main() {
    //assings the variable input_password the value of hunter2
    let input_password = "hunter2";
    // Assigns stored_hash the result of calling hash_password with "hunter2"
    let stored_hash = hash_password("hunter2");
   // Checks if the entered password's hash matches the stored hashed password
    if hash_password(input_password) == stored_hash {
        //pring loging successfull
        println!("Login successful!");
        //if not
    } else {
        //print access denied
        println!("Access denied.");
    }
}
