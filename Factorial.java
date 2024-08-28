// to perform permutation and recursion
import java.util.*;
class Factorial
{
    int fact(int x)
    {
        if(x==1)
        {
            return 1;
        }
        else
        {
            return x*fact(x-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        Factorial ob=new Factorial();
        System.out.println("The factorial is ="+ob.fact(n));
    }
}