// to perform a linear search
import java.util.*;
class LINEARSEARCH
{
    String pos="";
    boolean LinearSearch(int a[],int x,int n)
    {
        int c=0;
        for(int i=0;i<x;i++)
        {
            if(a[i]==n)
            {
               c++;
               if(i==(x-1))
               {
                  pos=pos+Integer.toString(i+1)+"."; 
               }
               else
               {
                   pos=pos+Integer.toString(i+1)+",";
               }
            }
        }
        if(c>=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LINEARSEARCH ob=new LINEARSEARCH();
        int n,x;
        System.out.println("Enter the length of the array");
        x=sc.nextInt();
        int a[]=new int[x];
        System.out.println("Enter the value in the array");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        n=sc.nextInt();
        if(ob.LinearSearch(a,x,n)==true)
        {
           System.out.println("Item found at position(s) "+ob.pos);
        }
        else
        {
            System.out.println("Item Not Found!!!");
        }
    }
} 