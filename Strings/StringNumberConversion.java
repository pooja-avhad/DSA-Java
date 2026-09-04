public class StringNumberConversion
{
    public static void main(String[] args)
    {
        // String -> Number
        String s = "100";

        int num = Integer.parseInt(s);

        System.out.println("String = " + s);
        System.out.println("Number = " + num);

        // Number -> String
        int n = 200;

        String result = String.valueOf(n);

        System.out.println("Number = " + n);
        System.out.println("String = " + result);
    }
}