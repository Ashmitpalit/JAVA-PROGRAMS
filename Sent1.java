// to do a program
import java.util.*;
class Sent1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        char k,a;
        int i,len;
        System.out.print("Enter any sentence");
        sent=sc.nextLine();
        sent=sent + " " ;
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
              System.out.print(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
              x="";
            }
        }
    }
}