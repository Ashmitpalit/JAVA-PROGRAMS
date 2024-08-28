// to swap two variable without using third variable
import java.util.*;
class SWAP2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of A");
        a=sc.nextInt();
        System.out.println("Enter the value of B");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of A is : "+a+" Value of B is : "+b);
    }
}