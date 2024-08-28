// to convert a number from decimal to binary
import java.util.*;
class DECTOBIN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        String y;
        System.out.print("Enter any Number");
        n=sc.nextInt();
        String bin="";
        while(n!=0)
        {
           a=n%2;
           y=Integer.toString(a);
           bin=y+bin;
           n/=2;
        }
        System.out.print(bin);
    }
}
