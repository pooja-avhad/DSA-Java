public class MergeSort
{
   
    static void merge(int[] arr, int left, int mid, int right)
      {

      

        int[] temp = new int[right - left + 1];
        
        
        int i = left;
        int j = mid + 1;
        int k = 0;

        
        while(i <= mid && j <= right)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

       
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        
        for(int x = 0; x < k; x++)
        {
            arr[left + x] = temp[x];
        }
    }


   
    static void mergeSort(int[] arr, int left, int right)
    {
        
        if(left < right)
        {
            
            int mid = (left + right) / 2;

            
            mergeSort(arr, left, mid);

            
            mergeSort(arr, mid + 1, right);

            
            merge(arr, left, mid, right);
        }
    }


    public static void main(String[] args)
    {
        int[] arr = {7, 2, 5, 1};

        
        mergeSort(arr, 0, arr.length - 1);

       
        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}