import java.util.*;
class Point3D
{
    int x,y,z;
    Point3D()
    {
        x=0;
        y=0;
        z=0;
    }
    Point3D(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void distance(Point3D p)
    {
        double d;
        d=Math.sqrt(((double)Math.pow((this.x-p.x),2)+(double)Math.pow((this.y-p.y),2)+(double)Math.pow((this.z-p.z),2)));
        System.out.println("The distance is ="+d);
    }
    public static void main(String args[])
    {
        Point3D ob=new Point3D();
        Point3D ob1=new Point3D(3,5,9);
        ob1.distance(ob);
    }
}