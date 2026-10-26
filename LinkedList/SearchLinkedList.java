public class SearchLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int search(Node head, int target) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == target) {
                return position;
            }

            current = current.next;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int result = search(head, 30);

        if (result != -1) {
            System.out.println("Found at position: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}