package EcommercePlatform;

public interface Taxable {
    double calculateTax(double price);
    String getTaxDetails();
}
