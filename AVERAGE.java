// to print a statement
import java.util.*;
class AVERAGE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,avg=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        avg=(n1+n2)/2;
        System.out.println(avg);
    }
}