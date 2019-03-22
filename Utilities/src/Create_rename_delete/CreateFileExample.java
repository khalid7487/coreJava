
package Create_rename_delete;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try{
            File file=new File("E:\\Java_programming\\createfile.txt");
            if(file.createNewFile()){
                System.out.println("File is created");
            }else{
                System.out.println("File already exits.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
