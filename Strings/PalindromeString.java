public class PalindromeString 
{
    public static void main(String[] args)
     {
        String s="Madam";
        int left=0;
        int right=s.length()-1;
        boolean IsPalindrome=true;

        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                IsPalindrome=false;
                break;
            }
              left++;
              right--;
        }
        if(IsPalindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
