public class StringRotation 
{
    public static void main(String[] args) 
    {
        String s1="abcd";
        String s2="cdab";
        boolean result=false;

        if(s1.length()==s2.length())
        {
            String combined=s1+s2;
            result=combined.contains(s2);
        }
        System.out.println("Is Rotation="+result);
    }
}
