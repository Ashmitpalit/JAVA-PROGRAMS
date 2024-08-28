// to print the words that end with vowels
import java.util.*;
class EndsWithVowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="",y="";
        int len;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        System.out.println("The Words that ends with a vowel are ");
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            y=x.toUpperCase();;
            len=y.length();
            if(y.charAt(len-1)=='A' ||y.charAt(len-1)=='E' ||y.charAt(len-1)=='I' ||y.charAt(len-1)=='O'
            ||y.charAt(len-1)=='U')
            {
                System.out.println(x);
            }
        }
    }
}