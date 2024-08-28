// to print the words in even positions
import java.util.*;
class EVENPOSITIONS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="";;
        int c=0,i;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        while(st.hasMoreTokens())
        {
           x=st.nextToken();
           c++;
           if(c%2==0)
           {
                System.out.println(x); 
           }
        } 
    }
}