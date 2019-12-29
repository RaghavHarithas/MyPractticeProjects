package Threads;

public class DaemonThread implements  Runnable {


    @Override
    public void run() {
        for(int i=1;i<4;i++) {
            if (Thread.currentThread().isDaemon()) {
                System.out.println(" Daemon Thread work "+i);
            } else {
                System.out.println("User Thread work "+i);
            }

        }
    }


    public static void main(String args[]){
        DaemonThread daemonThread = new DaemonThread();
        Thread t1 = new Thread(daemonThread);
        Thread t2= new Thread(daemonThread);
        Thread t3 = new Thread(daemonThread);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

    }
}
