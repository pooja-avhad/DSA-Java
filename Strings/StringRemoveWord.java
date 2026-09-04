public class StringRemoveWord
{
    public static void main(String[] args)
    {
        String s = "Java is very powerful";

        String word = "very";

        String result = s.replace(word, "");

        System.out.println("Original = " + s);
        System.out.println("After Removing = " + result.trim());
    }
}