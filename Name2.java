// to print initials and surname
import java.util.*;
class Name2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String name,surname,x="";
    char k,p;
    int i,len,a;
    System.out.print("Enter you full name");
    name=sc.nextLine();
    name=" "+name;
    len=name.length();
    a=name.lastIndexOf(' ');
    surname=name.substring(a+1);
    for(i=0;i<len-a;i++)
    {
        k=name.charAt(i);
        p=name.charAt(i+1);
        if(k==' '&& p!=' ')
        {
            System.out.print(Character.toUpperCase(p) + ".");
        }
    }
    System.out.print(surname.toUpperCase());
  }
}