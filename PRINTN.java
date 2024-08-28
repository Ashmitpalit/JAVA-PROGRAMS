// to print all the numbers from 1 to 10
import java.util.*;
class PRINTN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the last number to be printed");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}