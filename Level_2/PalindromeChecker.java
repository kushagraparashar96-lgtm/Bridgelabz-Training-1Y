package Level_2;

import java.util.Scanner;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
class MovieRunner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
        scanner.close();
    }
}
