// to remove vowel from a word
import java.util.*;
class Word1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String word,x="";
        char k;
        int i ,len;
        System.out.print("Enter and word");
        word=sc.next();
        word=word.toUpperCase();
        len=word.length();
        for(i=0;i<len;i++)
        {
           k=word.charAt(i);
           if(k=='A'||k=='E'||k=='I'||k=='O'||k=='U')
            {
                continue;
            }
            else
            {
                x=x+k;
            }
        }
        System.out.print(x);
    }
}