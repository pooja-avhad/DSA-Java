class SearchInsertPosition
{
int searchInsert(int[] arr, int target)
{
    int low = 0;
    int high = arr.length - 1;

    while(low <= high)
    {
        int mid = (low + high) / 2;

        if(arr[mid] == target)
        {
            return mid;
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

    return low;
}
   public static void main(String[] args) 
   {
     SearchInsertPosition obj=new SearchInsertPosition();
     int []arr={1,3,5,6};
       int target=4;
       
        int result = obj.searchInsert(arr, target);

        System.out.println("Insert Position = " + result);
   }
}