package BankingSystem;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% interest

    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings Interest Added: $" + interest);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000; // Eligible if balance > $5000
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of $" + amount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan rejected: Low balance.");
        }
    }
}


