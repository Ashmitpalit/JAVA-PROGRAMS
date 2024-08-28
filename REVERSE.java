import java.util.*;
class REVERSE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,x="",rev="";
        int len,i;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sent);
        while(st.hasMoreTokens())
        {
            x=st.nextToken();
            len=x.length();
            for(i=len-1;i>=0;i--)
            {
                rev=rev+(x.charAt(i));
            }
            System.out.print(rev+" ");
            rev="";
        }
    }
}