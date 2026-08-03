public class CheckSortedArray 
{
    public static void main(String[] args) 
    {
        int [] arr={10,20,30,40,50};
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i] > arr[i+1])
           {
              issorted=false;
              break;
           }
        }
        if(issorted)
        {
            System.out.println("Sorted Array");

            
        }
        else{
            System.out.println("Not Sorted Array");
        }
          
    }
}

