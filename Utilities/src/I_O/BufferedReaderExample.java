
package I_O;

import java.io.*;


public class BufferedReaderExample {
    public static BufferedReader br;
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br=new BufferedReader(new FileReader("E:\\Java_programming\\file1.txt"));
            String sCurrentLine;
            while((sCurrentLine =br.readLine())!=null){
                System.out.println(sCurrentLine);
            }
           br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
//        finally{
//            br.close();
//        }
    }
}
