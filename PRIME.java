// to find whether a number is a prime number or not
import java.util.*;
class PRIME
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i,c=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}