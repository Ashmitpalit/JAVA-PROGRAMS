import java.util.*;
class ReverseArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the length of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        Stack f=new Stack(n);
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            f.push(a[i]);
        }
        f.displayStack();
    }
}