use sha2::{Sha256, Digest};

fn hash_password(password: &str) -> String {
    let mut hasher = Sha256::new();
    hasher.update(password);
    let result = hasher.finalize();
    format!("{:x}", result)
}

fn main() {
    let input_password = "hunter2";
    let stored_hash = hash_password("hunter2");

    if hash_password(input_password) == stored_hash {
        println!("Login successful!");
    } else {
        println!("Access denied.");
    }
}
