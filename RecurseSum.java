// to find factorial of a number using recursion
import java.util.*;
class RecurseSum
{
    int s=0;
    int sum(int x)
    {
        if(x>=1)
        {
            s=x+sum(x-1);
            return s;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        RecurseSum ob=new RecurseSum();
        int n;
        System.out.println("Enter the upper limit");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Sum is = "+ob.sum(n));
        }
        else
        {
            System.out.println("Sum is = -"+(ob.sum(Math.abs(n))-1));
        }
    }
}