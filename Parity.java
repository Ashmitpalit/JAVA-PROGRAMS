// to check even or odd parity
import java.util.*;
class Parity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%2;
            if(r==1)
            {
                c++;
            }
            n/=2;
        }
        if(c%2==0)
        {
            System.out.println("It is of even parity");
        }
        else
        {
            System.out.println("It is of odd parity");
        }
    }
}