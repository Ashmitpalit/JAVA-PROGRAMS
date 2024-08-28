// to remove vowel from a word
import java.util.*;
class Word2
{
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        char k;
        int i ,len,c=0;
        System.out.print("Enter and sentence");
        sent=sc.nextLine();
        sent=sent.toUpperCase();
        len=sent.length();
        for(i=0;i<len;i++)
        {
           k=sent.charAt(i);
           if(k!=' ')
           {
               x=x+k;
            }
           else
           {
               if(x.charAt(0)=='A')
               {
                   c++;
               }
               x="";
            } 
        }
        System.out.println(sent);
        System.out.print("Number of word starting with A = "+c);
    }
}