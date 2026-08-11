public class LastOccurance 
{
    public static void main(String[] args) 
    {
        String s="bannana";
        int target='a';
        int lastIndex=-1;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==target)
            {
                lastIndex=i;
            }
        }
        if(lastIndex != -1)
        {
            System.out.println("Last Occurrence = " + lastIndex);
        }
        else
        {
            
            System.out.println("Character not found");
        }
    }
}
