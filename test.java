// to sort the elements of an array in descending order using bubble sort technique
import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,temp=0;
        System.out.println("Enter the length of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter your elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<(n-i);j++)
            {
                if(a[j-1]<a[j])
                {
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;  
                }  
            }  
        }
        System.out.println("Your sorted elements are ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}