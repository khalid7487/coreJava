
package serialzeexample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serializer {
    public static void main(String[] args) {
        Serializer serializer=new Serializer();
        Address add=new Address();
        add.setStreet("wall street");
        add.setCountry("London");
        System.out.println(add);
        
        Address address=new Address();
        address.setStreet("54,Inner circular Road");
        address.setStreet("Bangladesh");
        serializer.serializeAddress(add);
    }
    public void serializeAddress(Address ad){
        try{
            FileOutputStream fout=new FileOutputStream("E:\\Java_programming\\adderss.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fout);
            oos.writeObject(ad);
            oos.close();
            System.out.println("Done");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
        
}
