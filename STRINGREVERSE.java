// to reverse a string
import java.util.*;
class STRINGREVERSE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        int i,j,len;
        char k;
        System.out.print("Enter any String");
        sent=sc.nextLine();
        len=sent.length();
        for(i=0;i<len;i++)
        {
            k=sent.charAt(i);
            x=k+x;
        }
        System.out.print("The reversed String is=" + x );
    }
}