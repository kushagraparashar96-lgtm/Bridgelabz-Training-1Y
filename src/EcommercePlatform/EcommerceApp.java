package EcommercePlatform;
import java.util.*;
public class EcommerceApp {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics(1, "Smartphone", 30000));
        cart.add(new Groceries(2, "Organic Honey", 500));
        System.out.println("--- Checkout Receipt ---");
        for (Product p : cart) {
            printFinalPrice(p);}
    }
    public static void printFinalPrice(Product p) {
        double discount = p.calculateDiscount();
        double tax = 0;

        // Check if the product is Taxable (Polymorphism)
        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax(p.getPrice());}
        double finalPrice = (p.getPrice() + tax) - discount;

        System.out.println("Product: " + p.getName());
        System.out.println("Final Price: ₹" + finalPrice + " (Tax: ₹" + tax + ", Saved: ₹" + discount + ")");

    }
}
