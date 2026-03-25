package OnlineFoodDeliverySystem;

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // Standard pricing
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.90; // 10% off for Veg items
    }

    @Override
    public String getDiscountDetails() {
        return "10% Green Discount applied!";
    }
}


