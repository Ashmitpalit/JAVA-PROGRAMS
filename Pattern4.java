// to print a pattern
import java.util.*;
class Pattern4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,l=5,p=5;
        for(i=5;i>=1;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(k=l;k>=1;k--)
            {
                System.out.print(k +" ");
                l--;
            }
            for(m=2;m<=p;m++)
            {
                System.out.print(m+" ");
                p--;
            }
            System.out.println();
        }
    }
}