// to find the number of palindrome words
import java.util.*;
class PalindromeWords
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="",rev="";
        int len,i,c=0;
        char k;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        System.out.print("Number of palindrome words are: ");
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            len=x.length();
            for(i=0;i<len;i++)
            {
               k=x.charAt(i);
               rev=k+rev;
            }
            if(x.equalsIgnoreCase(rev))
            {
                c++;
            }
            rev="";
        }
        System.out.print(c);
    }
}