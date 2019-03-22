
package Create_rename_delete;

import java.io.File;


public class RenameFileExample {
    public static void main(String[] args) {
        File oldfile=new File("E:\\Java_programming\\createfile.txt");
        File newfile=new File("E:\\Java_programming\\renamefile.txt");
        if(oldfile.renameTo(newfile)){
            System.out.println("Rename succesful");
        }else{
            System.out.println("Rename failed");
        }
    }
 
        
}
