class Square extends Shape
{
    int a;
    Square()
    {
       super();
    }
    Square(int x)
    {
        super(x,0);
    }
    void area()
    {
        int ar=(super.a)*(super.a);
        System.out.println("Area of the square ="+ar);
    }
    public static void main(String args[])
    {
        Square ob=new Square();
        Square ob1=new Square(6);
        ob.area();
        ob1.area();
    }
}