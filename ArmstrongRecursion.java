import java.util.*;
class ArmstrongRecursion
{
    int arm(int n)
    {
        int sum=0,ld;
        if(n==0)
        {
            return sum;
        }
        else
        {
            ld=n%10;
            sum+=(ld*ld*ld);
            return arm(n/10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArmstrongRecursion ob=new ArmstrongRecursion();
        int x;
        System.out.println("Enter a number");
        x=sc.nextInt();
        if(ob.arm(x)==x)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }
    }
}