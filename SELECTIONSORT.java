// to perform selection sorting
import java.util.*;
class SELECTIONSORT
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int len,i,j,min,curr_index,min_index=0,temp;
        System.out.println("Enter the length of the array");
        len=sc.nextInt();
        int a[]=new int[len];
        System.out.println("Enter elements in the array");
        for(i=0;i<len;i++)
        {
           a[i]=sc.nextInt(); 
        }
        for(i=0;i<len-1;i++)
        {
           min=a[i];
           min_index=i;
           curr_index=i;
           for(j=curr_index+1;j<len;j++)
           {
              if(a[j]<min)
              {
                  min=a[j];
                  min_index=j;
                }
           }
           if(min_index!=curr_index)
           {
             temp=a[curr_index];
             a[curr_index]=a[min_index];
             a[min_index]=temp;
           }
        }
        System.out.println("The sorted array is");
        for(i=0;i<len;i++)
        {
           System.out.println(a[i]); 
        }
    }
}