// to check whether a number is a prime number or not
import java.util.*;
class RecursePrime
{
    int num;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }
    int prime(int x)
    {
        int c=0;
        if(x>num)
        {
            if(c==2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(num%x==0)
            {
                c++;
            }
            return prime(x++);
        }
    }
    public static void main(String args[])
    {
        RecursePrime ob=new RecursePrime();
        if(ob.prime(1)==1)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is a composite number");
        }
    }
}