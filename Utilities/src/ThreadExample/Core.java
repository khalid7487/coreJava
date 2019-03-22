
package ThreadExample;

public class Core {
    public static final Core LOCK=new Core();
  
    public static void main(String[] args) throws InterruptedException {
        Thread a=new Thread( (Runnable) new Tick());
        Thread b=new Thread((Runnable) new Tock());
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Threads finished!");
    }
    
}
