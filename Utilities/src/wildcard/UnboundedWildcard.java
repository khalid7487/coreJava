
package wildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    public static void processElements(List<?> elements){
        for(Object o : elements){
            System.out.println(o);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> ints=new ArrayList<>();
        ints.add(new Integer(3));
        ints.add(new Integer(5));
        ints.add(new Integer(10));
        ints.add(new Integer(15));
        processElements(ints);
        
        List<Double> dts=new ArrayList<>();
        dts.add(new Double(3.5));
        dts.add(new Double(3.65));
        dts.add(new Double(6.30));
        dts.add(new Double(6.3));
        processElements(dts);
        
        
    }
}
