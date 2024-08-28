/*
 * To print the number of armstrong numbers within a certain range
 */
import java.util.*;
class NumberofArmstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,temp,ld,sum=0,limit,i;
        System.out.println("Enter the limit");
        limit=sc.nextInt();
        for(i=1;i<=limit;i++)
        {
            temp=i;
            while(temp!=0)
            {
                ld=temp%10;
                sum=sum+(ld*ld*ld);
                temp=temp/10;
            }
            if(sum==i)
            {
                System.out.println(sum);
            }
            sum=0;
        }
    }
}