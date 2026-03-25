package BankingSystem;

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public void calculateInterest() {
        // Typically, current accounts have 0 or very low interest
        System.out.println("Current Account: No interest applied.");
    }
}
