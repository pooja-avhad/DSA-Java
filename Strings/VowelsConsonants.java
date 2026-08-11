public class VowelsConsonants 
{
    public static void main(String[] args) 
    {
        String s="hello";
        int vowlwsCount=0;
        int consonatCount=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                  vowlwsCount++;
            }
            else
             {
                consonatCount++;
            }
        }
        System.out.println("vowel="+vowlwsCount);
        System.out.println("consonat="+consonatCount);
    }
}
