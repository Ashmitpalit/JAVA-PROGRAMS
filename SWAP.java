// to swap two numbers
import java.util.*;
class SWAP
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,c;
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        c=num2;
        num2=num1;
        num1=c;
        System.out.println("After swaping");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}