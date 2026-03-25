package OnlineFoodDeliverySystem;

public class FoodDeliverySystem {


    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        double total = item.calculateTotalPrice();


        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            total = d.applyDiscount(total);
            System.out.println(d.getDiscountDetails());
        }

        System.out.println("Final Bill: $" + total);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        FoodItem pizza = new VegItem("Margherita Pizza", 12.00, 2);
        FoodItem burger = new NonVegItem("Chicken Zinger", 8.00, 1);

        System.out.println("--- Processing Online Order ---");
        processOrder(pizza);
        processOrder(burger);
    }
}
