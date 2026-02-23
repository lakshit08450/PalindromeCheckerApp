public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System!");
        System.out.println("Version: 1.0");

        // ===== UC2: Hardcoded Palindrome Check =====
        String input = "racecar";  // hardcoded string
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}