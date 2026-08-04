public class Suffix
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        int[] suffix = new int[arr.length];

        suffix[arr.length - 1] = 1;

        for(int i = arr.length - 2; i >= 0; i--)
        {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        for(int i = 0; i < suffix.length; i++)
        {
            System.out.print(suffix[i] + " ");
        }
    }
}