public class LongestWordString
{
    public static void main(String[] args)
    {
        String s = "Java is very powerful";

        String[] words = s.split(" ");

        String longest = "";
        int maxLength = 0;

        for(int i = 0; i < words.length; i++)
        {
            String current = words[i];

            if(current.length() > maxLength)
            {
                longest = current;
                maxLength = current.length();
            }
        }

        System.out.println("Longest Word = " + longest);
        System.out.println("Length = " + maxLength);
    }
}
