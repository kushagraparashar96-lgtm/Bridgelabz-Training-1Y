package com.company.payroll;



import com.company.hr.Employee; // Single import

public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        double newSalary = e.getSalary() + bonus;
        e.setSalary(newSalary);
        System.out.println("10% Bonus applied successfully.");
    }
}