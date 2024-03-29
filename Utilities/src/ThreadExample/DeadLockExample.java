
package ThreadExample;


public class DeadLockExample {
    public static DeadLockExample lock1=new DeadLockExample();
    public static DeadLockExample lock2=new DeadLockExample();
    
    public static void main(String[] args) {
        ThreadDemo1 T1=new ThreadDemo1();
        ThreadDemo2 T2=new ThreadDemo2();
        T1.start();
        T2.start();
    }
    private static class ThreadDemo1 extends Thread{
        @Override
        public void run(){
            synchronized(lock1){
                System.out.println("Thread 1: Holding lock 1...");
                
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized(lock2){
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    
    private static class ThreadDemo2 extends Thread{
          public void run(){
            synchronized(lock2){
                System.out.println("Thread 2: Holding lock 1....");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                }
                System.out.println("Thread 2: Wating for lock 2...");
                synchronized(lock1){
                    System.out.println("Thread 2: Holding lock 1 & 2....");
                }
            }
        }
    }
}
