package com.gla.Level_1;
public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating handled exception:");
        handleException();

        System.out.println("\nDemonstrating unhandled exception (program will crash):");
        generateException();
    }
}