import java.util.*;
class Number2
{
    void factors(int n)
    {
        int i;
        System.out.println("The factors of "+n+" are:");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Number2 ob=new Number2();
        String num;
        int n1=0,n2=0;
        System.out.println("Enter a number");
        num=sc.nextLine();
        if(Integer.parseInt(num)>0)
        {
            if((num.length())!=4)
        {
            System.out.println("VUL VAL VALUE");
        }
        else
        {
            n1=Integer.parseInt(num.substring(0,2));
            n2=Integer.parseInt(num.substring(2));
            if(n1!=00)
            {
                ob.factors(n1);
            }
            else
            {
                System.out.println("Zero has no factors");
            }
            if(n2!=00)
            {
                ob.factors(n2);
            }
            else
            {
                System.out.println("Zero has no factors");
            }
        }
        }
        else if(Integer.parseInt(num)<0)
        {
            if((num.length())!=5)
        {
            System.out.println("VUL VAL VALUE");
        }
        else
        {
            n1=Integer.parseInt(num.substring(1,3));
            n2=Integer.parseInt(num.substring(3));
            System.out.println("Factors of a negative number -"+n1+" is not possible");
            if(n2!=00)
            {
                ob.factors(n2);
            }
            else
            {
                System.out.println("Zero has no factors");
            }
        }
        }
        else
        {
            System.out.println("Zero has no factors.Go study maths and come");
        }
    }
}