// to print a pattern
import java.util.*;
class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j;
        for(i=5;i>=i;i--)
        {
           for(j=1;j<=i;j++)
           {
             System.out.print(j);
           }
           System.out.println();
        }
    }
}
