
package CompareExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Student> a1=new ArrayList();
        a1.add(new Student(101,"Bari",23));
        a1.add(new Student(106,"Lalon",27));
        a1.add(new Student(108,"Akash",21));
        
        Collections.sort(a1);
        Iterator<Student> itr=a1.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollno+" " +st.name+" "+st.age);
            
        }
    }
}
