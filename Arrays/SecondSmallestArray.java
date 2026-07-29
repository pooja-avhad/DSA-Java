public class SecondSmallestArray
{
    public static void main(String[] args)
    {
        int arr[] = {10,50,30,90,20};

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != smallest)
            {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}