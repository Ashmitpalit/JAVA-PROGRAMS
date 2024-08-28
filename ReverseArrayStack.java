// to reverse an array
import java.util.*;
class ReverseArrayStack
{
    int a[];
    int max,top;
    ReverseArrayStack(int m)
    {
        max=m;
        a=new int[max];
        top=-1;
    }
    void push(int item)
    {
        if(top==max-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            a[top]=item;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -9999;
        }
        else
        {
            int s;
            s=a[top];
            top--;
            return s; 
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int lim,i,k;
        System.out.println("Enter the size of the array");
        lim=sc.nextInt();
        int b[]=new int[lim];
        ReverseArrayStack ob=new ReverseArrayStack(lim);
        System.out.println("Enter the elements in the array");
        for(i=0;i<lim;i++)
        {
            k=sc.nextInt();
            ob.push(k);
        }
        System.out.println("The Reversed array");
        for(i=0;i<lim;i++)
        {
            b[i]=ob.pop();
        }
        for(i=0;i<lim;i++)
        {
            System.out.println(b[i]);
        }
    }
}