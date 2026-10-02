public class RadixSort
{
    // Find maximum number
    static int getMax(int[] arr)
    {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }


    // Counting Sort according to a digit
    static void countingSort(int[] arr, int exp)
    {
        int n = arr.length;

        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences of each digit
        for(int i = 0; i < n; i++)
        {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Convert count into position
        for(int i = 1; i < 10; i++)
        {
            count[i] = count[i] + count[i - 1];
        }

        // Build output array
        // Traverse from right to left to maintain stability
        for(int i = n - 1; i >= 0; i--)
        {
            int digit = (arr[i] / exp) % 10;

            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output back to original array
        for(int i = 0; i < n; i++)
        {
            arr[i] = output[i];
        }
    }


    // Radix Sort
    static void radixSort(int[] arr)
    {
        int max = getMax(arr);

        // exp = 1 → units
        // exp = 10 → tens
        // exp = 100 → hundreds
        for(int exp = 1; max / exp > 0; exp = exp * 10)
        {
            countingSort(arr, exp);
        }
    }


    public static void main(String[] args)
    {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}