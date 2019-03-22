
package CompareExample;


public class Student implements Comparable{
    int rollno;
    String name;
    int age;

    public Student(int rollno,String name,int age) {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Object obj) {
        Student st=(Student) obj;
        System.out.println("======="+this.age+"Compare with"+st.age);
        //return this.age-st.age;
        //desending order
        return st.age-this.age;
    }
    
    
    
}
