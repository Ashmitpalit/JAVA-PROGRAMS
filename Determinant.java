// to find the determinant of a 3x3 matrix
import java.util.*;
class Determinant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,d;
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        d=(a[0][0]*((a[1][1]*a[2][2])-(a[2][1]*a[1][2])))
        -(a[0][1]*((a[1][0]*a[2][2])-(a[2][0]*a[1][2])))
        +(a[0][2]*((a[1][0]*a[2][1])-(a[2][0]*a[1][1])));
        System.out.println("The determinant is ="+d);
    }
}