// to enter somethings
import java.io.*;
class IO
{
    public static void main(String args[])throws IOException
    {
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String name;
            double marks;
            int age;
            System.out.println("Enter your name");
            name=br.readLine();
            System.out.println("Enter your age");
            age=Integer.parseInt(br.readLine());
            System.out.println("Enter your marks");
            marks=Double.parseDouble(br.readLine());
            System.out.println("Your name is "+name);
            System.out.println("Your age is "+age);
            System.out.println("Your marks is "+marks);
        } 
    }
}