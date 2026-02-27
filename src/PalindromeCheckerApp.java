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
    }

    private static void displayWelcomeMessage() {
        System.out.println("=======================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("=======================================");
    }
}