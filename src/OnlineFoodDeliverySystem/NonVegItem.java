package OnlineFoodDeliverySystem;


class NonVegItem extends FoodItem {
    private double packagingCharge = 2.50; // Extra charge for non-veg

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + packagingCharge;
    }
}
