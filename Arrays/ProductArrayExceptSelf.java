class  ProductArrayExceptSelf
{
    public static void main(String[] args) 
    {
        int [] arr={1,2,3,4};
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int product=1;
            for (int j=0;j<arr.length;j++)
            {
                if(i !=j)
                {
                   product=product*arr[j];
                }
            }
        
        System.out.println(result[i]=product);
        }
        for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i] + " ");
    }
        
    }
}