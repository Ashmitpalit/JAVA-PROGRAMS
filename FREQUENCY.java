// to print the frequency of a word in the string
import java.util.*;
class FREQUENCY
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,len,c=0,d=0;
        char k;
        String sent,x="",word="",word2="";
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
        System.out.println("Enter the first word to be searched");
        word=sc.next();
        System.out.println("Enter the second word to be searched");
        word2=sc.next();
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
                if(x.equals(word))
                {
                   c++;
                }
                else if(x.equals(word2))
                {
                   d++; 
                }
                x="";
            }
        }
        System.out.println("The word "+" '"+word+"' "+" "+"is repeated "+c+" "+"times");
        System.out.println("The word "+" '"+word2+"' "+ " "+"is repeated "+d+" "+"times");
    }
}