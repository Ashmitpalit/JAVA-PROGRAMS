// TO ENCRYPT OR DECRYPT A MESSAGE
import java.util.*;
class ENCRYPTDECRYPT
{
    String message;
    int key;
    int generateEncryptionOffset(int ascii,int upperlimit, int lowerlimit,int key)
    {// increases the ascii value of each character by the entered master key
        int offset=0;
        if(ascii+key>upperlimit)
        {
            offset=lowerlimit+((ascii+key)-upperlimit-1);  
        }
        else
        {
            offset=ascii+key;
        }
        return offset;
    }
    int generateDecryptionOffset(int ascii,int upperlimit, int lowerlimit,int key)
    {// decreases the ascii value of each character by the entered master key
        int offset=0;
        if(ascii-key<lowerlimit)
        {
            offset=upperlimit-(lowerlimit-(ascii-key)-1);  
        }
        else
        {
            offset=ascii-key;
        }
        return offset;
    }
    String encrypt(String message,int key)
    {// encrypts the entered message
        int i,a,offset=0;
        char ch;
        String encryptedmessage="";
        for(i=0;i<message.length();i++)
        {
            ch=message.charAt(i);
            a=(int)ch;
            if(ch>='A' && ch<='Z')
            {
                offset=generateEncryptionOffset(a,90,65,key);
            }
            else if(ch>='a' && ch<='z')
            {
                offset=generateEncryptionOffset(a,122,97,key);
            }
            else if(ch>='0' && ch<='9')
            {
              offset=generateEncryptionOffset(a,57,48,key); 
            } 
            else
            {
                offset=a;
            }
            encryptedmessage+=(char)offset;
        }
        return encryptedmessage;
    }
    String decrypt(String message,int key)
    {// decrypts the entered message
        int i,a,offset=0;
        char ch;
        String decryptedmessage="";
        for(i=0;i<message.length();i++)
        {
            ch=message.charAt(i);
            a=(int)ch;
            if(ch>='A' && ch<='Z')
            {
                offset=generateDecryptionOffset(a,90,65,key);
            }
            else if(ch>='a' && ch<='z')
            {
                offset=generateDecryptionOffset(a,122,97,key);
            }
            else if(ch>='0' && ch<='9')
            {
              offset=generateDecryptionOffset(a,57,48,key); 
            } 
            else
            {
                offset=a;
            }
            decryptedmessage+=(char)offset;
        }
        return decryptedmessage;
    }
    void input()
    {// input the message to be encrypted or decrypted and also the master key
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message");
        message=sc.nextLine();
        System.out.println("Enter the master key");
        key=sc.nextInt();
    }
    public static void main(String args[])
    {// start of main method
       Scanner sc=new Scanner(System.in);
       ENCRYPTDECRYPT ob=new ENCRYPTDECRYPT();
       String newmsg="";
       int ch;
       do
       {
        System.out.println("Enter 1 for encryption and 2 for decryption and 3 to stop");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1:
            ob.input();
            newmsg= ob.encrypt(ob.message,ob.key);
            System.out.println("The encrypted message is "+newmsg);
            break;
           
            case 2:
            ob.input();
            newmsg= ob.decrypt(ob.message,ob.key);
            System.out.println("The decrypted message is "+newmsg);
            break;
            
            case 3:
            System.out.println("Thank you");
            break;
           
            default:
            System.out.println("Invalid");
        }
       }while(ch!=3);
    }// close of main method
 }// close of class