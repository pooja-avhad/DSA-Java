public class InsertAtPositionExample
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

    static Node insertAtPosition(Node head, int data, int position)
    {
        if(position < 1)
        {
            return head;
        }

        Node newNode = new Node(data);

        if(position == 1)
        {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        for(int i = 1; i < position - 1 && current != null; i++)
        {
            current = current.next;
        }

        if(current == null)
        {
            return head;
        }

        newNode.next = current.next;
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before insertion:");
        printList(head);

        head = insertAtPosition(head, 25, 3);

        System.out.println("After insertion:");
        printList(head);
    }
}