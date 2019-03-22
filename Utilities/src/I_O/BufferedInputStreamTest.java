
package I_O;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("E:\\Java_programming\\file1.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
