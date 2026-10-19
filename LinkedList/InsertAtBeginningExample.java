public class InsertAtBeginningExample
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtBeginning(Node head, int data)
    {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }

    static void printList(Node head)
    {
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Node head = new Node(20);
        head.next = new Node(30);

        System.out.println("Before insertion:");
        printList(head);

        head = insertAtBeginning(head, 10);

        System.out.println("After insertion:");
        printList(head);
    }
}