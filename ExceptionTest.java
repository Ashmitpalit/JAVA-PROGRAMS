// to test an exception
import java.util.*;
class ExceptionTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int n;
        int a[]={1,2,3};
        try
        {
           n=sc.nextInt();
           System.out.println(a[4]);
        }
        catch(InputMismatchException e)
        {
           System.out.print("Only enter an integer"); 
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Vul Val Index"); 
        }
    }
}