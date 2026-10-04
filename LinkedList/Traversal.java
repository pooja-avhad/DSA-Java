class Node1
{
    int data;
    Node1 next;

    Node1(int data)
    {
        this.data=data;
        this.next=null;
    }
}
  class Traversal
  {
    public static void main(String args[])
    {
        Node1 first=new Node1(10);
        Node1 second=new Node1(20);
        Node1 third=new Node1(30);

        first.next=second;
        second.next=third;

        Node1 current=first;

        while(current !=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
  }