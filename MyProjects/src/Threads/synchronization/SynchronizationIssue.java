package Threads.synchronization;

public class SynchronizationIssue {

    public static void main(String args[]){

        CommonResource commonResource1 = new CommonResource();
        CommonResource commonResource2 = new CommonResource();
        Thread t1 = new Thread(){
            public void run(){
              commonResource1.printSynchronisedMethod(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                commonResource1.printSynchronisedMethod(10);
            }
        };
        Thread t3 = new Thread(){
            public void run(){
                commonResource2.printSynchronisedMethod(20);
            }
        };

        Thread t4 = new Thread(){
            public void run(){
                commonResource2.printSynchronisedMethod(30);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();;
    }
}
