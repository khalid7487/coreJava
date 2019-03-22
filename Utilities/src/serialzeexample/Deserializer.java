
package serialzeexample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserializer {
    public static void main(String[] args) {
        Deserializer  deserializer= new Deserializer();
        Address address=deserializer.deserialzeAdderss();
        System.out.println(address);
    }
  public Address deserialzeAdderss(){
      Address address;
      try{
          FileInputStream fin=new FileInputStream("E:\\Java_programming\\adderss.ser");
          ObjectInputStream ois=new ObjectInputStream(fin);
          address=(Address) ois.readObject();
          ois.close();
          return address;
      }catch(Exception e){
          e.printStackTrace();
          return null;
      }
  }
}
