public class PalindromeCheckerApp {

    static boolean isPalindrome(String str) {

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

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(processed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}