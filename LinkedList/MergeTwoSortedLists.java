
public class MergeTwoSortedLists {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted linked lists
    static Node merge(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
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

        // First sorted list: 10 -> 30
        Node list1 = new Node(10);
        list1.next = new Node(30);

        // Second sorted list: 20 -> 40
        Node list2 = new Node(20);
        list2.next = new Node(40);

        // Merge both lists
        Node result = merge(list1, list2);

        // Display merged list
        System.out.println("Merged Linked List:");
        printList(result);
    }
}
