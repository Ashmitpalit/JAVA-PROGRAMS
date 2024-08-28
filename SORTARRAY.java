// to sort an array row wise
import java.util.*;
class SORTARRAY
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k,min,curr_index,min_index=0,l,temp,x,y;
        System.out.println("Enter the dimensions of the matrix");
        m=sc.nextInt();
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
        System.out.println("The Matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"       ");
            }
            System.out.println();
        }
        int sort[]=new int[n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sort[j]=a[i][j];
            }
            for(k=0;k<n;k++)
            {
               min=sort[k];
               curr_index=k;
               for(l=curr_index+1;l<n;l++)
               {
                  if(sort[l]<min)
                  {
                     min=sort[l];
                     min_index=l;
                  }
               }
               temp=sort[curr_index];
               sort[curr_index]=sort[min_index];
               sort[min_index]=temp;
            }
            for(x=0;x<n;x++)
            {
                System.out.print(sort[x]+"   ");
            }
            System.out.println();
             /* for(y=0;y<n;y++)
                {
                   b[i][y]=sort[y]; 
                }*/
            
        }
        /*System.out.println("The Sorted Matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"       ");
            }
            System.out.println();
        }*/
    }
}