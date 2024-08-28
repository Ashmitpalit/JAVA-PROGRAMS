// to change the case of each letter of the sentence
import java.util.*;
class Sent3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        char k,a,b;
        int i,len;
        System.out.print("Enter any sentence");
        sent=sc.nextLine();
        len=sent.length();
        for(i=0;i<len;i++)
        {
            k=sent.charAt(i);
            if(Character.isUpperCase(k))
            {
                a=Character.toUpperCase(k);
                x=x+a;
            }
            else if(Character.isLowerCase(k))
            {
                b=Character.toLowerCase(k);
                x=x+b;
            }
            x="";
        }
        System.out.print(x+" ");
    }
}
