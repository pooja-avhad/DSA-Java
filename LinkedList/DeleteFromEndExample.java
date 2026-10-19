public class DeleteFromEndExample
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

    static Node deleteFromEnd(Node head)
    {
        if(head == null)
        {
            return null;
        }

        if(head.next == null)
        {
            return null;
        }

        Node current = head;

        while(current.next.next != null)
        {
            current = current.next;
        }

        current.next = null;

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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before deletion:");
        printList(head);

        head = deleteFromEnd(head);

        System.out.println("After deletion:");
        printList(head);
    }
}