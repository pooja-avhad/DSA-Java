public class QuickSort
{
    // Partition method
    static int partition(int[] arr, int low, int high)
    {
        // Choose last element as pivot
        int pivot = arr[high];

        // Boundary for smaller elements
        int i = low - 1;

        // Check every element before pivot
        for(int j = low; j < high; j++)
        {
            // If current element is smaller than pivot
            if(arr[j] < pivot)
            {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot at its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }


    // Quick Sort method
    static void quickSort(int[] arr, int low, int high)
    {
        // Continue only when more than one element exists
        if(low < high)
        {
            // Find pivot position
            int pivotIndex = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    // Main method
    public static void main(String[] args)
    {
        int[] arr = {7, 2, 5, 1, 6};

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}