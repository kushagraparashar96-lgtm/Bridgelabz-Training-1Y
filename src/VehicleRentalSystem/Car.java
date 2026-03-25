package VehicleRentalSystem;



public class Car extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Policy ID: " + insurancePolicy;
    }
}
