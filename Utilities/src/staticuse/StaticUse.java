package staticuse;

public class StaticUse {

    public static void main(String[] args) {
        StaticUse su = null;
        su.methodOne();
        //Below will give a NullpointerException
        su.methodTwo();
    }

    private static void methodOne() {
        System.out.println("Method.one");
    }

    private void methodTwo() {
        System.out.println("Method.two");
    }
}
