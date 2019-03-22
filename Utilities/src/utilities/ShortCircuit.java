
package utilities;

public class ShortCircuit {
    public static void main(String[] args) {
        boolean b=false;
        int x=5;
        int y=6;
        int m =7;
        if((x>y)&&(b=true)){
            System.out.println(b+"ok");
        }else{
            System.out.println(b);
        }    
    }
}
