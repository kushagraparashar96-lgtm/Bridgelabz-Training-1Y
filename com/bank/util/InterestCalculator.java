package com.bank.util;
import static java.lang.Math.*;
public class InterestCalculator {


        public static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }


        public static double calculateCompoundInterest(double principal, double rate, double time) {
            // Because of static import, we use 'pow' instead of 'Math.pow'
            return principal * pow((1 + rate / 100), time) - principal;
        }
    }

