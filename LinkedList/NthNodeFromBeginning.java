public class NthNodeFromBeginning 
{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int findNthNode(Node head, int n) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (position == n) {
                return current.data;
            }

            current = current.next;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);
        head.next.next.next = new Node(35);

        int result = findNthNode(head, 2);

        System.out.println("Nth Node = " + result);
    }
}