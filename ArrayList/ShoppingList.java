import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Shopping List App!");
        boolean running = true;
        
        while (running) {
            System.out.print("Enter a command (add, remove, view, check, exit): ");
            String command = scanner.next();
            
            switch (command) {
                case "add":
                    System.out.print("Enter an item to add: ");
                    String itemToAdd = scanner.next();
                    shoppingList.add(itemToAdd);
                    System.out.println(itemToAdd + " has been added to the shopping list.");
                    break;
                case "remove":
                    System.out.print("Enter an item to remove: ");
                    String itemToRemove = scanner.next();
                    if (shoppingList.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " has been removed from the shopping list.");
                    } else {
                        System.out.println(itemToRemove + " was not found in the shopping list.");
                    }
                    break;
                case "view":
                    System.out.println("Shopping List:");
                    for (String item : shoppingList) {
                        System.out.println("- " + item);
                    }
                    break;
                case "check":
                    System.out.print("Enter an item to check: ");
                    String itemToCheck = scanner.next();
                    if (shoppingList.contains(itemToCheck)) {
                        System.out.println(itemToCheck + " is in the shopping list.");
                    } else {
                        System.out.println(itemToCheck + " is not in the shopping list.");
                    }
                    break;
                case "exit":
                    running = false;
                    System.out.println("Exiting the Shopping List App.");
                    break;
                default:
                    System.out.println("Invalid command. Please use add, remove, view, check, or exit.");
                    break;
            }
        }
        
        scanner.close();
    }
}
