/*
 * Armstrong number is a number whose sum of the cube of the digits of the number is equal to the number.
 * Example :
 * Number = 153
 * Sum of cube of the digits = (1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
 * So, 153 is an armstrong number.
 * 
 * Number = 154
 * Sum of cube of the digits = (1*1*1)+(5*5*5)+(4*4*4)=1+125+64=190
 * So, 154 is not an armstrong number.
 */

import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,temp,ld,sum=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        temp=num;
        while(num!=0)
        {
            ld=num%10;
            sum=sum+(ld*ld*ld);
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }
    }
}