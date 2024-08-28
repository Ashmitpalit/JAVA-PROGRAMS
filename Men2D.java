// to return area and perimeter
import java.util.*;
class Men2D
{
    double area(double x)
    {
        return (Math.pow(x,2));
    }
    double area(double x, double y)
    {
        return (x*y);
    }
    double perimeter(double x)
    {
        return (4*x);
    }
    double perimeter(double x,double y)
    {
        return (2*(x+y));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for square and 2 for rectangle");
        int ch=sc.nextInt();
        Men2D ob=new Men2D();
        switch(ch)
        {
          case 1:
          System.out.println("Enter side of the square");
          double s=sc.nextDouble();
          double ar=ob.area(s);
          double peri=ob.perimeter(s);
          System.out.println("Area is "+ar);
          System.out.println("Perimeter is "+peri);
          break;
          case 2:
          System.out.println("Enter the length and breadth of the rectangle");
          double l=sc.nextDouble();
          double b=sc.nextDouble();
          double ar2=ob.area(l,b);
          double peri2=ob.perimeter(l,b);
          System.out.println("Area is "+ar2);
          System.out.println("Perimeter is "+peri2);
          break;
          default:
          System.out.println("Vul Val Value");
        }
    }
}