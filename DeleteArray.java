// to delete a value in an array
import java.util.*;
class DeleteArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,c,i,n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values in the array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the position in the array to be deleted");
        p=sc.nextInt();
        if (p >= n+1)
        {
            System.out.println("Deletion is not possible");
        }
        else
        {
            for (c = p - 1; c < n - 1; c++)
            {
                a[c] = a[c+1];
            }
            System.out.println("The resultant array is");
            for (c = 0; c < n - 1; c++)
            {
                System.out.println(a[c]);
            }
        }
    }
}