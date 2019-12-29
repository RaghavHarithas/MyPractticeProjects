package Threads.Interrupts;

public class ThreadInterruptNormalDemo {

    public static void main(String args[]){
        Runnable r = new Runnable(){
            public void run(){
                if(Thread.interrupted()){
                    System.out.println("Code for therad interruption");
                }else{
                    System.out.println("Code for normal thread execution");
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t1.interrupt();
        t2.start();



    }
}
