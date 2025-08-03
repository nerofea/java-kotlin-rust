//starts the exectution of code
fn main() {
    //assigns the variable inventory the vector of items
    let inventory = vec!["Sword", "Shield", "Potion"];
//prints out the header of Inventory items:
    println!("Inventory items:");
  // Loops through each item in the vector and prints each item with a dash prefix
    // Output: -Sword, -Shield, -Potion
    for item in &inventory {
        println!("- {}", item);
    }
}
