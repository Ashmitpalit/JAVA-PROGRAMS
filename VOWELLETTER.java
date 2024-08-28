// to print the letter immediately after a vowel
import java.util.*;
class VOWELLETTER
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sent;
        char k;
        System.out.println("Enter a string");
        sent=sc.nextLine();
        int i,len,a;
        len=sent.length();
        for(i=0;i<len-1;i++)
        {
           k=sent.charAt(i);
           if(k=='A' || k=='E' ||k=='I'|| k=='O'|| k=='U'|| k=='a'|| k=='e'|| k=='i'|| k=='o'|| k=='u')
           {
               System.out.print(sent.charAt(i+1));
            }
        }
    }
}