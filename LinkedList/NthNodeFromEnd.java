public class NthNodeFromEnd 
{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int findNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1;
            }
            fast = fast.next;
        }

        // Move both pointers together
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);
        head.next.next.next = new Node(35);
        head.next.next.next.next = new Node(45);

        int result = findNthFromEnd(head, 3);

        System.out.println("Nth Node from End = " + result);
    }
}