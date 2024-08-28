// to check whether neon number or not
import java.util.*;
class NEON
{
    boolean calNeon(int x)
    {
        int sq,ld,sum=0;
        sq=(x*x);
        while(sq!=0)
        {
           ld=sq%10; 
           sum+=ld;
           sq/=10;
        }
        return x==sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number");
        n=sc.nextInt();
        NEON ne=new NEON();
        if(ne.calNeon(n)==true)
        {
            System.out.println("It is a NEON number");
        }
        else
        {
            System.out.println("It is not a NEON number");
        }
    }
}