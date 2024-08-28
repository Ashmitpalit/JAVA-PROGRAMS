// to check for proper parenthesis
import java.util.*;
class Parenthesis
{
    char a[];
    int max,top;
    Parenthesis(int m)
    {
        max=m;
        a=new char[max];
        top=-1;
    }
    void push(char item)
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
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            top--;
        }
    }
    boolean isStackEmpty()
    {
        if(top==-1)
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
        String exp;
        int i;
        char k;
        System.out.println("Enter the expression");
        exp=sc.nextLine();
        Parenthesis ob=new Parenthesis(exp.length());
        for(i=0;i<exp.length();i++)
        {
            k=exp.charAt(i);
            if(k=='(')
            {
               ob.push('(');
            }
            else if(k==')')
            {
                ob.pop();
            }
        }
        if(ob.isStackEmpty()==true)
        {
            System.out.println("It is a correct expression");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}