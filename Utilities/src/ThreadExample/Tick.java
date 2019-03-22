
package ThreadExample;


public class Tick implements Runnable{

    @Override
    public void run() {
        try{
            for(int i=0; i<20;i++){
                System.out.print("Tick ");
                Thread.sleep(500);
                synchronized(Core.LOCK){
                    Core.LOCK.notify();
                    Core.LOCK.wait();
                }
            }
        }catch(InterruptedException e){
            
        }
    }
    
}
