import java.util.*;
class Largest1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the first number");
        n1=sc.nextInt();
        System.out.println("Enter the second number");
        n2=sc.nextInt();
        if(n1>n2)
        {
            System.out.println("First number is larger");
        }
        else if(n2>n1)
        {
            System.out.println("Second number is larger");
        }
        else
        {
            System.out.println("Both are equal");
        }
    }
}