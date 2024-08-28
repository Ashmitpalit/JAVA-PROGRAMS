// to check the validity of an ISBN number
import java.util.*;
class ISBN
{
    boolean checkISBN(String x)
    {
        int i,sum=0,j=10;
        int ch;
        for(i=0;i<9;i++)
        {
           ch=x.charAt(i)-'0';
           sum+=(ch*j);
           j--;
        }
        if(x.charAt(9)=='X' || x.charAt(9)=='x')
        {
           sum+=10; 
        }
        else
        {
            sum=x.charAt(9)-'0';
        }
        if(sum%11==0)
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
        String ISBN;
        System.out.println("Enter any ISBN number");
        ISBN=sc.nextLine();
        ISBN ob=new ISBN();
        if(ob.checkISBN(ISBN)==true)
        {
            System.out.println("It is a valid ISBN number");
        }
        else
        {
            System.out.println("It is not a valid ISBN number");
        }
    }
}