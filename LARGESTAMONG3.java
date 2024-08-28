// to find the largest among three numbers
import java.util.*;
class LARGESTAMONG3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        System.out.println("Enter the third number");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is the largest number");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is the largest number");
        }
        else
        {
            System.out.println("c is the largest number");
        }
    }
}