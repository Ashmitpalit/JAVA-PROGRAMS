class Rectangle extends Shape
{
    int a,b;
    Rectangle()
    {
        super();
    }
    Rectangle(int x,int y)
    {
        super(x,y);
    }
    void area()
    {
        super.area();
    }
    public static void main(String args[])
    {
        Rectangle ob=new Rectangle();
        Rectangle ob1=new Rectangle(5,2);
        ob.area();
        ob1.area();
    }
}