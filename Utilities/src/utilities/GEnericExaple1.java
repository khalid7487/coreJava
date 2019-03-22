

package utilities;

import java.util.ArrayList;
import java.util.List;

public class GEnericExaple1 {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Integer(2));//we  can add any object in a List
        list.add("a String");//we  can add any object in a List
        System.out.println((Integer)list.get(0));//explicit casting
        System.out.println((String)list.get(1));
        
        List<String> myStringlist=new ArrayList();
        myStringlist.add("a String");
//       myStringlist.add(new Integer(2));
        System.out.println(myStringlist.get(0));
        for(String a: myStringlist){
            System.out.println(a);
        }
    }
    
}
