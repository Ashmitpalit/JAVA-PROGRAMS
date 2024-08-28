import java.util.*;
class GeneratePalindrome
{
    long reverse(long n)
    {
        long rev=0;
        while(n>0)
        {
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return rev;
    }
    boolean isPalindrome(long n)
    {
        if(n==reverse(n))
            return true;
        else
            return false;
    }
    void generate(long n)
    {
        long p=0,s=0,temp=n;
        boolean generated=false;
        for(int i=1;i<=50;i++)
        {
            s=temp+reverse(temp);
            System.out.println("Step "+i+":");
            System.out.println(temp+" + "+reverse(temp)+" = "+s);
            if(isPalindrome(s))
            {
                generated=true;
                p=i;
                break;
            }
            temp=s;
        }
        if(generated)
        {
            System.out.println("Palindrome number is generated in "+p+" steps.");
        }
        else
        {
            System.out.println("Palindrome number is not generated in 15 steps.");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n;
        GeneratePalindrome gp=new GeneratePalindrome();
        System.out.print("Enter a number: ");
        n=sc.nextLong();
        gp.generate(n);
    }
}