public class FirstOcuurance 
{
    public static void main(String[] args) 
    {
        String s="bannana";
        int target='a';

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==target)
            {
               System.out.println("First Occurance="+ i);
               return;
            }

        }
         System.out.println("Character not found");
    }
}
