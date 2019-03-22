
package ThreadExample;


public class SyncronizedExample extends Thread{
    public static void main(String[] args) {
        SyncronizedExample sc1=new SyncronizedExample();
        SyncronizedExample sc2=new SyncronizedExample();
        sc1.start();
        sc2.start();
    
    }
    
    static synchronized  void pirnt(){
        try{
            for(int i=0; i<5; i++){
                System.out.println(i);
                Thread.sleep((long)  (3000*Math.random()));
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
            
    }
    
    @Override
    public void run(){
        synchronized(this){
            pirnt();
        }
        
    }
}
