public class RemoveNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Move fast n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head;
            }
            fast = fast.next;
        }

        // Move both pointers together
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the Nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);
        head.next.next.next = new Node(35);
        head.next.next.next.next = new Node(45);

        System.out.println("Before deletion:");
        printList(head);

        head = removeNthFromEnd(head, 3);

        System.out.println("After deletion:");
        printList(head);
    }
}