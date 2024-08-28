// to solve an equation of (a+b) whole square
import java.util.*;
class EQUATION2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        double c;
        System.out.println("Enter the value of A");
        a=sc.nextInt();
        System.out.println("Enter the value of B");
        b=sc.nextInt();
        c=(a+b)/(a-b);
        System.out.println("The value is = "+c);
    }
}