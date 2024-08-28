// to check whether krishnamurthy number or not
import java.util.*;
class Krishnamurthy
{
    public static int factorial(int x)
    {
        int f=1,i;
        for(i=1;i<=x;i++)
        {
            f*=i;
        }
        return f;
    }
    public static boolean isKrishnamurthy(int a)
    {
        int ld=0,s=0,temp=a;
        while(a!=0)
        {
          ld=a%10;
          s+=factorial(ld);
          a/=10;
        }
        if(s==temp)
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
        Scanner sc= new Scanner(System.in);
        Krishnamurthy k=new Krishnamurthy();
        int n;
        System.out.print("Enter any number");
        n=sc.nextInt();
        if(k.isKrishnamurthy(n)==true)
        {
            System.out.print(n + " is a krishnamurthy number");
        }
        else
        {
            System.out.print(n + " is not a krishnamurthy number");
        }
    }
}