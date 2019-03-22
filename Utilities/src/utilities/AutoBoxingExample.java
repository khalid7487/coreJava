package utilities;

public class AutoBoxingExample {

    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt);//this is called boxing
        int p2 = wInt; // this is called uboxing
        System.out.println(p2);
    }

}
