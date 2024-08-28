import java.util.*;
class Unique
{
    boolean checkUnique(int n)
    {
        String s;
        s=Integer.toString(n);
        int i,j,c=0;
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                }
            }
        }
        if(c==s.length())
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
        Unique ob=new Unique();
        int m,n,j,a=0;
        System.out.println("Enter the lower limit");
        m=sc.nextInt();
        System.out.println("Enter the upper limit");
        n=sc.nextInt();
        if(m>30000 || n>30000)
        {
            System.out.println("Invalid");
        }
        else if(m<0 || n<0)
        {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("The unique numbers are");
            for(j=m;j<=n;j++)
            {
                if(ob.checkUnique(j)==true)
                {
                    System.out.print(j+" ");
                    a++;
                }
            }
        }
        if(a==0)
        {
            System.out.print("nil");
        }
        System.out.println();
        System.out.println("Frequence is = "+a);
    }
}
