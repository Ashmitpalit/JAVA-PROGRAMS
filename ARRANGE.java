import java.util.*;
class ARRANGE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent,temp="";
        int i,j,len;
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        sent=sent.toUpperCase();
        sent=sent.trim();
        len=sent.length();
        if(sent.charAt(len-1)!='.')
        {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("The original sentence :");
            System.out.println(sent);
            sent=sent.substring(0,len-1);
            String s[]=sent.split(" ");
            System.out.println("The length of the sentence is :"+(s.length));
            for(i=0;i<s.length-1;i++)
            {
                for(j=i+1;j<s.length;j++)
                {
                    if(s[i].compareTo(s[j])>0)
                    {
                        temp=s[i];
                        s[i]=s[j];
                        s[j]=temp;
                    }
                }
            }
            System.out.println("The rearranged sentence is:");
            for(i=0;i<s.length;i++)
            {
                if(i!=s.length-1)
                {
                    System.out.print(s[i]+" ");
                }
                else
                {
                    System.out.print(s[i]+".");
                }
            }
        }
    }
}