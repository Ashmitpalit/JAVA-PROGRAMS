// to check whether two numbers are twin prime numbers or not
import java.util.*;
class TWINPRIME
{
    boolean isPrime(int x)
    {
        int i,c=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean checkDifference(int a, int b)
    {
        if((a-b)==2 || (b-a)==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        TWINPRIME ob=new TWINPRIME();
        int n1,n2;
        System.out.println("Enter the first number");
        n1=sc.nextInt();
        System.out.println("Enter the second number");
        n2=sc.nextInt();
        if(ob.isPrime(n1)==true && ob.isPrime(n2)==true)
        {
            if(ob.checkDifference(n1,n2)==true)
            {
                System.out.println("They are Twin Prime numbers");
            }
            else
            {
                System.out.println("They are not Twin Prime numbers");
            }
        }
        else
        {
                System.out.println("They are not Twin Prime numbers");
        }
    }
}