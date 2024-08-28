import java.util.*;
class LONGESTWORD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="",w="";
        int c=0,len,max=0,i;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        while(st.hasMoreTokens())
        {
           x=st.nextToken();
           len=x.length();
           if(len>=max)
           {
              max=len;
              w=x;
           }
        }
        System.out.print("The longest word is = "+w);
    }
}