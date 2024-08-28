// to print the palindrome words in the sentence
import java.util.*;
class PALINDROME2
{
  void checkPalin(String x)
    {
       StringTokenizer st=new StringTokenizer(x," .");
       String a="",b="";
       char k;
       int i;
       while(st.hasMoreTokens())
       {
            a=st.nextToken();
            for(i=0;i<a.length();i++)
            {
               k=a.charAt(i);
               b=k+b;
            }
            if(a.equalsIgnoreCase(b))
            {
               System.out.println(a);
            }
       }
    }
  public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);
        String sent;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        System.out.println("The Palindrome words are: ");
        PALINDROME2 ob=new PALINDROME2();
        ob.checkPalin(sent);
  }
}