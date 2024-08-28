/*There are X number of questions in an exam.A boy did not attempt Y number of questions.
 * If each question is worth two marks,find the total marks the boy scored.
 */

import java.util.*;
class QUESTION
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,total;
        System.out.println("Enter the total number of questions");
        x=sc.nextInt();
        System.out.println("Enter the total number of unattempted questions");
        y=sc.nextInt();
        if(y==x)
        {
            System.out.println("0");
        }
        else if(y<x)
        {
            total=(x-y)*2;
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}