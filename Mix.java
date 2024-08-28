// to mix two words
import java.util.*;
class Mix
{
    String word;
    int len;
    Mix()
    {
        word="";
        len=0;
    }
    void feedWord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        word=sc.nextLine();
        word=word.toUpperCase();
        len=word.length();
    }
    Mix mixWord(Mix p,Mix q)
    {
       Mix ob=new Mix();
       int minlen=p.len<q.len?p.len:q.len;
       int i;
       for(i=0;i<minlen;i++)
       {
          ob.word+=p.word.charAt(i)+q.word.charAt(i); 
       }
       if(minlen==p.len)
       {
           ob.word+=q.word.substring(minlen+1);
       }
       else
       {
           ob.word+=p.word.substring(minlen+1);
       }
       return ob;
    }
    void display()
    {
        System.out.println(word);
    }
    public static void main(String args[])
    {
        Mix w1=new Mix();
        Mix w2=new Mix();
        Mix ob2=new Mix();
        w1.feedWord();
        w2.feedWord();
        ob2.mixWord(w1,w2);
        System.out.println("The final word");
        ob2.display();
    }
}