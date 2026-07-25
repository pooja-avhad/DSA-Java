public class GradeCalculator 
{
    public static void main(String[] args) 
    {
        int marks=82;
        if(marks>=90)
        {
            System.out.println("A Grade");
        }
        else if(marks>=75)
        {
            System.out.println("B Grade");
        }
        else if(marks>=60)
        {
            System.out.println("C Grade");
        }
        else if(marks>=35)
        {
            System.out.println("D Grade");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}
