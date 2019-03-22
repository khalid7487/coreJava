
package utilities;

import java.util.Date;

public class FieldIntilizeExample {
    double d;
    Date date= new Date();
    String s;

    public FieldIntilizeExample(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        FieldIntilizeExample obj= new FieldIntilizeExample("Md. Khalid Hossen");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
    
    
}
