// to calculate the visiblity of a light house
import java.util.*;
class VISIBILITY
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double h,th,rth,r,area;
        System.out.println("Enter the height of the light house");
        h=sc.nextDouble();
        System.out.println("Enter the angle of elevation");
        th=sc.nextDouble();
        rth=(((22/7)*th)/180);
        r=Math.tan(rth)*h;
        area=((22/7)*(r*r));
        System.out.println("The area of visibility ="+area+"m");
    }
}