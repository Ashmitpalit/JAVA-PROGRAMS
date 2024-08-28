// to check how many times the word is repeated in the sentence
import java.util.*;
class Sent6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,word,x="";
        char k,p;
        int i,len1,len2,j,c=1,a=0;
        System.out.println("Enter any sentence");
        sent=sc.nextLine();
        System.out.println("Enter the word to be checked");
        word=sc.next();
        len1=sent.length();
        len2=word.length();
        for(i=0;i<len1;i++)
        {
           k=sent.charAt(i);
           if(k!=' ')
           {
             for(j=0;j<len2;j++)
              {
                p=word.charAt(j);
                if(k!=p)
                {
                    c=1;break;
                }
              }
              //System.out.println("Hit"+c);
             if(c==0)
                {
                   a++;
                   c=1;
                }
           }
        }
        System.out.print("\n");
        System.out.print("The number of times the word"+" "+word+" "+"is repeated is ="+a);
    }
}