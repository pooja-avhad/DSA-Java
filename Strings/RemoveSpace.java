class StringRemoveSpace
{
    public static void main(String[] args) 
    {
        String s="Java Full Stack";
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch !=' ')
            {
                result=result+ch;
            }
        }
        System.out.println("Original="+s);
        System.out.println("After Removing Space="+result);
    }
}