// to print first name and surname
import java.util.*;
class Name1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String sent,x="",b;
        char k;
        int i,a,len;
        System.out.print("Enter your full name");
        sent=sc.nextLine();
        a=sent.lastIndexOf(' ');
        b=sent.substring(a+1);
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
                System.out.print(x + " ");
                break;
            }
        }
        System.out.print(b);
    }
}