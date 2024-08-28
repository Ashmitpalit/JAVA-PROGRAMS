// to print the words that have all the vowels in it
import java.util.*;
class Sent4
{
  public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        char k;
        int i,j,len,len2,c=0,f=0;
        System.out.print("Enter any sentence");
        sent=sc.nextLine();
        sent=sent.toUpperCase();
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
                len2=x.length();
                for(j=0;j<len2;j++)
                {
                    if(x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||
                    x.charAt(j)=='U')
                    {
                        c++;
                    }
                    else
                    {
                        continue;
                    }
                    if(c==5)
                    {
                        f++;
                        System.out.println("The words having all the vowels are = "+ x + " ");
                        System.out.print("Number of words having all the vowels are = "+f);
                        x="";
                    }
                }
            }
        }
    }
}