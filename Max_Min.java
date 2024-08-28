// to print the maximum and minimum
import java.util.*;
class Max_Min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max=0,min=0;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values in the array");
        for(i=0;i<n;n++)
        {
           a[i]=sc.nextInt();
        }
        max=min=a[0];
        for(i=0;i<n;n++)
        {
           if(a[i]>=max)
           {
               max=a[i];
            }
           else
           {
               min=a[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.print("Min = "+min);
    }
}