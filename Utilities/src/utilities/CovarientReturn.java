
package utilities;
class SuperA{
    int x=1;
}
class SubB extends SuperA{
    int y=2;
   
}
class Base{
    SuperA getobject(){
        System.out.println("Base");
        return new SuperA();
    }
}
public class CovarientReturn extends Base{

    @Override
    SuperA getobject(){
        System.out.println("Base");
        return new SubB();
    }
    public static void main(String[] args) {
        Base test= new CovarientReturn();
        System.err.println(test.getobject() instanceof SubB);
        System.out.println(test.getobject().x);
    }
}
