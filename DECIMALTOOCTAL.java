// TO COVERTA DECIMAL NUMBER TO OCTAL USING RECURSION
import java.util.*;
class DECIMALTOOCTAL
{
    String octal="",frac="";
    void toOctal(int n)
    {// calculates the equivalent octal number of the integer part of the decimal number
        int d;
        if(n!=0)
        {
            d=n%8;
            octal=Integer.toString(d)+octal;
            toOctal(n/8);
        }
    }
    void fractional(double n,int count)
    {// calculates the equivalent octal number of the fractional part of the decimal number
        double res=0.0;
        int d=0;
        if(count>0)
        {
            res=n*8;
            d=(int)res;
            frac+=Integer.toString(d);
            fractional((res-d),count-1);
        }
    }
    void display()
    {// displays the euivalent octal number of the entered decimal number
        System.out.println("The equivalent octal number is "+octal+"."+frac);
    }
    public static void main(String args[])
    {// start of main method
        Scanner sc=new Scanner(System.in);
        DECIMALTOOCTAL ob=new DECIMALTOOCTAL();
        double n,f;
        int a;
        System.out.println("Enter a decimal number");
        n=sc.nextDouble();
        a=(int)n;
        f=n-a;
        ob.toOctal(a);
        ob.fractional(f,5);
        ob.display();
    }// close of main method
}// close of class