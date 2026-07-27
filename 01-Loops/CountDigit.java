public class CountDigit 
{
    public static void main(String[] args) 
    {
        int number=12345;
        int count=0;
        while(number>0)
        {
            count++;
            number=number/10;
        }
        System.out.println("Total Digit:"+count);
    }
}
