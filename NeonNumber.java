/*
 * Neon number is a number whose sum of the digits of its square is equal to the number
 * Example :
 * Number = 9
 * Square = 9*9 = 81
 * Sum of its digits = 8 + 1 = 9
 * So 9 is a neon number
 */

import java.util.*;
class NeonNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,sq,ld;
        System.out.println("Enter a number");
        num=sc.nextInt();
        sq=num*num;
        while(sq!=0)
        {
            ld=sq%10;
            sum=sum+ld;
            sq=sq/10;
        }
        if(sum==num)
        {
            System.out.println("It is a Neon number");
        }
        else
        {
            System.out.println("It is not a Neon number");
        }
    }
}