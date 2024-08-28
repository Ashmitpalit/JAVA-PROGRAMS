// to check if the number is a series number or not
import java.util.*;
class SeriesNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i=0,c=0;
        boolean f;
        f=false;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           c+=i;
           if(c==n)
           {
               f=true;
               break;
           }
        }
        if(f==true)
        {
            System.out.println("It is a Series Number");
        }
        else
        {
            System.out.println("It is not a Series Number");
        }
    }
}