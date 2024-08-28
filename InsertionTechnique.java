import java.util.*;
class InsertionTechnique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,key;
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
           key=a[i];
           j=i-1;
           while(j>=0 && a[j]>key)
           {
               a[j+1]=a[i];
               j=j-1;
           }
           a[j+1]=key;
        }
        System.out.println("Sorted array is :");
        for(i=0;i<n;i++)
        {
           System.out.print(a[i] +", ");
        }
    }
}