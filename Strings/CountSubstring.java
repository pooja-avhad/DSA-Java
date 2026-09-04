public class CountSubstring
{
    public static void main(String[] args)
    {
        String s = "java java java";

        String word = "java";

        int count = 0;
        int index = 0;

        while((index = s.indexOf(word, index)) != -1)
        {
            count++;

            index = index + word.length();
        }

        System.out.println("String = " + s);
        System.out.println("Word = " + word);
        System.out.println("Occurrence = " + count);
    }
}