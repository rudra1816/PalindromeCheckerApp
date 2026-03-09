public class PalindromeCheckerApp {

    // Iterative palindrome check
    static boolean iterativePalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Recursive palindrome check
    static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Iterative timing
        long startTime1 = System.nanoTime();
        boolean result1 = iterativePalindrome(input);
        long endTime1 = System.nanoTime();

        // Recursive timing
        long startTime2 = System.nanoTime();
        boolean result2 = recursivePalindrome(input, 0, input.length() - 1);
        long endTime2 = System.nanoTime();

        System.out.println("\nIterative Result: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Iterative Execution Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("\nRecursive Result: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive Execution Time: " + (endTime2 - startTime2) + " ns");

        sc.close();
    }
}