// to find the sum
import java.util.*;
class SUM_MATRIX
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,sum=0,max=0,min=0;
        System.out.println("Enter the dimension of Matrix A");
        m=sc.nextInt();
        System.out.println("Enter the dimension of Matrix B");
        n=sc.nextInt();
        int a[][]= new int[m][m];
        int b[][]= new int[n][n];
        System.out.println("Enter the elements in Matrix A");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements in Matrix B");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A and B");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            if(a[i][2-i]>max)
            {
                max=a[i][2-i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(b[i][i]<min)
            {
                min=a[i][i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        sum=max+min;
        System.out.println("Sum is ="+sum);
    }
}