public class SearchSortedArray 
{
    int Search(int[]arr,int target)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==target)
            {
               return  mid;
            }
            else if(target<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchSortedArray obj=new SearchSortedArray();

        int[]arr={2,5,8,12,16,23,38};
        int target=23;
        int result=obj.Search(arr, target);

        System.out.println("Target Index:"+result);
    }
}
