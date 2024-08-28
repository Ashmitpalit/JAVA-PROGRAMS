// to print a pattern
import java.util.*;
class Pattern3
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int i,j,k;
      for(i=5;i>=1;i++)
      {
          for(j=1;j<i;j++)
         {
             System.out.print(" ");
            }
         for(k=5;k>=i;k--)
         {
             System.out.print(k + " ");
            }
         System.out.println();
        }
    }
}