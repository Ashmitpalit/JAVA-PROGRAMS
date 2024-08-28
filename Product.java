// to find the product
import java.util.*;
class Product
{
    static int p=1;
    static void func(int n)
    {
        if(n!=0)
        {
         int d=n%10;
         p*=d;
         func(n/10);
        }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any number"); 
       int a=sc.nextInt();
       func(a);
       System.out.println("The product is = "+ p);
    }
}