package Level_2;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.printf("%-15s x%d   $%.2f%n", itemName, quantity, getTotalPrice());
    }
}

class CarRunner{
    private static ArrayList<CartItem> cart = new ArrayList<>();

    public static void addItem(String name, double price, int qty) {
        cart.add(new CartItem(name, price, qty));
        System.out.println(name + " added to cart.");
    }

    public static void removeItem(String name) {
        boolean removed = cart.removeIf(item -> item.getItemName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println(name + " removed from cart.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void displayTotal() {
        double total = 0;
        System.out.println("\n--- Current Cart ---");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("--------------------");
        System.out.printf("Total Cost: $%.2f%n", total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Show Total\n4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = scanner.nextInt();
                    addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String toRemove = scanner.nextLine();
                    removeItem(toRemove);
                    break;
                case 3:
                    displayTotal();
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}