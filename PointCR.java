// to find the midpoint and distance
import java.util.*;
class PointCR
{
    double x,y;
    PointCR()
    {
        x=0;
        y=0;
    }
    PointCR(int a,int b)
    {
        x=a;
        y=b;
    }
    double distance(PointCR p1)
    {
        double d=Math.sqrt(Math.pow((this.x-p1.x),2)+Math.pow((this.y-p1.y),2));
        return d;
    }
    PointCR midpoint(PointCR m1)
    {
        PointCR mid=new PointCR();
        mid.x=(this.x+m1.x)/2;
        mid.y=(this.y+m1.y)/2;
        return mid;
    }
    void display()
    {
        System.out.println("("+this.x +","+this.y+")");
    }
    public static void main(String args[])
    {
        PointCR p1=new PointCR(2,4);
        PointCR p2=new PointCR(4,2);
        double dis=p1.distance(p2);
        PointCR mid=p1.midpoint(p2);
        p1.display();
        p2.display();
        System.out.println("The midpoint is ");
        mid.display();
        System.out.println("The distance is = "+dis);
    }
}
