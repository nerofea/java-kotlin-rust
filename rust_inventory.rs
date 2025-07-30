fn main() {
    let inventory = vec!["Sword", "Shield", "Potion"];

    println!("Inventory items:");
    for item in &inventory {
        println!("- {}", item);
    }
}
