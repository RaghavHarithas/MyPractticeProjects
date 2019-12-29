package Threads.synchronization;

/*
 Thread Synschorization is required ...from tow threads access on common shared resources

 without synscronization issues are
 1) inconsistency
 2) concurrenet access leads to thread interefence
 Synscronization solves both issues

 synchronization can be achieved  by
 using
 1) synchronized method
 2) synchronized block
 3) static sychronization
 */

public class CommonResource {

    /*
      Synschornized method
     */

    public  synchronized void printSynchronisedMethod(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
    }

    /*
       Unsynchronized
     */

    public   void printUnsynchronized(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
    }

    /*
       using syncronized block
     */

    public   void printSynchronizedBlock(int n){
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
            }
        }
    }

    /*
      static synchronization
     */

    public static void printStatisSynhronized(int n){

            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
            }
        }



}
