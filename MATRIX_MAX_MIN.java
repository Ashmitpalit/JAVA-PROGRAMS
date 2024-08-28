// to find the maximum element in right diagonal and minimum element in left diagonal
import java.util.*;
class MATRIX_MAX_MIN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,max,min;
        System.out.println("Enter the dimension of the matrix");
        n=sc.nextInt();
        int m[][]= new int[n][n];
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        max=m[0][0];
        for(i=0;i<n;i++)
        {
           if(m[i][i]>max)
           {
               max=m[i][i];
           }
        }
        min=m[0][2];
        for(i=0;i<n;i++)
        {
           if(m[i][2-i]<min)
           {
               min=m[i][2-i];
           }
        }
        System.out.println("The max element in the right diagonal is ="+max);
        System.out.println("The min element in the left diagonal is ="+min);
    }
}