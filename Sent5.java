// to check whether a word is present in a sentence or not
import java.util.*;
class Sent5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,word,x="";
        char k;
        int i,len,c=0;
        System.out.println("Enter any sentence");
        sent=sc.nextLine();
        System.out.println("Enter the word to be checked");
        word=sc.next();
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
                if(x.equals(word)==true)
                {
                    c++;
                    System.out.print(x+" ");
                    x="";
                }
                else
                {
                   System.out.print(x+" ");
                   x=""; 
                }
            }
        }
        System.out.print("\n");
        System.out.print("The number of times the word"+"'"+word+"'"+"is repeated ="+c);
    }
}