import java.lang.*;
class Triangle extends Shape1
{
    int z;
    Triangle()
    {
        super();
        z=0;
    }
    Triangle(int a,int b,int c)
    {
        super(a,b);
        z=c;
    }
    void area()
    {
        double ar,s;
        s=(super.x+super.y+z)/2;
        ar=Math.sqrt(s*(s-super.x)*(s-super.y)*(s-z));
        System.out.println("The area of the triangle is ="+ar);
    }
    void perimeter()
    {
        System.out.println("The perimeter of the triangle is ="+(super.x+super.y+z));
    }
    public static void main(String args[])
    {
        Triangle ob=new Triangle(5,7,4);
        ob.area();
        ob.perimeter();
    }
}