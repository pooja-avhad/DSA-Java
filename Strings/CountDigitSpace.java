public class CountDigitSpace 
{
    public static void main(String[] args) 
    {
        String s= "java 123 code";
        int countdigit=0;
        int countspace=0;

        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch>='0' && ch<='9')
            {
                countdigit++;
            }
            else if(ch==' ')
            {
                countspace++;
            }
        }
        System.out.println("COunt Digit="+countdigit);
        System.out.println("Count Space="+countspace);
    }
}
