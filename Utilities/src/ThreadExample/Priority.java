
package ThreadExample;

public class Priority extends Thread{
    
    public  void run(){
        System.out.println("Running thread name:"+Thread.currentThread().getName());
        System.out.println("Running thread Priority:"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
       Priority m1=new Priority();
       m1.setName("A1");
       Priority m2= new Priority();
       m2.setName("A2");
       m1.setPriority(Thread.MIN_PRIORITY);
       m2.setPriority(Thread.MAX_PRIORITY);
       m1.start();
       m2.start();
       
    }
}
