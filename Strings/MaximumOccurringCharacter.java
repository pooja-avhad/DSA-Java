public class MaximumOccurringCharacter
{
    public static void main(String[] args)
    {
        String s = "banana";

        char maxChar = s.charAt(0);
        int maxCount = 0;

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

            if(count > maxCount)
            {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character = " + maxChar);
        System.out.println("Frequency = " + maxCount);
    }
}