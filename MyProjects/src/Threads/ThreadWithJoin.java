package Threads;

public class ThreadWithJoin implements Runnable {
    @Override
    public void run() {
        String theradName = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {
//           try{
//               Thread.sleep(500);
//           }catch (Exception e){
//
//           }
            System.out.println("Thread that is executing is " + theradName + " the value is " + i);
        }
    }


    public static void main(String args[]) {
        ThreadWithJoin threadWithJoin = new ThreadWithJoin();
        Thread t1 = new Thread(threadWithJoin);
        Thread t2 = new Thread(threadWithJoin);
        Thread t3 = new Thread(threadWithJoin);
        t1.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {

        }
        t2.start();
        t3.start();
    }
}
