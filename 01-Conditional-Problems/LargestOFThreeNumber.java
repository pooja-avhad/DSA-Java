public class LargestOFThreeNumber 
{
    public static void main(String[] args) 
    {
        int a=20;
        int b=40;
        int c=10;
        if(a>b && a>c)
        {
            System.out.println("A is Largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Largest");
        }
        else{
            System.out.println("C is Largest");
        }
    }
}
