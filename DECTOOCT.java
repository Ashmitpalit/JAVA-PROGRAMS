// to convert a decimal number to octal
import java.util.*;
class DECTOOCT
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        String y;
        System.out.print("Enter any decimal number");
        n=sc.nextInt();
        String oct="";
        while(n!=0)
        {
          a=n%8;
          y=Integer.toString(a);
          oct=y+oct;
          n/=8;
        }
        System.out.print(oct);
    }
}