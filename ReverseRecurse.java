// to reverse a number using recursion
import java.util.*;
class ReverseRecurse
{
    int reverse(int n)
    {
        int rev=0,ld;
        if(n==0)
        {
            return rev;
        }
        else
        {
            ld=n%10;
            rev=rev*10+ld;
            return reverse(n/10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number");
        x=sc.nextInt();
        ReverseRecurse ob=new ReverseRecurse();
        System.out.println("The reverse is ="+ob.reverse(x));
    }
}