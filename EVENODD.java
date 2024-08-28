// to check whether the number is odd or even 
import java.util.*;
class EVENODD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("It is an even number");
        }
        else
        {
            System.out.println("It is an odd number");
        }
    }
}