// to do a program
import java.util.*;
class Stack
{
    int s[];
    int top,max;
    Stack()
    {
        max=10;
        s=new int[max];
        top=-1;
    }
    Stack(int size)
    {
        max=size;
        s=new int[max];
        top=-1;
    }
    void push(int item)
    {
        if(top==(max-1))
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            s[top]=item;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Character popped is "+s[top]);
            top--;
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println(s[top]);
        }  
    }
    void displayStack()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Elements are");
            for(int i=top;i>=0;i--)
            {
               System.out.println((char)s[i]); 
            }
        }  
    }
    public static void main(String args[])
    {
        String name;
        char item;
        int i,len;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        len=name.length();
        Stack ob1=new Stack(len);
        for(i=0;i<len;i++)
        {
            ob1.push(name.charAt(i));
        }
        ob1.displayStack();
    }
}