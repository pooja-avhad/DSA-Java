public class FindMinimum 
{
    public static void main(String[] args) 
    {
        int[]arr={20,40,50,60};
        int min=arr[0];
        for(int i=1;i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimun Number:"+min);
    }
}
