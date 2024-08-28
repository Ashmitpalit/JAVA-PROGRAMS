import java.util.*;
class output1
{
   void fun(int a[ ], int m)
   {
    ++a[m];
    --m;
   }
   public static void main(String args[])
   {
       output1 ob1=new output1();
       int myArr [ ]={1, 2, 3 ,4, 5};
       int k = 3;
       ob1.fun(myArr,k);
    }
}
