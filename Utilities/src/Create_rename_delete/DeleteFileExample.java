package Create_rename_delete;

import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {
        try {
            File file = new File("E:\\Java_programming\\file1.txt");
//            File file2 = new File("E:\\Java_programming\\file1.txt");
//            System.out.println(file2.getAbsolutePath());
            if (file.delete()) {
                System.out.println(file.getName() + "Is deleted");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
