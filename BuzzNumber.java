/*
 * Buzz number is a number which is either divisible by 7 or which ends by 7
 * Example :
 * 
 * Number = 42
 * 42 is divisible by 7 
 * So , 42 is a buzz number.
 * 
 * Number = 47
 * 47 ends with 7
 * So , 47 is a buzz number.
 */

import java.util.*;
class BuzzNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%7==0)
        {
            System.out.println("It is a Buzz number");
        }
        else if(num%10==7)
        {
            System.out.println("It is a Buzz number");
        }
        else
        {
            System.out.println("It is not a buzz number");
        }
    }
}