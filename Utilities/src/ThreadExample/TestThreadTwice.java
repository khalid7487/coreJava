package ThreadExample;

public class TestThreadTwice extends Thread {

    public void run() {
        System.out.println("Running.....");
    }

    public static void main(String[] args) {
        TestThreadTwice t1 = new TestThreadTwice();

        //multiple is not allow 
//           t1.start();
//           t1.start();
        t1.start();
        TestThreadTwice t2 = new TestThreadTwice();
        t2.start();

    }
}
