
package ThreadExample;


public class ThreadComwait_notify {
    int amount=10000;
    
    synchronized void withdraw(int amount){
        System.out.println("withdraw....");
        
        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit....");
            try{
                wait();
            }catch(Exception e){
                
            }
        }
        this.amount -=amount;
    }
    
    synchronized void deposit(int amount){
        System.out.println("deposit....");
        this.amount +=amount;
        System.out.println("deposit completed....");
        System.out.println("Current Balance="+this.amount);
        
        notify();
    }
    
    public static void main(String[] args) {
        final ThreadComwait_notify c=new ThreadComwait_notify();
        new Thread(){
            @Override
            public void run(){
               c.withdraw(15000);
            }
        }.start();
        
         new Thread(){
            @Override
            public void run(){
               c.deposit(15000);
            }
        }.start();
        
    }
}
