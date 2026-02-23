public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // ===== UC3: Palindrome Check Using String Reverse =====
        String input = "level";  // change this string to test different inputs
        String reversed = "";

        // Reverse the string using a loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}