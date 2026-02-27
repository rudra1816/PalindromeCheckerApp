import java.util.Scanner;

public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker Application";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {

        displayWelcomeMessage();

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + input.charAt(i);
        }

        if (input.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    private static void displayWelcomeMessage() {
        System.out.println("=======================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("=======================================");
    }
}