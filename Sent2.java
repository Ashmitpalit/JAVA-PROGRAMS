// to print the word starting with A
import java.util.*;
class Sent2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String sent,x="";
    char k;
    int i,len,c=0;;
    System.out.print("Enter any sentence");
    sent=sc.nextLine();
    sent=sent + " ";
    len=sent.length();
     for(i=0;i<len;i++)
    {
       k=sent.charAt(i);
       if(k!=' ')
        {
            x=x+k;
        }
        else
        {
            if(x.charAt(0)=='A' || x.charAt(0)=='a')
            {
                System.out.print(x+ " ");
                c++;
            }
            x="";
        }
    }
    System.out.print("Number of word staring with A or a is = " + c);
  }
}