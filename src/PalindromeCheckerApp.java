public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // ===== UC4: Character Array Based Palindrome Check =====
        String input = "madam";  // change this string to test different inputs
        char[] chars = input.toCharArray();  // convert string to char array
        boolean isPalindrome = true;

        // Two-pointer approach: start and end
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (UC4).");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome (UC4).");
        }
    }
}