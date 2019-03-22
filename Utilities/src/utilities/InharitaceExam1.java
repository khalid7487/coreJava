
package utilities;

 class Employe{
    public String name;
    public int employeeid;
    public Employe(){
        this.employeeid=1;
        this.name="Khalid";
    }
    public Employe(int id,String name){
        this.employeeid=id;
        this.name=name;
    }
    String getDetails(){
        return  "Id is" +employeeid+ "and name is"+ name;
    }
    
    
}

public class InharitaceExam1 extends Employe{
    public String department;
   public InharitaceExam1(int id,String name,String department){
       super(id,name);
       this.department=department;
   }
    @Override
    String getDetails(){
        return  "Subdetails";
    }
    
    public static void main(String[] args) {
        InharitaceExam1 mgr=new InharitaceExam1(1,"Mr. A", "CSE");
        mgr.print();
//        Employe e=new InharitaceExam1(1,"X", "B");
//        mgr=(InharitaceExam1)e;
        System.out.println(mgr.getDetails());
    }
     void print(){
         System.out.println("Name:"+name);
         System.out.println("Department:"+department);
    } 
     
}
