import java.util.*;
class PRIMEFACTORS
{
    void prime(int a)
    {
        int i,c=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(a);
        }
    }
    void factors(int a)
    {
        int i;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                prime(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PRIMEFACTORS ob=new PRIMEFACTORS();
        System.out.println("Enter any number");
        int n;
        n=sc.nextInt();
        System.out.println("The Prime Factors are");
        ob.factors(n);
    }
}