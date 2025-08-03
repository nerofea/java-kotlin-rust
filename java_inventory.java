//Imports java.util.list which is needed to use the List interface in the code
import java.util.List;
//creats a public class named Inventory
public class Inventory {
    //starts the exectution of the code
    public static void main(String[] args) {
        //this creates a list named inventory that holds string values.
        //The new list contains sword shield and potion.
        List<String> inventory = List.of("Sword", "Shield", "Potion");
        //this will print out the header of Inventory items:
        System.out.println("Inventory items:");
        //this with loop through each item in inventory
        for (String item : inventory) {
            //this will print a prefix of - before each items name. -Sword, -Shield, -Potion
            System.out.println("- " + item);
        }
    }
}
