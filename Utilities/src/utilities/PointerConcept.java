
package utilities;


public class PointerConcept {
    int data=50;
    void change(int data){
        data=data+100;
        System.out.println("Data In Method:" +data);
        return;
    }
    void changeByobj(PointerConcept e)
    {
        e.data=200;
    }
    
    public static void main(String[] args) {
        PointerConcept ex=new PointerConcept();
        System.out.println("Before change:" +ex.data);
        ex.change(55);
        System.out.println("After change by pass by value:"+ex.data);
        ex.changeByobj(ex);
        System.out.println("After change by pass reference:"+ex.data);
    }
    
}
