public class InsertAtEndExample
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

    static Node insertAtEnd(Node head, int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            return newNode;
        }

        Node current = head;

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = newNode;

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

        head = insertAtEnd(head, 40);

        System.out.println("After insertion:");
        printList(head);
    }
}