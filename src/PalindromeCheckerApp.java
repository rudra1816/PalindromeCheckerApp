interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Strategy 1: Stack based palindrome check
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }
}

// Strategy 2: Deque based palindrome check
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        char[] deque = str.toCharArray();
        int start = 0;
        int end = deque.length - 1;

        while (start < end) {

            if (deque[start] != deque[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}