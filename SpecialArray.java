import java.util.*;
import java.lang.*;
class SpecialArray
{
    int a[];
    int size;
    SpecialArray()
    {
        size=100;
        a=new int[size];
    }
    SpecialArray(int n)
    {
        size=n;
        a=new int[size];
    }
    int getElement(int index)
    {
        int b;
        if(index<0)
        {
           b=Math.abs(index)%(size);
           return a[b];
        }
        else if(index>(size))
        {
            b=index%(size);
            return a[b];
        }
        else
        {
           return a[index]; 
        }
    }
    void insert(int item,int index)
    {
       int b=0;
       if(index<0)
       {
           b=Math.abs(index)%(size);
           a[size-b]=item;
       }
       else if(index>(size-1))
       {
            b=index%(size);
            a[b]=item;
       }
       else
       {
            a[b]=item; 
       }
    }
    void display()
    {
        int i;
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        SpecialArray ob=new SpecialArray(5);
        Scanner sc=new Scanner(System.in);
        int i,element,it;
        System.out.println("Enter the desired index");
        i=sc.nextInt();
        System.out.println("Enter the desired element");
        element=sc.nextInt();
        ob.insert(element,i);
        System.out.println("Enter the desired index you want to view");
        it=sc.nextInt();
        System.out.println("The element is = "+ob.getElement(it));
        ob.display();
    }
}