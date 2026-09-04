class StringCompression
{
    public static void main(String[] args)
     {
        String s = "aaabbc";
        StringBuilder result = new StringBuilder();
        

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int count=0;
            while(i < s.length() && s.charAt(i) == ch)
            {
                count++;
                i++;
            }

            result.append(ch);
            result.append(count);
        }

        System.out.println("Compressed String = " + result);
        }
        
    }


    