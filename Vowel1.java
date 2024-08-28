// to count the number of vowels
import java.util.*;
class Vowel1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        char k;
        int i,len,c=0;
        System.out.print("Enter any sentence");
        sent=sc.nextLine();
        sent=sent.toUpperCase();
        len=sent.length();
        for(i=0;i<len;i++)
        {
            k=sent.charAt(i);
            if(k=='A'||k=='E'||k=='I'||k=='O'||k=='U')
            {
                c++;
            }
        }
        System.out.print("Number of vowels = "+c);
    }
}