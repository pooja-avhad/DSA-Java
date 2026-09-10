public class FirstLastOccurrence
{
    int firstOccurrence(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == target)
            {
                answer = mid;
                high = mid - 1;   // LEFT side
            }
            else if(target < arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return answer;
    }

    int lastOccurrence(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == target)
            {
                answer = mid;
                low = mid + 1;    // RIGHT side
            }
            else if(target < arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        FirstLastOccurrence obj = new FirstLastOccurrence();

        int[] arr = {1, 2, 2, 2, 5, 7};
        int target = 2;

        int first = obj.firstOccurrence(arr, target);
        int last = obj.lastOccurrence(arr, target);

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
    }
}
