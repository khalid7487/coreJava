
package ThreadExample;

class NewThread2  extends Thread{

    public NewThread2() {
        //Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " +this);
        this.start();
    }
    //this is the entry point for the second thread.
    @Override
    public void run(){
        try{
            for(int i=5; i>0;i--){
                System.out.println("Child Thread: "+i);
                sleep(500);
            }
        }catch(InterruptedException  e){
            System.out.println("Child interrupted");   
        }
        System.out.println("Exiting child thread.");
    }
}
class ExtendThreadExample {
    public static void main(String[] args) {
        new NewThread2();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread: " +i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
