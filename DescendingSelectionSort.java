// form descending selection sort
import java.util.*;
class DescendingSelectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array");
        int l,i,j,max,f,m;
        l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements in the array");
        for(i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<l;i++)
        {
            max=a[i];
            f=i;
            for(j=f;j<l;j++)
            {
               if(a[l]>max)
               {
                  max=a[l];
                  m=l;
               }
            }
        }
    }
}