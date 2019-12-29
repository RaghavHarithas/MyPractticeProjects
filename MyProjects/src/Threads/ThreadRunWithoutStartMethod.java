package Threads;

public class ThreadRunWithoutStartMethod  implements  Runnable{

    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
            System.out.println("Thread execution "+ name+" the variable is "+i);
        }
    }


    public static void main(String args){
        ThreadRunWithoutStartMethod threadRunWithoutStartMethod = new ThreadRunWithoutStartMethod();
        Thread t1 = new Thread(threadRunWithoutStartMethod,"First");
        Thread t2 = new Thread(threadRunWithoutStartMethod, "Second");
        t1.run();
        t2.run();
    }

}
