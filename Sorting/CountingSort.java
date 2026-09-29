public class CountingSort
{
    public static void main(String[] args)
    {
        int[] arr = {3, 1, 3, 2, 1};

        
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        
        int[] count = new int[max + 1];

        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }

        
        int index = 0;

        for(int i = 0; i < count.length; i++)
        {
            while(count[i] > 0)
            {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

        
        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}