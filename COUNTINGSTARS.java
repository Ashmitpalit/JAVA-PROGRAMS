// to count stars as the compiler wants
import java.util.*;
class COUNTINGSTARS
{
    boolean isValidString(String s)
    {
        boolean f=true;
        if(s.charAt(0)!='*' || s.charAt(s.length()-1)!='@')
        {
            return false;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!='*' && s.charAt(i)!='@')
                {
                    System.out.println("Invalid "+i);
                    f=false;
                    break;
                }
            }
            return f;
        }
    }
    public static void main(String args[])
    {
        COUNTINGSTARS ob=new COUNTINGSTARS();
        Scanner sc=new Scanner(System.in);
        String sent;
        char k;
        int len,i,c=0;
        sent=sc.nextLine();
        len=sent.length();
        if(ob.isValidString(sent)==true)
        {
            StringTokenizer st=new StringTokenizer(sent,"@");
            String w="";
            while(st.hasMoreTokens())
            {
                w=st.nextToken();
                c=w.length()-c;
            }
            System.out.println("The stars counted are(not by ONE REPUBLIC but by the program)= "+c);
        }
        else
        {
            System.out.println("Invalid String");
        }
    }
}