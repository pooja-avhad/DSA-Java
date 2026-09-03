public class FirstRepeatingCharacter
{
    public static void main(String[] args)
    {
        String s = "programming";

        boolean found = false;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            for(int j = i + 1; j < s.length(); j++)
            {
                if(ch == s.charAt(j))
                {
                    System.out.println("First repeating character = " + ch);
                    found = true;
                    break;
                }
            }

            if(found)
            {
                break;
            }
        }
    }
}