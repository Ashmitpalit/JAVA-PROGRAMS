// to replace a particular word
import java.util.*;
class ReplaceWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x,y,w="";
        char k;
        int i,len,c=0;
        System.out.println("Enter a string");
        sent=sc.nextLine();
        System.out.println("Enter the word to be replaced");
        x=sc.nextLine();
        StringTokenizer se=new StringTokenizer(sent);
        while(se.hasMoreTokens())
        {
            w=se.nextToken();
            if(w.equalsIgnoreCase(x))
            {
                c++; 
            }
        }
        w="";
        if(c==0)
        {
            System.out.println("The word is not present in the sentence");
        }
        else
        {
            System.out.println("Enter the word to be replaced by");
            y=sc.nextLine();
            sent=sent.trim();
            len=sent.length();
            System.out.println("The modified sentence is");
            StringTokenizer st=new StringTokenizer(sent,". ?");
            while(st.hasMoreTokens())
            {
                w=st.nextToken();
                if(w.equalsIgnoreCase(x))
                {
                    w=y;
                }
                System.out.print(w+" ");
            }
        }
    }
}