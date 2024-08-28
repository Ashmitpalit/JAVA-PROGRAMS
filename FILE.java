// to print the number of alphabets and numbers
import java.io.*;
class FILE
{
    public static void main(String args[])throws IOException
    {
        String filepath="C:\\Users\\Ashmit Palit\\Desktop\\TEST.txt";
        FileReader fr=new FileReader(filepath);
        int c,n1=0,n2=0,n3=0;
        char ch;
        while((c=fr.read())!=-1)
        {
            ch=(char)c;
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                n1++;
            }
            else if(ch>='0' && ch<='9')
            {
                n2++;
            }
            else if(ch=='\n')
            {
                n3++;
            }
        }
        System.out.println("Number of alphabets present are ="+n1);
        System.out.println("Number of digits present are ="+n2);
        System.out.println("Number of lines present are ="+(n3+1));
    }
}