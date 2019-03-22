
package wildcard;

import java.util.ArrayList;
import java.util.List;


public class UpperboundWildcard {
    public static double sum(List<? extends Number> list){
        double sum=0;
        for(Number n : list){
            sum  +=n.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(new Integer(3));
        intList.add(new Integer(5));
        intList.add(new Integer(10));
        double sum=sum(intList);
        System.out.println("Sum of intList="+sum);
    }
}
