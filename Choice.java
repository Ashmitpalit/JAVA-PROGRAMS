// to print the following cases
import java.util.*;
class Choice
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       int k,i,j;
       System.out.print("Enter your choice");
       k=sc.nextInt();
       switch(k)
       {
        case 1:
        for(i=65;i<=90;i++)
        {
          System.out.println((char)i + "\t\t\t\t\t" + i);  
        }
        break;
        case 2:
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
              System.out.print(j + " "); 
            }
            System.out.println();
        }
        break;
        default:
        System.out.print("Wrong Input");
        break;
       }
    }
}