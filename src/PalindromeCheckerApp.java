import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

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

        System.out.print("Enter a string for char[] check: ");
        String arrayInput = scanner.nextLine();

        char[] characters = arrayInput.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(arrayInput + " is a palindrome.");
        } else {
            System.out.println(arrayInput + " is not a palindrome.");
        }

        System.out.print("Enter a string for Stack check: ");
        String stackInput = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stackInput.length(); i++) {
            stack.push(stackInput.charAt(i));
        }

        String reversedStack = "";

        while (!stack.isEmpty()) {
            reversedStack = reversedStack + stack.pop();
        }

        if (stackInput.equals(reversedStack)) {
            System.out.println(stackInput + " is a palindrome.");
        } else {
            System.out.println(stackInput + " is not a palindrome.");
        }

        System.out.print("Enter a string for Queue vs Stack comparison: ");
        String dataInput = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < dataInput.length(); i++) {
            char ch = dataInput.charAt(i);
            queue.add(ch);
            stack2.push(ch);
        }

        boolean isPalindromeQS = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindromeQS = false;
                break;
            }
        }

        if (isPalindromeQS) {
            System.out.println(dataInput + " is a palindrome.");
        } else {
            System.out.println(dataInput + " is not a palindrome.");
        }

        System.out.print("Enter a string for Deque check: ");
        String dequeInput = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < dequeInput.length(); i++) {
            deque.addLast(dequeInput.charAt(i));
        }

        boolean isPalindromeDeque = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindromeDeque = false;
                break;
            }
        }

        if (isPalindromeDeque) {
            System.out.println(dequeInput + " is a palindrome.");
        } else {
            System.out.println(dequeInput + " is not a palindrome.");
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