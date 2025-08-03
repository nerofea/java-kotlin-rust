//this is calling the main function where the code starts to execute
fun main() {
    //creating a variable named inventory with a list of values
    val inventory = listOf("Sword", "Shield", "Potion")
   //this prints a header for the inventory list
    println("Inventory items:")
  //this loops through each item in the inventory 
    for (item in inventory) {
        //prints each item with a dash prefix (- Sword, - Shield, - Potion)
        println("- $item")
    }
}
