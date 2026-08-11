class ReverseString
{
    public static void main(String[] args) 
    {
        String s="java";
        for(int i=s.length()-1; i>=0;i-- )
        {
                System.err.print(s.charAt(i));
        }
    }
}