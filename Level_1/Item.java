package Level_1;
class Item {
    // Attributes
    String itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost for a specific quantity
    public double calculateTotalCost(int quantity) {
        return this.price * quantity;
    }

    // Method to display item details and cost for a sample quantity
    public void displayItemDetails(int quantity) {
        double total = calculateTotalCost(quantity);

        System.out.println("======= Inventory Item =======");
        System.out.println("Code       : " + itemCode);
        System.out.println("Name       : " + itemName);
        System.out.println("Unit Price : $" + String.format("%.2f", price));
        System.out.println("Quantity   : " + quantity);
        System.out.println("------------------------------");
        System.out.println("TOTAL COST : $" + String.format("%.2f", total));
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        // Create an Item object
        Item laptop = new Item("LP-502", "Wireless Mouse", 25.50);

        // Display details for a purchase of 10 units
        laptop.displayItemDetails(10);
    }
}