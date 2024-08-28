// to print the longest word in a file
import java.io.*;
import java.util.*;
class LONGESTWORD_FILE
{
    String longestWord(String s)
    {
        StringTokenizer st=new StringTokenizer(s," .,/");
        String w="",lw="";
        int max=0;
        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            if(w.length()>max)
            {
                lw=w;
                max=w.length();
            }
        }
        return lw;
    }
    public static void main(String args[])throws IOException
    {
        LONGESTWORD_FILE ob=new LONGESTWORD_FILE();
        String file,x="",f="";
        file="C:\\Users\\Ashmit Palit\\Desktop\\source.txt";
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        int c,l,max=0;
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println(ob.longestWord(line));
        } 
    }
}