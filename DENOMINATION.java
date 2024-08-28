// to check the denomiantion
import java.util.*;
class DENOMINATION
{
    void check(int a)
    {
        int x,y;
        x=a/500;
        y=(a-(500*x))/50;
        System.out.println("500 x "+x+"="+(500*x));
        System.out.println("50 x "+y+"="+(50*y));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        DENOMINATION ob=new DENOMINATION();
        int a;
        System.out.println("Enter an amount");
        a=sc.nextInt();
        if(a<0 || a%50!=0)
        {
            System.out.println("Vul Val Value");
        }
        else
        {
            ob.check(a);
        }
    }
}