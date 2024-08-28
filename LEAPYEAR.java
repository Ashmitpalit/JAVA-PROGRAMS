// to check whether a year is a leap year or not
import java.util.*;
class LEAPYEAR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}