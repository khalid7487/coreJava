
package utilities;


public class EnumExaple {
    
    public enum Day{
        SAT,SUN,MON,WED,TUE,THU,FRI
    };
    
    public static void main(String[] args) {
        for(Day s : Day.values()){
            System.out.println(s);
        }
    }
    
}
