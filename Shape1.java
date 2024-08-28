import java.util.*;
class Shape1
{
    int x,y;
    Shape1()
    {
        x=0;
        y=0;
    }
    Shape1(int a,int b)
    {
        x=a;
        y=b;
    }
    void area()
    {
        System.out.println("The area of the rectangle is ="+(x*y));
    }
    void perimeter()
    {
        System.out.println("The perimeter of the rectangle is ="+(2*(x+y)));
    }
}