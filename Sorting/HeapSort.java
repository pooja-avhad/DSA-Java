public class HeapSort
{
    // Heapify method
    static void heapify(int[] arr, int n, int i)
    {
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if(left < n && arr[left] > arr[largest])
        {
            largest = left;
        }

        // Check right child
        if(right < n && arr[right] > arr[largest])
        {
            largest = right;
        }

        // If largest is not parent
        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Heapify affected subtree
            heapify(arr, n, largest);
        }
    }


    // Heap Sort method
    static void heapSort(int[] arr)
    {
        int n = arr.length;

        // Build Max Heap
        for(int i = n / 2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i);
        }

        // Move largest element to the end
        for(int i = n - 1; i > 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify remaining heap
            heapify(arr, i, 0);
        }
    }


    public static void main(String[] args)
    {
        int[] arr = {4, 10, 3, 5, 1};

        heapSort(arr);

        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}