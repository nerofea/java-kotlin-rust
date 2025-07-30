import java.util.List;

public class Inventory {
    public static void main(String[] args) {
        List<String> inventory = List.of("Sword", "Shield", "Potion");
        System.out.println("Inventory items:");
        for (String item : inventory) {
            System.out.println("- " + item);
        }
    }
}
