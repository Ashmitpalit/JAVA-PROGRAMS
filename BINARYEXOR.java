// to convert binary value to EXOR
import java.util.*;
class BINARYEXOR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter the two binary values");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1 && b==1)
        {
            c=0;
        }
        else if(a==1 && b==0 || a==0 && b==1)
        {
            c=1;
        }
        else if(a==0 && b==0)
        {
            c=0;
        }
        System.out.print("The output is "+c);
    }
}