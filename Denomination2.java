import java.util.*;
class Denomination2
{
    int check(int x,int y, int z)
    {
       int c;
       c=x/y;
       if(c<z)
       {
           print(y,c);
           return (x-(y*c));
       }
       else 
       {
           return (x-(y*z));
       }
    }
    void print(int a, int b)
    {
       System.out.println(a+" x "+b+" = "+(a*b));  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Denomination2 ob=new Denomination2();
        int curr[]={2000,500,200,100,50,20,10};
        int num[]={3,3,3,0,3,0,1};
        int a,i;
        System.out.println("Enter an amount");
        a=sc.nextInt();
        for(i=0;i<7;i++)
        {
            if(a>curr[i])
            {
               ob.check(a,curr[i],num[i]);
            }
        }
    }
}