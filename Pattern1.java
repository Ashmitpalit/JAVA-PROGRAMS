// to print a pattern
import java.util.*;
class Pattern1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String word;
        System.out.print("Enter any 4 letter word");
        word=sc.next();
        word=word.toUpperCase();
        int i,j,len;
        len=word.length();
        for(i=0;i<=4;i++)
        {
           for(j=0;j<=i;j++)
           {
             System.out.print(word.charAt(j)+" ");  
           }
           System.out.println();
        }
    }
}