// to check whether a person is an adult or not
import java.util.*;
class AGE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are an adult");
        }
        else
        {
            System.out.println("You are a child");
        }
    }
}