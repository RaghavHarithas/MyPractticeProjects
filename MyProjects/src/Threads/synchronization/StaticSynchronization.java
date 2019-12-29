package Threads.synchronization;

public class StaticSynchronization {

    public static void main(String args[]){
        Thread t1 = new Thread(){
            public void run(){
                CommonResource.printStatisSynhronized(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
               CommonResource.printStatisSynhronized(10);
            }
        };

        Thread t3 = new Thread(){
            public void run(){
                CommonResource.printStatisSynhronized(15);
            }
        };

        Thread t4 = new Thread(){
            public void run(){
                CommonResource.printStatisSynhronized(20);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
