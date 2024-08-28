import java.util.*;
class BinaryRecursion
{
    static boolean bin(int x,int ar[],int a,int b)
    {
        int u,l,mid,f=0;
        l=a;u=b;
        while(l<u)
        {
            mid=(l+u)/2;
            if(x>mid)
            {
                bin(x,ar,mid+1,u);
            }
            if(x<mid)
            {
                bin(x,ar,l,mid-1);
            }
            if(x==mid)
            {
                f=1;
            }
        }
        if(f==1)
        {
           return true; 
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {// start of main method
        Scanner sc=new Scanner(System.in);
        int n,i,item;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int a[]=new int[n]; 
        System.out.println("Enter the elements in the array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the item to be searched");
        item=sc.nextInt();
        if(bin(item,a,0,n)==true)
        {
            System.out.print("The item is present");
        }
        else
        {
            System.out.print("The item is not present");
        }
    }// close of main method
}// close of class