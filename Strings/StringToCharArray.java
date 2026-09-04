public class StringToCharArray
{
    public static void main(String[] args)
    {
        String s = "Java";

        char[] arr = s.toCharArray();

        System.out.println("Characters:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}