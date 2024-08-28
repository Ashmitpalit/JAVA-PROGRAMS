// to encrypt or decrypt a file
import java.io.*;
class FILEENCRYPTDECRYPT
{
    void encryptFile(String f,int key)throws IOException
    {
        FileReader fr=new FileReader(f);
        String encFile=f.substring(0,f.indexOf(".txt"));
        encFile+="ENCRYPTED.txt";
        FileWriter fw=new FileWriter(encFile);
        ENCRYPTDECRYPT ob=new ENCRYPTDECRYPT();
        int c,offset=0;
        char ch;
        while((c=fr.read())!=-1)
        {
           ch=(char)c;
           if(ch>='A' && ch<='Z')
            {
                offset=ob.generateEncryptionOffset(c,90,65,key);
            }
            else if(ch>='a' && ch<='z')
            {
                offset=ob.generateEncryptionOffset(c,122,97,key);
            }
            else if(ch>='0' && ch<='9')
            {
              offset=ob.generateEncryptionOffset(c,57,48,key); 
            } 
            else
            {
                offset=c;
            }
           fw.write((char)offset);
        }
        fw.close();
        System.out.println("Operation Successful");
    }
    void decryptFile(String f,int key)throws IOException
    {
        FileReader fr=new FileReader(f);
        String encFile=f.substring(0,f.indexOf(".txt"));
        encFile+="DECRYPTED.txt";
        FileWriter fw=new FileWriter(encFile);
        ENCRYPTDECRYPT ob=new ENCRYPTDECRYPT();
        int c,offset=0;
        char ch;
        while((c=fr.read())!=-1)
        {
           ch=(char)c;
           if(ch>='A' && ch<='Z')
            {
                offset=ob.generateDecryptionOffset(c,90,65,key);
            }
            else if(ch>='a' && ch<='z')
            {
                offset=ob.generateDecryptionOffset(c,122,97,key);
            }
            else if(ch>='0' && ch<='9')
            {
              offset=ob.generateDecryptionOffset(c,57,48,key); 
            } 
            else
            {
                offset=c;
            }
           fw.write((char)offset);
        }
        fw.close();
        System.out.println("Operation Successful");
    }
    public static void main(String args[])throws IOException
    {
        FILEENCRYPTDECRYPT ob=new FILEENCRYPTDECRYPT();
        ob.encryptFile("C:\\Users\\Ashmit Palit\\Desktop\\JEET.txt",1);
        ob.decryptFile("C:\\Users\\Ashmit Palit\\Desktop\\JEET.txt",1);
    }
}