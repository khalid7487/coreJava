
package I_O;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class BufferedOutputStreamTest {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout=new FileOutputStream("E:\\Java_programming\\file1.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        
        String s="Shakib AL Hasan is my favourite player";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        System.out.println("Sucess");
    }
 
}
