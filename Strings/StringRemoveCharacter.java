public class StringRemoveCharacter
{
    public static void main(String[] args)
    {
        String s = "Java Developer";

        char remove = 'a';

        String result = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch != remove)
            {
                result = result + ch;
            }
        }

        System.out.println("Original String = " + s);
        System.out.println("After Removing = " + result);
    }
}