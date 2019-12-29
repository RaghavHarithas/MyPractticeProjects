package Threads;

/*
   Thread work on proirity based in scheduler it usees preemptive scheduling
   Therads with higher proiority runs first and lower priority threads run be in waiting statse...in  queue...
   after higher priority thred finishes...next higher priority threds take over...if all threads are in same pririty ...
   then threads are picked up in round robin manner

   there are 3 thread priorityies by default ..these are constants in Thread class

   1) MAX_PRIORITY=10
   2) NORM_PRORITY=5
   3)MIN_PRIORITY=1
 */

public class ThreadsWithProirity implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<4;i++){
            System.out.println("Thread name executing is "+ Thread.currentThread().getName()+" value is "+ i+ "Thread proirity is "+ Thread.currentThread().getPriority());
        }
    }

    public static void main(String args[]){
        ThreadsWithProirity threadsWithProirity = new ThreadsWithProirity();
        Thread t1 = new Thread(threadsWithProirity);
        t1.setPriority(8);
        Thread t2 = new Thread(threadsWithProirity);
        t1.start();
        t2.start();
    }
}
