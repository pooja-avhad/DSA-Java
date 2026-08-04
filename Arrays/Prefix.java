public class Prefix 
{
    public static void main(String[] args) 
    {
        int []arr={1,2,3,4};
        int[]result=new int[arr.length];
        result[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            result[i]=result[i-1]* arr[i-1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(result[i]+ " ");
        }

    }
}
