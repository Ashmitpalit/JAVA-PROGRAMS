import java.util.*;
class OddSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}