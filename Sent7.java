// tp print the first letter in upper case
import java.util.*;
class Sent7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,len;
        String sent,x="",y="";
        char k,a,b;
        System.out.print("Enter any Sentence");
        sent=sc.nextLine();
        sent=sent+" ";
        len=sent.length();
        for(i=0;i<len;i++)
        {
            k=sent.charAt(i);
            x=x+k;
            if(k==' ')
            {
                a=x.charAt(0);
                b=Character.toUpperCase(a);
                x=x.substring(1);
                y=b+x;
                System.out.print(y + "");
                x="";
                y="";
            }
        }
    }
}