 import java.util.Scanner;

    class PalindromeCheckerApp {

        // Node class
        static class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        // Convert string to linked list
        public static Node createLinkedList(String str) {
            Node head = null, tail = null;

            for (char ch : str.toCharArray()) {
                Node newNode = new Node(ch);
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }

        // Reverse linked list
        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Check palindrome
        public static boolean isPalindrome(Node head) {
            if (head == null || head.next == null) {
                return true;
            }

            Node slow = head;
            Node fast = head;

            // Find middle using fast and slow pointer
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node secondHalf = reverse(slow);
            Node firstHalf = head;

            // Compare both halves
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            Node head = createLinkedList(input);

            if (isPalindrome(head)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }

            scanner.close();
        }
    }
