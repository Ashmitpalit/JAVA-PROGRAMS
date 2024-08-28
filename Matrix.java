// to prin the sum of rows and columns in a matrix
import java.util.*;
class Matrix
{
    int row,col;
    int a[][];
    void input()
    {// entering the number of rows and columns of the matrix and also the values in the matrix
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number of rows to be present in the matrix");
        row=sc.nextInt();
        System.out.println("Enter the number of columns to be present in the matrix");
        col=sc.nextInt();
        a=new int[row][col];
        System.out.println("Enter the values in the matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    void maxrow(int n)
    {// calculate the maximum of particular row
        int i,j,max=a[n][0];
        for(i=0;i<col;i++)
        {
            if(a[n][i]>max)
            {
                max=a[n][i];
            }
        }
        System.out.println("The maximum element is row "+n+" is =" +max);
    }
    void maxcol(int n)
    {// calculate the maximum of particular column
        int i,j,max=a[0][n];
        for(i=0;i<row;i++)
        {
            if(a[i][n]>max)
            {
                max=a[i][n];
            }
        }
        System.out.println("The maximum element is column "+n+" is =" +max);
     }
    void minrow(int n)
    {// calculate the minimum of particular row
        int i,j,min=a[n][0];
        for(i=0;i<col;i++)
        {
            if(a[n][i]<min)
            {
                min=a[n][i];
            }
        }
        System.out.println("The minimum element is row "+n+" is =" +min);
    }
    void mincol(int n)
    {// calculate the minimum of particular column
        int i,j,min=a[0][n];
        for(i=0;i<row;i++)
        {
            if(a[i][n]<min)
            {
                min=a[i][n];
            }
        }
        System.out.println("The minimum element is column "+n+" is =" +min);
     }
    void displayMatrix()
    {// display the entered matrix
        int i,j;
        System.out.println("The matrix you entered is ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {// start of main method
        Scanner sc=new Scanner(System.in);
        Matrix ob=new Matrix();
        int r1,r2,c1,c2;
        ob.input();
        ob.displayMatrix();
        System.out.println("Which row's maximum do you want to calculate(Numbering starts from 0)");
        r1=sc.nextInt();
        ob.maxrow(r1);
        System.out.println("Which row's minimum do you want to calculate(Numbering starts from 0)");
        r2=sc.nextInt();
        ob.minrow(r2);
        System.out.println("Which columns's maximum do you want to calculate(Numbering starts from 0)");
        c1=sc.nextInt();
        ob.maxcol(c1);
        System.out.println("Which columns's minimum do you want to calculate(Numbering starts from 0)");
        c2=sc.nextInt();
        ob.mincol(c2);
    }// close of main method
}// close of class