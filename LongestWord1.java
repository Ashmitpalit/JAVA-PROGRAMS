// to find the longest word
import java.util.*;
class LongestWord1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="",y="";;
        int len,max=0;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        while(st.hasMoreTokens())
        {
           x=st.nextToken();
           len=x.length();
           if(len>=max)
           {
               max=len;
               y=x;
           }
        }
        System.out.println("The longest word/words is/are = "+ y);
    }
}