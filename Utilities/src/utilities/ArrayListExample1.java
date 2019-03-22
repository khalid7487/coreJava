
package utilities;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList();
        
        System.out.println("Size:"+list.size()+"and, Element inside the ArrayList::"+list);
        
        //Add some Element into ArrayList
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add(2, "S");//Add the "s" into 2nd position
        
        System.out.println("Size::"+list.size()+
                "and, Element inside the ArrayList::"+list);
        
        //Remove some element from the ArrayList
        list.remove("A");
        list.remove(2);
        System.out.println("Size::"+list.size()+
                "and, Element inside the ArrayList::"+list);
        //Replace element "c" with "z"
        list.remove("C");
        list.add(2,"Z");
        System.out.println("Size::"+list.size()+
                "and, Element inside the ArrayList::"+list);
        
        //looping array list
        for(int i=0; i<list.size();i++){
            String s=list.get(i);
            System.out.print(s);
        }
        
    }
}
