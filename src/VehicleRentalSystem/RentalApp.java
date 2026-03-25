package VehicleRentalSystem;


import java.util.*;

public class RentalApp {
    public static void main(String[] args) {
        List<Vehicle> rentalFleet = new ArrayList<>();

        // Polymorphism in action
        rentalFleet.add(new Car("MH-01-AX-1234", 1500, "PRIME:999"));
        // You can add Bike or Truck here similarly

        int days = 3;

        for (Vehicle v : rentalFleet) {
            v.calculateRentalCost(days);
            System.out.println("Vehicle No: " + v.getVehicleNumber());
            System.out.println("Total Rental: ₹" + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance: ₹" + ins.calculateInsurance());
                System.out.println("Details: " + ins.getInsuranceDetails());
            }
            System.out.println("-------------------------");
        }
    }
}
