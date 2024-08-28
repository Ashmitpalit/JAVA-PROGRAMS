// to find a word and replace it
import java.io.*;
import java.util.*;
class FINDANDREPLACE
{
    public static void main(String args[])throws IOException
    {
       Scanner sc=new Scanner(System.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String source,edited,w,r,x="",line="";
       int c,ch,n=0;
       char k;
       source="C:\\Users\\Ashmit Palit\\Desktop\\TEST.txt";
       FileReader fr=new FileReader(source);
       BufferedReader fbr=new BufferedReader(fr);
       edited="C:\\Users\\Ashmit Palit\\Desktop\\editedTEST.txt";
       System.out.println("Enter 1 to find and 2 to replace");
       ch=sc.nextInt();
       switch(ch)
       {
           case 1:
           System.out.println("Enter the word to be searched");
           w=br.readLine();
           while((line=fbr.readLine())!=null)
           {
              System.out.println(line);
              StringTokenizer st=new StringTokenizer(line," .,?");
              while(st.hasMoreTokens())
              {
                  x=st.nextToken();
                  if(x.equalsIgnoreCase(w))
                  {
                      n++;
                  }
              }
           }
           if(n>0)
           {
               System.out.println("The word "+w+" is found "+n+" times");
           }
           else
           {
               System.out.println("No result found for "+w);
           }
           break;
           
           case 2:
           System.out.println("Enter the word to be replaced");
           w=br.readLine();
           System.out.println("Enter the word to be replaced with");
           r=br.readLine();
           FileWriter fw=new FileWriter(edited);
           while((line=fbr.readLine())!=null)
           {
              System.out.println(line);
              StringTokenizer st=new StringTokenizer(line," .,?");
              while(st.hasMoreTokens())
              {
                  x=st.nextToken();
                  if(x.equalsIgnoreCase(w))
                  {
                      n++;
                      fw.write(w);
                      fw.write("\t");
                  }
                  else
                  {
                      fw.write(x);
                  }
              }
           }
           fw.close();
           System.out.println("All the "+n+" "+w+"'s"+" is replaced with the word "+r+" successfully");
           break;
           
           default:
           System.out.println("No option "+ch+" found . Please try again");
       }
    }
}