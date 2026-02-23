import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "radar";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (UC5).");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome (UC5).");
        }
    }
}