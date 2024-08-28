// to check whether the number can be expressed in terms of sum of prime numbers
import java.util.*;
class SumOfPrime
{
    boolean checkPrime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
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
    void sumPrime(int x)
    {
        int i,s=x,f=0;
        String e="";
        for(i=(x/2)+1;i>1;i--)
        {
            if(checkPrime(i)==true)
            {
                s-=i;
                e=Integer.toString(i)+"+"+e;
                if(s==0)
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("It can be expressed in terms of prime numbers");
            System.out.println(e.substring(0,e.length()-1)+"="+x);
        }
        else
        {
            System.out.println("It cannot be expressed in terms of prime numbers");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        SumOfPrime ob=new SumOfPrime();
        ob.sumPrime(a);
    }
}