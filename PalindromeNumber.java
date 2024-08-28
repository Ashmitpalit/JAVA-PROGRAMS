/*
 * Palindrome number is a number which is read the same whther forward or backward.
 * Example :
 * Number = 121
 * It is the same number whether it is read forwards or backwards.
 */

import java.util.*;
class PalindromeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,rev=0,ld,temp;
        System.out.println("Enter a number");
        num=sc.nextInt();
        temp=num;
        while(num!=0)
        {
            ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("It is a Palindrome number");
        }
        else
        {
            System.out.println("It is not a Palindrome number");
        }
    }
}