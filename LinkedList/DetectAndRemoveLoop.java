
public class DetectAndRemoveLoop {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect and remove loop
    static void detectAndRemoveLoop(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // If no loop exists
        if (fast == null || fast.next == null) {
            return;
        }

        // Step 2: Find loop start
        slow = head;

        if (slow == fast) {
            // Loop starts at head
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            // Find the node before loop start
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Step 3: Remove loop
        fast.next = null;
    }

    // Print linked list
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Create linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Create loop: 50 -> 20
        head.next.next.next.next.next = head.next;

        System.out.println("Loop created in Linked List.");

        // Detect and remove loop
        detectAndRemoveLoop(head);

        System.out.println("Linked List after removing loop:");
        printList(head);
    }
}
