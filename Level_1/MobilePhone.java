package Level_1;

class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor to initialize the phone's characteristics
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to retrieve and display phone information
    public void displayPhoneInfo() {
        System.out.println("📱 Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + String.format("%.2f", price));
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Creating objects (instances) of MobilePhone
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 799.00);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 849.99);
        MobilePhone phone3 = new MobilePhone("Google", "Pixel 8", 699.00);

        // Displaying details for each object
        phone1.displayPhoneInfo();
        phone2.displayPhoneInfo();
        phone3.displayPhoneInfo();
    }
}
