// to do a program
import java.util.*;
class Vector
{
    double i,j,k;
    Vector()
    {
        i=0.0;
        j=0.0;
        k=0.0;
    }
    Vector(double l,double m,double n)
    {
        i=l;
        j=m;
        k=n;
    }
    Vector add(Vector v)
    {
        Vector a=new Vector();
        a.i=this.i+v.i;
        a.j=this.j+v.j;
        a.k=this.k+v.k;
        return a;
    }
    double mod()
    {
        double m;
        m=Math.sqrt(Math.pow((this.i),2)+Math.pow((this.j),2)+Math.pow((this.k),2));
        return m;
    }
    double dot(Vector v)
    {
        double a=this.i*v.i;
        double b=this.j*v.j;
        double c=this.k*v.k;
        return a+b+c;
    }
    public static void main(String args[])
    {
        Vector vc1=new Vector(3,4,5);
        Vector vc2=new Vector(6,7,8);
        Vector add=vc1.add(vc2);
        System.out.println("Sum = "+add.i+"i + "+add.j+" j + "+add.k+"k");
        double mod1=vc1.mod();
        double mod2=vc2.mod();
        System.out.println("The modules of the first vector = "+mod1);
        System.out.println("The modules of the second vector = "+mod2);
        System.out.println("Dot product is = "+vc1.dot(vc2));
    }
}