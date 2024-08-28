// to find the sum,product and modulus of a complex number
import java.util.*;
class Complex
{
    double real,img;
    Complex()
    {
        real=0.0;
        img=0.0;
    }
    Complex(int a,int b)
    {
        real=a;
        img=b;
    }
    Complex add(Complex c)
    {
        Complex a=new Complex();
        a.real=this.real+c.real;
        a.img=this.img+c.img;
        return a;
    }
    Complex product(Complex c)
    {
        Complex a=new Complex();
        a.real=(this.real*c.real)-(this.img*c.img);
        a.img=(this.real*c.img)+(this.img*c.real);
        return a;
    }
    double modulus()
    {
        double mod=Math.sqrt(Math.pow((this.real),2)+Math.pow((this.img),2));
        return mod;
    }
    void display()
    {
        if(this.img>=0)
        {
            System.out.println(this.real+"+i"+this.img);  
        }
        else
        {
            System.out.println(this.real+"-i"+(-this.img));
        }
    }
    public static void main(String args[])
    {
        Complex n1=new Complex(2,3);
        Complex n2=new Complex(4,-5);
        Complex sum=n1.add(n2);
        Complex pro=n1.product(n2);
        double m=n1.modulus();
        double n=n2.modulus();
        n1.display();
        n2.display();
        sum.display();
        pro.display();
        System.out.println(m);
        System.out.println(n);
    }
}