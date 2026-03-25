package BankingSystem;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
