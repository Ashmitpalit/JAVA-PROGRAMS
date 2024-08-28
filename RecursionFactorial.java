// to find factorial of a number using recursion
import java.util.*;
class RecursionFactorial
{
    int factorial(int x)
    {
        if(x==1)
        {
            return 1;
        }
        else
        {
            return (x*(factorial(x-1)));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        RecursionFactorial ob=new RecursionFactorial();
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("The factorial is = "+ob.factorial(n));
    }
}