// to find the transpose of a metrix using stack
import java.util.*;
class Transpose
{
    int max,top;
    int s[];
    Transpose()
    {
        max=100;
        s=new int[max];
        top=-1;
    }
    Transpose(int size)
    {
        max=size;
        s=new int[max];
        top=-1;
    }
    void push(int item)
    {
            top++;
            s[top]=item;
    }
    int pop()
    {
            return s[top--];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Transpose ob=new Transpose();
        int m,n,i,j;
        System.out.println("Enter the number of rows");
        m=sc.nextInt();
        System.out.println("Enter the number of columns");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("Enter the values in the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Original Matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ob.push(a[i][j]);
            }
        }
        for(i=m-1;i>=0;i--)
        {
            for(j=n-1;j>=0;j--)
            {
                b[j][i]=ob.pop();
            }
        }
        System.out.println("The Transpose");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}