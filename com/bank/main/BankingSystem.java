package com.bank.main;



import com.bank.util.InterestCalculator;

public class BankingSystem {
    public static void main(String[] args) {
        double p = 10000; // Principal
        double r = 7.5;   // Annual Interest Rate (%)
        double t = 5;     // Time in years

        // Calculate Interests
        double si = InterestCalculator.calculateSimpleInterest(p, r, t);
        double ci = InterestCalculator.calculateCompoundInterest(p, r, t);

        // Display Results
        System.out.println("======= Bank Statement =======");
        System.out.println("Principal Amount : $" + p);
        System.out.println("Interest Rate    : " + r + "%");
        System.out.println("Duration         : " + t + " years");
        System.out.println("------------------------------");
        System.out.printf("Simple Interest   : $%.2f\n", si);
        System.out.printf("Compound Interest : $%.2f\n", ci);
        System.out.println("==============================");
    }
}
