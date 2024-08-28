// to do a program
import java.util.*;
class PERMUTATIONCOMBINATION
{
    int PERMUTATION(int n,int r)
    {
       int a=1,b=1,p=1;
       for(int i=1;i<=n;i++)
       {
           a*=i;
        }
       for(int i=1;i<=n-r;i++)
       {
           b*=i;
        } 
       return (a/b);
    }
    int COMBINATION(int n,int r)
    {
       int a=1,b=1,c=1;
       for(int i=1;i<=n;i++)
       {
           a*=i;
        }
       for(int i=1;i<=n-r;i++)
       {
           b*=i;
        } 
       for(int i=1;i<=r;i++)
       {
           c*=i;
        } 
       return (a/(b*c));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PERMUTATIONCOMBINATION ob=new PERMUTATIONCOMBINATION();
        System.out.println("Enter 1 to perform Permutation and 2 to perform Combination");
        int ch,n,r;
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the value of n");
            n= sc.nextInt();
            System.out.println("Enter the value of r");
            r=sc.nextInt();
            if(n>=r)
            {
                System.out.println("Your answer is = "+ob.PERMUTATION(n,r));
                break;
            }
            else
            {
                System.out.println("Enter valid inputs as the value of n cannot be lesser than the value of r");
                break;
            }
            
            case 2:
            System.out.println("Enter the value of n");
            n= sc.nextInt();
            System.out.println("Enter the value of r");
            r=sc.nextInt();
            if(n>=r)
            {
                System.out.println("Your answer is = "+ob.COMBINATION(n,r));
                break;
            }
            else
            {
                System.out.println("Enter valid inputs as the value of n cannot be lesser than the value of r");
                break;
            }
            
            default:
            System.out.println("No option "+ch+" found");
        }
    }
}