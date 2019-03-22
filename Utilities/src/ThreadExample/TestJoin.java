
package ThreadExample;

public class TestJoin implements Runnable{
 /*The jion() method causes the currently running threads to stop executing
    until the thread it joins with completes its task.*/
    public static void main(String[] args) {
        try{
            Thread t=new Thread(new TestJoin());
            t.start();
            System.out.println("Started");
            t.join();
            System.out.println("Complete");
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
    
    
    @Override
    public void run() {
        System.out.println("Running");
    }
    
}
