public class CharacterFrequency
{
    public static void main(String[] args)
    {
        String s = "programming";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            boolean alreadyCounted = false;

            for(int j = 0; j < i; j++)
            {
                if(s.charAt(j) == ch)
                {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted)
            {
                continue;
            }

            int count = 0;

            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(j) == ch)
                {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}
