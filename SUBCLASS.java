class SUBCLASS extends SUPERCLASS
{
    int x,y;
    SUBCLASS()
    {
        super();
    }
    void display()
    {
        super.display();
    }
    public static void main(String args[])
    {
        SUBCLASS ob=new SUBCLASS();
        ob.display();
    }
}