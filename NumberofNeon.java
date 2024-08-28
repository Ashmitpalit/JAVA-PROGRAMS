/*
 * To print the number of neon numbers within a certain range
 */
import java.util.*;
class NumberofNeon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,ld,sum=0,limit,i,sq;
        System.out.println("Enter the limit");
        limit=sc.nextInt();
        for(i=1;i<=limit;i++)
        {
            sq=i*i;
            while(sq!=0)
            {
                ld=sq%10;
                sum=sum+ld;
                sq=sq/10;
            }
            if(sum==i)
            {
                System.out.println(sum);
            }
            sum=0;
        }
    }
}