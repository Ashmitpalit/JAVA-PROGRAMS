// to display banner vertically
import java.io.*;
class BANNER
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,i,max=0,d,j,c;
        System.out.println("Enter number of teams to be displayed as VERTICAL BANNERS");
        n=Integer.parseInt(br.readLine());
        if(n<3)
        {
           System.out.println("Please enter more teams.The range is from 3 to 8"); 
        }
        else if(n>8)
        {
           System.out.println("Please enter lesser teams.The range is from 3 to 8"); 
        }
        else
        {
            String teams[]= new String[n];
            System.out.println("Enter the team names"); 
            for(i=0;i<n;i++)
            { 
                teams[i]=br.readLine();
            }
            int len[]=new int[n];
            for(i=0;i<n;i++)
            {
               len[i]=teams[i].length(); 
            }
            max=len[0];
            for(i=0;i<n;i++)
            {
                if(len[i]>max)
                {
                    max=len[i];
                }
            }
            for(i=0;i<n;i++)
            {
                d=max-len[i];
                for(j=1;j<=d;j++)
                {
                    teams[i]=teams[i]+" ";
                }
            }
            for(i=0;i<max;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(teams[j].charAt(i));
                    System.out.print("            ");
                }
                System.out.println();
            }
        }
    }
}