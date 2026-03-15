import java.util.Scanner;

public class CharArrayComparison {

    public static char[] getChars(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String input = sc.next();

        char[] userDefinedArray = getChars(input);
        char[] builtInArray = input.toCharArray();

        boolean result = compareArrays(userDefinedArray, builtInArray);

        System.out.println("Arrays match: " + result);

        sc.close();
    }
}
