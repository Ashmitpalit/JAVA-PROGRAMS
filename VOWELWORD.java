// to print the words that start with a vowel
import java.util.*;
class VOWELWORD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="";
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        System.out.println("Words that begins with a vowels are");
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            if(x.charAt(0)=='A'||x.charAt(0)=='E'||x.charAt(0)=='I'||x.charAt(0)=='O'||x.charAt(0)=='U'||x.charAt(0)=='a'||
            x.charAt(0)=='e'||x.charAt(0)=='i'||x.charAt(0)=='o'||x.charAt(0)=='u')
            {
                System.out.println(x);
            }
        }
    }
}