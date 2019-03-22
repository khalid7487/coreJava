
package utilities;

//java 5 (variable length argument) -varargs
public class VariableLengthE {
    public static void main(String[] args) {
        //VariableLengthE va=  new VariableLengthE();
        test(215,"Dhaka","Khulna");
        test(215,"USA","New York","California");
    }
    
    public static void test(int some,String... args){
        System.out.print("\n" + some);
        //java 5 (Enhanced for loop)
        for(String arg : args){
            System.out.print(", "+arg);
        }
    }
    
    
}
