// to find distance and midpoint
import java.util.*;
class Point2D
{
    double x,y;
    Point2D()
    {
        x=0;
        y=0;
    }
    Point2D(int a,int b)
    {
        x=a;
        y=b;
    }
    double distance(double x1,double y1)
    {
        double m;
        m=Math.sqrt(Math.pow((x-x1),2)+Math.pow((y-y1),2));
        return m;
    }
    double midx(double x1)
    {
        double a=(x1+x)/2;
        return a;
    }
    double midy(double y1)
    {
        double b=(y1+y)/2;
        return b;
    }
    public static void main(String args[])
    {
        Point2D ob1=new Point2D(2,-3);
        double d1=ob1.distance(5,-12);
        double m1x=ob1.midx(5);
        double m1y=ob1.midy(-12);
        System.out.println("The distance is = " +d1);
        System.out.println("The midpoint is = " + "("+m1x+","+m1y+")");
        Point2D ob2=new Point2D(5,7);
        double d2=ob2.distance(-5,-2);
        double m2x=ob2.midx(-5);
        double m2y=ob2.midy(-2);
        System.out.println("The distance is = " +d2);
        System.out.println("The midpoint is = " + "("+m2x+","+m2y+")");
        Point2D ob3=new Point2D();
        double d3=ob3.distance(10,52);
        double m3x=ob3.midx(10);
        double m3y=ob3.midy(52);
        System.out.println("The distance is = " +d3);
        System.out.println("The midpoint is = " + "("+m3x+","+m3y+")");
    }
}