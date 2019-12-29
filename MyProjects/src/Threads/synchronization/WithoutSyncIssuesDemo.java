package Threads.synchronization;

public class WithoutSyncIssuesDemo {

    public static void main(String args[]){
        CommonResource commonResource = new CommonResource();
        Thread t1 = new Thread(){
                public void run(){
                   commonResource.printUnsynchronized(5);
                }

        };

        Thread t2 = new Thread(){
            public void run(){
                commonResource.printUnsynchronized(500);
            }
        };

        t1.start();
        t2.start();

    }
}
