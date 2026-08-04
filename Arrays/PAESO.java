public class PAESO {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};

        int[] result = new int[arr.length];

        // Prefix
        result[0] = 1;

        for(int i = 1; i < arr.length; i++)
        {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Suffix
        int suffix = 1;

        for(int i = arr.length - 1; i >= 0; i--)
        {
            result[i] = result[i] * suffix;
            suffix = suffix * arr[i];
        }

        // Print
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}