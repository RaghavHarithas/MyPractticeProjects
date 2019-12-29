package Threads.Interrupts;


/*
    Thread Interrupts:

    1) When we interrupt a a thread sleeping or a thread  that is waiting , the thread is interrupted and breaks out of lseeping/waiting state and Interrupted
    Exception is tthrown
    2) when we interrupt, a normal thread ....the interrupted flag is et...but thread continues to run

    Thread inettrupts can be achieveed by

    1) calling interrupt method
    2) checking isInteruupted(), to check whether  the thread is interrupted or not
    3) boolean interrupted...the falg is set when when therad is interrupted

 */

public class ThreadSleepingInterruptDemo {


    public static void main(String args[]){

        //

        Thread t1 = new Thread(){
            public void run(){
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println("Thread Interrupted "+ e);
                    throw new RuntimeException("Sleeping thread interrupted hence throwing execption");
                }
            }

        };

        t1.start();
        System.out.println("Interrupting sleeping thread");
        try{
            t1.interrupt();
        }catch(Exception e){
            System.out.println("Catching exception after inettrupting a sleeping thread");
        }

    }


}
