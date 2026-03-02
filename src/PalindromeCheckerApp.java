import java.util.Scanner;
import java.util.Stack;

class PalindromeService {

    public boolean checkPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (service.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}