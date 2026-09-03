public class FirstNonRepeatingCharacter
{
    public static void main(String[] args)
    {
        String s = "swiss";

        boolean found = false;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            int count = 0;

            for(int j = 0; j < s.length(); j++)
            {
                if(ch == s.charAt(j))
                {
                    count++;
                }
            }

            if(count == 1)
            {
                System.out.println("First non-repeating character = " + ch);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("No non-repeating character");
        }
    }
}