package utilities;

import java.io.EOFException;
import java.io.IOException;
public class Exceptionoverriden {
    void msg(){
        System.out.println("parent");
    }
    public void someMethod() throws IOException{
        
    }
}
class TestA extends Exceptionoverriden{
   //Rule 1: subclass overridden method cannot declare no exception
   //or the checked exception (like IOEXCEPTION)
   //but can declare unchecked exception(like ArithmeticException)
   //valid (no exception) 
  /*  void msg(){
       System.out.println("child");
   }*/
    //valid (unchecked exception)
   /* void msg() throws ArithmeticException{
        System.out.println("child");
    }*/
    
//-invalid (checked exception)   
   /* void msg() throws IOException{
        System.out.println("chlid");
    }*/
    //valid
    public void someMethod() throws IOException{
     
    }
    
    
    //-invalid (checked exception) 
//    public void someMethod() throws Exception{
//        
//    }
}