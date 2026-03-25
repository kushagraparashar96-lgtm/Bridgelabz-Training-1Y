package OnlineFoodDeliverySystem;

public abstract  class FoodItem {
        private String itemName;
        private double price;
        private int quantity;

        public FoodItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public abstract double calculateTotalPrice();


        public String getItemDetails() {
            return "Item: " + itemName + " | Quantity: " + quantity + " | Base Price: $" + price;
        }


        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }
        public String getItemName() { return itemName; }
    }