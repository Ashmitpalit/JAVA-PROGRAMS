class Shape
{
   int a,b;
   Shape()
   {
       a=100;
       b=101;
   }
   Shape(int x,int y)
   {
       a=x;
       b=y;
   }
   void area()
   {
       int z;
       z=a*b;
       System.out.println(z);
   }
}