// to print the area of the circle
import java.util.*;
class AREACIRCLE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r,area;
        System.out.println("Enter the radius of the circle");
        r=sc.nextDouble();
        area=3.14*r*r;
        System.out.println("The area of the circle is ="+area);
    }
}