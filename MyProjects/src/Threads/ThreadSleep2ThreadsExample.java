package Threads;

/*

    Theads sleep caused thread to puase execution for sometime

 */

public class ThreadSleep2ThreadsExample implements  Runnable {

    public void run(){
        String name =  Thread.currentThread().getName();
        for(int i=1; i< 5;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            System.out.println("Thread "+name+" count is "+i);
        }
    }

    public static void main(String args[]){
        ThreadSleep2ThreadsExample threadSleep2ThreadsExample = new ThreadSleep2ThreadsExample();
        Thread t1 = new Thread(threadSleep2ThreadsExample);
        Thread t2= new Thread(threadSleep2ThreadsExample);
        t1.run();
        t2.run();

    }


}
