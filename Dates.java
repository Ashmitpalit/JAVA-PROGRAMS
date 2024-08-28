// to find the difference between dates
import java.util.*;
class Dates
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String d1,d2;
       int y1,y2,day1,day2,m1,m2,totaldays=0,i;
       System.out.println("Enter date 1 in dd/mm/yyyy format");
       d1=sc.nextLine();
       System.out.println("Enter date 2 in dd/mm/yyyy format");
       d2=sc.nextLine();
       y1=Integer.parseInt(d1.substring(6));
       y2=Integer.parseInt(d2.substring(6));
       day1=Integer.parseInt(d1.substring(0,2));
       day2=Integer.parseInt(d2.substring(0,2));
       m1=Integer.parseInt(d1.substring(3,5));
       m2=Integer.parseInt(d2.substring(3,5));
       int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
       if(y1==y2)
       {
           if(m1==m2)
           {
               totaldays=day2-day1;
           }
           else
           {
              if((y1%4==0||(y1%100==0 && y1%400!=0)) && m1==2)
              {
                  totaldays=29-day1;
                }
              else
              {
                  totaldays=month_days[m1-1]-day1;
                }
              for(i=m1+1;i<m2;i++)
              {
                  if((y1%4==0||(y1%100==0 && y1%400!=0)) && i==2)
                  {
                     totaldays=totaldays+29; 
                  }
                  else
                  {
                      totaldays=totaldays+month_days[i-1];
                    }
              }
              totaldays+=day2;
           }
       }
       System.out.println("Total Days ="+totaldays);
    }
}