import java.util.*;
import java.lang.*;
class Kaprekar
{
    boolean checkKaprekar(int n,int a)
    {
        int f,l;
        int s;
        s=n*n;
        l=(int)(s%(Math.pow(10,a)));
        f=(int)(s/(Math.pow(10,a)));
        if((f+l)==n)
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
        Kaprekar ob=new Kaprekar();
        int i,p,q,c=0,l;
        System.out.println("Enter the lower limit");
        p=sc.nextInt();
        System.out.println("Enter the upper limit");
        q=sc.nextInt();
        if(p>q)
        {
            System.out.println("Invalid");
        }
        else if(p==q)
        {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("Kaprekar numbers are ");
            for(i=p;i<q;i++)
            {
                l=Integer.valueOf(Integer.toString(i).length());
                if(ob.checkKaprekar(i,l)==true)
                {
                    c++;
                    System.out.print(i+" ");
                }
            }
            if(c==0)
            {
                System.out.print("nil");
            }
            System.out.println();
            System.out.print("The frequency of kaprekar numbers are ="+c);
        }
    }
}