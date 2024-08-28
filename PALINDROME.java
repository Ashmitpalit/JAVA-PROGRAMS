import java.util.*;
class PALINDROME
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="",rev="";
        int len,i;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        System.out.println("The Palindrome words are: ");
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            len=x.length();
            for(i=len-1;i>=0;i--)
            {
                rev=rev+(x.charAt(i));
            }
            if(x.equalsIgnoreCase(rev))
            {
                System.out.println(x);
            }
            rev="";
        }
    }
}