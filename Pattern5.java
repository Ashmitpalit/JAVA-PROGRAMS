// to print a pattern
import java.util.*;
class Pattern5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=l;k>=1;k--)
            {
                System.out.print(k +" ");
                l--;
            }
            System.out.println();
        }
    }
}