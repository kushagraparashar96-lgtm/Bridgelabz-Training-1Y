package BankingSystem;

public class BankingApp {
    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount("SAV123", "Alice", 6000.00),
                new CurrentAccount("CUR456", "Bob", 2000.00)
        };

        for (BankAccount acc : accounts) {
            System.out.println("--- Processing Account: " + acc.getAccountNumber() + " ---");
            System.out.println("Holder: " + acc.getHolderName());


            acc.calculateInterest();


            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(1000);
            }

            System.out.println("Final Balance: $" + acc.getBalance() + "\n");
        }
    }
}
