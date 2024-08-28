import java.util.*;
class ReverseSpecialArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a;
        n=sc.nextInt();
        SpecialArray ob=new SpecialArray(n);
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            ob.insert(a,i);
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.println(ob.getElement(i));
        }
    }
}