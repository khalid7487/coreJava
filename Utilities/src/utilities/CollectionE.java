
package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
public class CollectionE {
    public static void main(String[] args) {
        List l=new LinkedList();
        l.add("List: angel");
        l.add("schildt");
        l.add("mathew");
        l.add("schildt");
        print(l);
        
        Set s=new HashSet();
        s.add("set:rose");
        s.add("schildt");
        s.add("mathew");
        s.add("schildt");
        print(s);
        
        SortedSet ss=new TreeSet();
        ss.add("set:jasmine");
        ss.add("schildt");
        ss.add("mathew");
        ss.add("schildt");
        print(ss);
        
        LinkedHashSet sss=new LinkedHashSet();
        sss.add("set:winslet");
        sss.add("schildt");
        sss.add("mathew");
        sss.add("schildt");
        print(sss);
        
        Map ml=new HashMap();
        ml.put("map", "HashMap");
        ml.put("schildt","java2s");
        ml.put("mathew","Hyden");
        ml.put("schildt", "java2");
        print(ml.keySet());
        print(ml.values());
        
        SortedMap sm=new TreeMap();
        sm.put("map", "TreeMap");
        sm.put("schildt","java2s");
        sm.put("mathew","Hyden");
        sm.put("schildt", "java2");
        print(sm.keySet());
        print(sm.values());
    
    }
       static void print(Collection coll){
           Iterator iter=coll.iterator();
           while (iter.hasNext()) {
            String elem=(String) iter.next();
               System.out.print(elem+" ");
           }
           System.out.println();
    }

  
}
